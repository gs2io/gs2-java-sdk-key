package io.gs2.key.control;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 復号化結果。
 * 
 * @author Game Server Services, Inc.
 *
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class DecryptResult {
	
	/** 復号化済みデータ */
	String data;

	/**
	 * 復号化済みデータを取得
	 * 
	 * @return 復号化済みデータ
	 */
	public String getData() {
		return data;
	}

	/**
	 * 復号化済みデータを設定
	 * 
	 * @param data 復号化済みデータ
	 */
	public void setData(String data) {
		this.data = data;
	}
}
