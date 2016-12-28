package io.gs2.key;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import io.gs2.AbstractGs2Client;
import io.gs2.Gs2Constant;
import io.gs2.key.control.CreateKeyRequest;
import io.gs2.key.control.CreateKeyResult;
import io.gs2.key.control.DecryptRequest;
import io.gs2.key.control.DecryptResult;
import io.gs2.key.control.DeleteKeyRequest;
import io.gs2.key.control.DescribeKeyRequest;
import io.gs2.key.control.DescribeKeyResult;
import io.gs2.key.control.EncryptRequest;
import io.gs2.key.control.EncryptResult;
import io.gs2.model.IGs2Credential;

/**
 * GS2 Key API クライアント
 * 
 * @author Game Server Services, Inc.
 *
 */
public class Gs2KeyClient extends AbstractGs2Client<Gs2KeyClient> {

	public static String ENDPOINT = "key";
	
	/**
	 * コンストラクタ。
	 * 
	 * @param credential 認証情報
	 */
	public Gs2KeyClient(IGs2Credential credential) {
		super(credential);
	}

	/**
	 * 暗号鍵を作成。
	 * 
	 * @param request リクエストパラメータ
	 * @return 作成結果
	 */
	public CreateKeyResult createKey(CreateKeyRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("name", request.getName());
		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/key", 
				credential, 
				ENDPOINT,
				CreateKeyRequest.Constant.MODULE, 
				CreateKeyRequest.Constant.FUNCTION,
				body.toString());
		return doRequest(post, CreateKeyResult.class);
	}
	
	/**
	 * 暗号鍵一覧を取得。
	 * 
	 * @param request リクエストパラメータ
	 * @return 暗号鍵一覧
	 */
	public DescribeKeyResult describeKey(DescribeKeyRequest request) {
		String url = Gs2Constant.ENDPOINT_HOST + "/key";
		List<NameValuePair> queryString = new ArrayList<>();
		if(request.getLimit() != null) queryString.add(new BasicNameValuePair("limit", String.valueOf(request.getLimit())));
		if(request.getPageToken() != null) queryString.add(new BasicNameValuePair("pageToken", request.getPageToken()));
		if(queryString.size() > 0) {
			url += "?" + URLEncodedUtils.format(queryString, "UTF-8");
		}
		HttpGet get = createHttpGet(
				url, 
				credential, 
				ENDPOINT,
				DescribeKeyRequest.Constant.MODULE, 
				DescribeKeyRequest.Constant.FUNCTION);
		return doRequest(get, DescribeKeyResult.class);
	}

	/**
	 * 暗号鍵を削除。
	 * 
	 * @param request リクエストパラメータ
	 */
	public void deleteKey(DeleteKeyRequest request) {
		HttpDelete delete = createHttpDelete(
				Gs2Constant.ENDPOINT_HOST + "/key/" + request.getKeyName(), 
				credential, 
				ENDPOINT,
				DeleteKeyRequest.Constant.MODULE, 
				DeleteKeyRequest.Constant.FUNCTION);
		doRequest(delete, null);
	}

	/**
	 * 暗号化を実行。
	 * 
	 * @param request リクエストパラメータ
	 * @return 暗号化結果
	 */
	public EncryptResult encrypt(EncryptRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("data", request.getData());
		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/key/" + request.getKeyName() + "/encrypt", 
				credential, 
				ENDPOINT,
				EncryptRequest.Constant.MODULE, 
				EncryptRequest.Constant.FUNCTION,
				body.toString());
		return doRequest(post, EncryptResult.class);
	}

	/**
	 * 復号化を実行。
	 * 
	 * @param request リクエストパラメータ
	 * @return 復号化結果
	 */
	public DecryptResult decrypt(DecryptRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("data", request.getData());
		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/key/" + request.getKeyName() + "/decrypt", 
				credential, 
				ENDPOINT,
				DecryptRequest.Constant.MODULE, 
				DecryptRequest.Constant.FUNCTION,
				body.toString());
		return doRequest(post, DecryptResult.class);
	}
	
}
