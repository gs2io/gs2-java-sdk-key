package io.gs2.key.control;

import io.gs2.control.Gs2BasicRequest;
import io.gs2.key.Gs2Key;

/**
 * 暗号鍵の作成リクエスト。
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
public class CreateKeyRequest extends Gs2BasicRequest<CreateKeyRequest> {

	public static class Constant extends Gs2Key.Constant {
		public static final String FUNCTION = "CreateKey";
	}
	
	/** 暗号鍵名 */
	String name;
	
	/**
	 * 暗号鍵名を取得。
	 * 
	 * @return 暗号鍵名
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 暗号鍵名を設定。
	 * 
	 * @param name 暗号鍵名
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 暗号鍵名を設定。
	 * 
	 * @param name 暗号鍵名
	 * @return this
	 */
	public CreateKeyRequest withName(String name) {
		setName(name);
		return this;
	}
}
