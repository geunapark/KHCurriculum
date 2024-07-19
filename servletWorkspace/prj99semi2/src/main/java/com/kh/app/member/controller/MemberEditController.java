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

@WebServlet("/member/edit")
public class MemberEditController extends HttpServlet {
	
	// 회원정보 수정 화면 (마이페이지)
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			// 세션에서 로그인한 회원 정보 가져오기
			HttpSession session = req.getSession();
			MemberVo loginMemberVo = (MemberVo) session.getAttribute("loginMemberVo");
			
			// 로그인 여부 확인
			if(loginMemberVo == null) {
				throw new Exception("로그인 후 이용해주세요.");
			}
			
			// 회원정보 수정 화면으로 포워딩
			req.getRequestDispatcher("/WEB-INF/views/member/edit.jsp").forward(req, resp);
			
		} catch(Exception e) {
			e.printStackTrace();
			
			// 예외 발생 시 에러 메시지를 설정하고 에러 페이지로 포워딩
			req.setAttribute("errMsg", e.getMessage());
			req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);
		}
	}
	
	// 회원정보 수정 처리
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			// 세션에서 로그인한 회원 정보 가져오기
			HttpSession session = req.getSession();
			MemberVo loginMemberVo = (MemberVo) session.getAttribute("loginMemberVo");
			
			// 로그인 회원의 회원번호 가져오기
			String no = loginMemberVo.getNo();
			
			// 폼 데이터에서 수정할 회원 정보 가져오기
			String id = req.getParameter("id");
			String pwd = req.getParameter("pwd");
			String pwd2 = req.getParameter("pwd2");
			String nick = req.getParameter("nick");
			
			// 수정할 회원 정보 설정
			MemberVo vo = new MemberVo();
			vo.setNo(no);
			vo.setId(id);
			vo.setPwd(pwd);
			vo.setPwd2(pwd2);
			vo.setNick(nick);
			
			// 회원 정보 수정을 위한 서비스 호출
			MemberService ms = new MemberService();
			int result = ms.edit(vo);
			
			// 수정 결과 확인
			if(result != 1) {
				throw new Exception("회원정보 수정 실패");
			}
			
			// 회원정보 수정 성공 시 세션 메시지 설정 및 로그인 회원 정보 삭제 후 홈페이지로 리다이렉트
			session.setAttribute("alertMsg", "회원정보 수정 성공!");
			session.removeAttribute("loginMemberVo");
			resp.sendRedirect("/app/home");
			
		} catch(Exception e) {
			e.printStackTrace();
			
			// 예외 발생 시 에러 메시지를 설정하고 에러 페이지로 포워딩
			req.setAttribute("errMsg", "회원정보 수정 중 오류 발생");
			req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);
		}
	}
}