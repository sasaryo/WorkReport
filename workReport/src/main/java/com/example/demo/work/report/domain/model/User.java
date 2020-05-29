/**
 *
 */
package com.example.demo.work.report.domain.model;

import lombok.Data;

/**
 * @author 佐々木亮
 *
 */
@Data
public class User {
	private String userId;		// ユーザーID
	private String userName;	// ユーザー名
	private String password;	// パスワード
	private String role;		// ロール
}
