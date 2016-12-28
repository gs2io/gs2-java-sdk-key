package io.gs2.key.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 暗号鍵
 * 
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Key implements Serializable {

	/** 暗号鍵ID */
	String keyId;
	/** オーナーID */
	String ownerId;
	/** 暗号鍵名 */
	String name;
	/** 作成日時 */
	Long createAt;
	
	/**
	 * 暗号鍵IDを取得
	 * 
	 * @return 暗号鍵ID
	 */
	public String getKeyId() {
		return keyId;
	}
	
	/**
	 * 暗号鍵IDを設定
	 * 
	 * @param keyId 暗号鍵ID
	 */
	public void setKeyId(String keyId) {
		this.keyId = keyId;
	}
	
	/**
	 * オーナーIDを取得
	 * 
	 * @return オーナーID
	 */
	public String getOwnerId() {
		return ownerId;
	}
	
	/**
	 * オーナーIDを設定
	 * 
	 * @param ownerId オーナーID
	 */
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}
	
	/**
	 * 暗号鍵名を取得
	 * 
	 * @return 暗号鍵名
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 暗号鍵名を設定
	 * 
	 * @param name 暗号鍵名
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 作成日時を取得
	 * 
	 * @return 作成日時
	 */
	public Long getCreateAt() {
		return createAt;
	}
	
	/**
	 * 作成日時を設定
	 * 
	 * @param createAt 作成日時
	 */
	public void setCreateAt(Long createAt) {
		this.createAt = createAt;
	}
}
