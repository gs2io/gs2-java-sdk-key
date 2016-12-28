package io.gs2.key.control;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.gs2.key.model.Key;

/**
 * 暗号鍵一覧取得結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class DescribeKeyResult {

	/** 暗号鍵一覧 */
	List<Key> items;
	/** 次のページを取得するためのトークン */
	String nextPageToken;
	
	/**
	 * 取得した暗号鍵数を取得。
	 * 
	 * @return 取得した暗号鍵数
	 */
	public Integer getCount() {
		return items == null ? null : items.size();
	}
	
	@Deprecated
	public void setCount(Integer count){ }
	
	/**
	 * 取得した暗号鍵一覧を取得。
	 * 
	 * @return 暗号鍵一覧
	 */
	public List<Key> getItems() {
		return items;
	}
	
	/**
	 * 暗号鍵一覧を設定。
	 * 
	 * @param items 暗号鍵一覧
	 */
	public void setItems(List<Key> items) {
		this.items = items;
	}
	
	/**
	 * 次のページを取得するためのトークンを取得。
	 * 
	 * {@link DescribeKeyRequest} に指定することで、次のページを取得できます。
	 * 
	 * @return トークン
	 */
	public String getNextPageToken() {
		return nextPageToken;
	}
	
	public void setNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
	}
}
