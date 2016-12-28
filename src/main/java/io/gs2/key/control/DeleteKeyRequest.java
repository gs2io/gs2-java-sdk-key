package io.gs2.key.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.key.Gs2Key;

/**
 * 暗号鍵の削除リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class DeleteKeyRequest extends Gs2BasicRequest<DeleteKeyRequest> {

	public static class Constant extends Gs2Key.Constant {
		public static final String FUNCTION = "DeleteKey";
	}
	
	/** 暗号鍵名 */
	String keyName;
	
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
	public DeleteKeyRequest withKeyName(String keyName) {
		setKeyName(keyName);
		return this;
	}
}
