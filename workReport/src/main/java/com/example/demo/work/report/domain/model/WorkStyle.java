/**
 *
 */
package com.example.demo.work.report.domain.model;

import java.sql.Time;

import lombok.Data;

/**
 * @author 佐々木亮
 *
 */
@Data
public class WorkStyle {
	private int workStyleId;		// 勤務形態ID
	private String workStyleName;		// 勤務形態名
	private Time workStartTime;		// 勤務開始時刻
	private Time workEndTime;		// 勤務終了時刻
	private String breakTime;		// 休憩時間
}
