package com.kh.member.comtroller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member/login2")
public class MemberController2  extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("로그인 요청 들어옴~");
		
		String memberId = req.getParameter("memberId");
		String memberPwd = req.getParameter("memberPwd");
		
		//복잡한 작업 id = user01 이고 pwd가 1234이면 로그인성공으로 간주하기
		//통로만들기
		PrintWriter out = resp.getWriter();
		
		
		if("1234".equals(memberId) && "1234".equals(memberPwd)) {
			req.getRequestDispatcher("/WEB-INF/views/common/result.jsp").forward(req, resp);
		}else {
			req.getRequestDispatcher("/WEB-INF/views/common/result.jsp").forward(req, resp);
			
		}
		
	}
}
