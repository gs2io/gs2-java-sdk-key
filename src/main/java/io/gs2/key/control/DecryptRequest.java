package io.gs2.key.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.key.Gs2Key;

/**
 * 復号化リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class DecryptRequest extends Gs2BasicRequest<DecryptRequest> {

	public static class Constant extends Gs2Key.Constant {
		public static final String FUNCTION = "Decrypt";
	}
	
	/** 暗号鍵名 */
	String keyName;
	/** 復号化するデータ */
	String data;
	
	/**
	 * 暗号鍵名を取得。
	 * 
	 * @return 暗号鍵名
	 */
	public String getKeyName() {
		return keyName;
	}
	
	/**
	 * 暗号鍵名を設定。
	 * 
	 * @param name 暗号鍵名
	 */
	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}
	
	/**
	 * 暗号鍵名を設定。
	 * 
	 * @param name 暗号鍵名
	 * @return this
	 */
	public DecryptRequest withKeyName(String keyName) {
		setKeyName(keyName);
		return this;
	}
	
	/**
	 * 復号化するデータを取得。
	 * 
	 * @return 復号化するデータ
	 */
	public String getData() {
		return data;
	}
	
	/**
	 * 復号化するデータを設定。
	 * 
	 * @param data 復号化するデータ
	 */
	public void setData(String data) {
		this.data = data;
	}
	
	/**
	 * 復号化するデータを設定。
	 * 
	 * @param data 復号化するデータ
	 * @return this
	 */
	public DecryptRequest withData(String data) {
		setData(data);
		return this;
	}
}
