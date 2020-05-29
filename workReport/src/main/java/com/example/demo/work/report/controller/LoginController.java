/**
 *
 */
package com.example.demo.work.report.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author 佐々木亮
 *
 */
@Controller
public class LoginController {
	// ログイン画面のGET用コントローラー
	@GetMapping("/login")
	public String getLogin(Model model) {
		// login.html に 画面 遷移
		return "work/report/login";
	}
	// ログイン画面のPOST用コントローラー
	@PostMapping("/login")
	public String postLogin(Model model) {
		// ホーム画面に遷移
		return "redirect:/home";
	}
}
