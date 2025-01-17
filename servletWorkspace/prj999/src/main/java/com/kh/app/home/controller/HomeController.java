package com.kh.app.home.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.member.controller.MemberController;

@WebServlet("/*")
public class HomeController extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("HomeController.service() called...");

		// 현재 요청의 URI를 문자열로 변환하여 저장합니다.
		String url = req.getRequestURI().toString();
		System.out.println("url : " + url); // 변환된 URI를 출력합니다.

		// 현재 요청의 HTTP 메서드(GET, POST 등)를 문자열로 변환하여 저장합니다.
		String method = req.getMethod();
		System.out.println("method : " + method); // 변환된 메서드를 출력합니다.

		MemberController mc = new MemberController();

		String str = "";
		// 요청 URI가 "member/login"으로 끝나는지 확인합니다.
		if (url.endsWith("member/login")) {
			str = mc.login();
		} else if (url.endsWith("member/join")) {
			// 요청 URI가 "member/join"으로 끝나는지 확인합니다.
			// "member/join"으로 끝나는 경우 처리할 코드 작성
			str = mc.join();
			
			req.getRequestDispatcher("/WEB-INF/views/"+ str +".jsp").forward(req, resp);
		}

	}

}
