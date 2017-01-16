package io.gs2.key.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.key.Gs2Key;

/**
 * 暗号化リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class EncryptRequest extends Gs2BasicRequest<EncryptRequest> {

	public static class Constant extends Gs2Key.Constant {
		public static final String FUNCTION = "Encrypt";
	}
	
	/** 暗号鍵名 */
	String keyName;
	/** 暗号化するデータ */
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
	 * @param keyName 暗号鍵名
	 */
	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}
	
	/**
	 * 暗号鍵名を設定。
	 * 
	 * @param keyName 暗号鍵名
	 * @return this
	 */
	public EncryptRequest withKeyName(String keyName) {
		setKeyName(keyName);
		return this;
	}
	
	/**
	 * 暗号化するデータを取得。
	 * 
	 * @return 暗号化するデータ
	 */
	public String getData() {
		return data;
	}
	
	/**
	 * 暗号化するデータを設定。
	 * 
	 * @param data 暗号化するデータ
	 */
	public void setData(String data) {
		this.data = data;
	}
	
	/**
	 * 暗号化するデータを設定。
	 * 
	 * @param data 暗号化するデータ
	 * @return this
	 */
	public EncryptRequest withData(String data) {
		setData(data);
		return this;
	}
}
