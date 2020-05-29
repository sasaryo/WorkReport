/**
 *
 */
package com.example.demo.work.report.controller;

import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.work.report.domain.model.User;
import com.example.demo.work.report.domain.model.WorkStyle;
import com.example.demo.work.report.domain.service.mybatis.UserServiceMybatisImpl;

/**
 * @author 佐々木亮
 *
 */
@Controller
public class HomeController {
    @Autowired
    UserServiceMybatisImpl userService;

	// プルダウンリストの実装(勤務種別)
	private Map<Integer, String>pulldownWorkStyle;

	// プルダウンリスト(勤務種別)の初期化メソッド
	private Map<Integer, String>initPulldownWorkStyle() {
		Map<Integer, String>pulldown = new LinkedHashMap<>();

		List<WorkStyle> workStyle = userService.workStyleSelect();

		// DBから取得した勤務種別をMapに格納
		for (int i = 0; i < workStyle.size(); i++) {
			pulldown.put(workStyle.get(i).getWorkStyleId(), workStyle.get(i).getWorkStyleName());
		}
		return pulldown;
	}

    //ユーザー一覧画面のGET用メソッド.
    @GetMapping("/home")
    public String getHome(Model model) {

        //コンテンツ部分にユーザー詳細を表示するための文字列を登録
        model.addAttribute("contents", "work/report/home :: home_contents");

        return "work/report/homeLayout";
    }

    // ユーザー一覧画面のGET用メソッド
    @GetMapping("/todayReport")
    public String getTodayReport(Model model) {
    	// コンテンツ部分にユーザー一覧を表示させるもの文字列を登録
    	model.addAttribute("contents", "work/report/todayReport::todayReport_contents");

    	// 暫定
    	String userId = "sasaki";

    	// 今日の日付
    	Calendar cl = Calendar.getInstance();
    	String today = cl.getTime().toString();

    	model.addAttribute("today", today);

    	// プルダウンの初期化メソッド呼び出し
    	pulldownWorkStyle = initPulldownWorkStyle();

    	// プルダウンのMAPを登録
    	model.addAttribute("pulldownWorkStyle", pulldownWorkStyle);

    	// ユーザー情報を取得
    	User user = userService.userSelectOne(userId);

    	// ユーザー情報を登録
    	model.addAttribute("user", user);

    	return "work/report/homeLayout";
    }
}
