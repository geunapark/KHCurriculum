

package com.kh.app.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.app.member.service.MemberService;
import com.kh.app.member.vo.MemberVo;

@WebServlet("/member/login")
public class MemberLoginController extends HttpServlet {
	
	// 로그인 화면 요청 처리
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 로그인 화면으로 포워딩
		req.getRequestDispatcher("/WEB-INF/views/member/login.jsp").forward(req, resp);
	}
	
	// 로그인 처리
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			// 세션
			HttpSession session = req.getSession();
			
			// 데이터 꺼내기
			String id = req.getParameter("id");
			String pwd = req.getParameter("pwd");
			
			// 회원 정보 VO 객체 생성 및 데이터 설정
			MemberVo vo = new MemberVo();
			vo.setId(id);
			vo.setPwd(pwd);
			
			// 로그인 서비스 호출
			MemberService ms = new MemberService();
			MemberVo loginMemberVo = ms.login(vo);
			
			// 로그인 결과 처리
			if(loginMemberVo != null) {
				// 로그인 성공 시 세션에 로그인 회원 정보 설정
				session.setAttribute("alertMsg", "로그인 성공!!!");
				session.setAttribute("loginMemberVo", loginMemberVo);
			} else {
				// 로그인 실패 시 메시지 설정
			//req.setAttribute("resultMsg", "로그인 실패...");
				session.setAttribute("alertMsg", "로그인 실패");
			}
			
			// 홈페이지로 리다이렉트
			resp.sendRedirect("/app/home");
			
		} catch(Exception e) {
			// 예외 처리
			e.printStackTrace();
			req.setAttribute("errMsg", "[ERROR-M0002] 로그인 중 에러 발생...");
			req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);
		}
	}

}