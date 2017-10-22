package io.gs2.key.control;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.gs2.key.model.Key;

/**
 * 暗号鍵の作成結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class GetKeyResult {
	
	Key item;
	
	/**
	 * 暗号鍵を取得。
	 * 
	 * @return 暗号鍵
	 */
	public Key getItem() {
		return item;
	}
	
	/**
	 * 暗号鍵を設定。
	 * 
	 * @param item 暗号鍵
	 */
	public void setItem(Key item) {
		this.item = item;
	}
	
	/**
	 * 暗号鍵を設定。
	 * 
	 * @param item 暗号鍵
	 * @return this
	 */
	public GetKeyResult withItem(Key item) {
		setItem(item);
		return this;
	}
}
