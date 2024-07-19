package com.kh.app.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.member.service.MemberService;
import com.kh.app.member.vo.MemberVo;

@WebServlet("/member/login")
public class MemberLoginController extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/member/login.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		req.setCharacterEncoding("UTF-8");
		String memberId = req.getParameter("memberId");
		String memberPwd = req.getParameter("memberPwd");

		// 데이터 뭉치기
		MemberVo vo = new MemberVo();
		vo.setMemberId(memberId);
		vo.setMemberPwd(memberPwd);

		// 복잡한 작업
		MemberService ms = new MemberService();
		MemberVo loginMemberVo = null;
		try {
			loginMemberVo = ms.login(vo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			req.setAttribute("errMsg", "로그인 하는중! 에러 ! 발생");
			req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);
			return;
		}
		//아디 중복해야하지 않으니까 행이 하나만 vo로 바꿔서 그 vo로 가지고
		
		//결과
		if(loginMemberVo!=null) {
		req.setAttribute("msg", "로그인 성공");
		}else {
			req.setAttribute("msg", "로그인 실패");
		}
		req.getRequestDispatcher("/WEB-INF/views/common/result.jsp").forward(req, resp);

		// 결과
	}
}