/**
 *
 */
package com.example.demo.work.report.domain.model;

import java.sql.Time;
import java.util.Date;

import lombok.Data;

/**
 * @author 佐々木亮
 *
 */
@Data
public class WorkReport {
	private String userId;		// ユーザーID
	private Date workDay;		// 勤務日
	private int workStyleId;	// 勤務形態ID
	private Time workStartTime;	// 勤務開始時刻
	private Time workEndTime;	// 勤務終了時刻
}
