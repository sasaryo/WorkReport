/**
 *
 */
package com.example.demo.work.report.domain.service.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.work.report.domain.model.User;
import com.example.demo.work.report.domain.model.WorkReport;
import com.example.demo.work.report.domain.model.WorkStyle;
import com.example.demo.work.report.domain.repository.mybatis.UserMapper;
import com.example.demo.work.report.domain.service.UserService;

/**
 * @author 佐々木亮
 *
 */
@Transactional
@Service("UserServiceMybatisImpl")
public class UserServiceMybatisImpl implements UserService {
    @Autowired
    UserMapper userMapper;

	// ユーザー情報の1件検索
	public User userSelectOne(String userId) {
		return userMapper.userSelectOne(userId);
	}

	// 勤務情報取得
	public List<WorkReport> workReportSelect(String userId) {
		return userMapper.workReportSelect(userId);
	}

	// 勤務形態取得
	public List<WorkStyle> workStyleSelect() {
		return userMapper.workStyleSelect();
	}
}
