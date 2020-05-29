/**
 *
 */
package com.example.demo.work.report.domain.service;

import java.util.List;

import com.example.demo.work.report.domain.model.User;
import com.example.demo.work.report.domain.model.WorkReport;
import com.example.demo.work.report.domain.model.WorkStyle;

/**
 * @author 佐々木亮
 *
 */
public interface UserService {
	// ユーザー情報の1件検索
	public User userSelectOne(String userId);

	// 勤務情報取得
	public List<WorkReport> workReportSelect(String userId);

	// 勤務形態取得
	public List<WorkStyle> workStyleSelect();

}
