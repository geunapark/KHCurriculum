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

@WebServlet("/member/quit")
public class MemberQuitController extends HttpServlet {
	
	// 회원 탈퇴 처리
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			// 세션에서 로그인한 회원 정보 가져오기
			HttpSession session = req.getSession();
			MemberVo loginMemberVo = (MemberVo) session.getAttribute("loginMemberVo");
			
			// 로그인 회원의 회원번호 가져오기
			String no = loginMemberVo.getNo();
			
			// 회원 탈퇴 서비스 호출
			MemberService ms = new MemberService();
			int result = ms.quit(no);
			
			// 탈퇴 결과 처리
			if(result != 1) {
				throw new Exception("회원 탈퇴 실패...");
			}
			
			// 세션에서 로그인 회원 정보 제거 및 탈퇴 성공 메시지 설정
			session.removeAttribute("loginMemberVo");
			session.setAttribute("alertMsg", "회원 탈퇴 성공!");
			resp.sendRedirect("/app/home");
			
		} catch(Exception e) {
			// 예외 처리
			System.out.println(e.getMessage());
			e.printStackTrace();
			req.setAttribute("errMsg", e.getMessage());
			req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);
		}
	}
	
	// POST 요청 처리 (회원 탈퇴 시에는 주로 GET 요청을 사용하므로 doGet() 메서드 호출)
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp); // doGet() 메서드 호출
	}

}