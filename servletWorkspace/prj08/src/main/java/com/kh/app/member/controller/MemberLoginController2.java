package com.kh.app.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member/login2")
public class MemberLoginController2 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 req.getRequestDispatcher("/WEB-INF/views/member/login2.jsp").forward(req,resp);
		 
		 //데이터꺼내기
		 String memberId =req.getParameter("memberId");
		 String memberPwd =req.getParameter("memberPwd");
		 //복잡한 작업
		 String msg= "";
		 if("user01".equals(memberId) && "1234".equals(memberPwd)) {
			 msg ="로그인성공";
		 }else {
			 msg="로그인 실패";
		 }
		 req.setAttribute("x", msg);
		 //r에다 at담아주는건데 여기서 얻어낸 메세지 데이터를 
		 //화면에다 보여줄려고 문자열 내보내기할려고 필요한거 
		 //결과 ==문자열 내보내기
		 req.getRequestDispatcher("/WEB-INF/views/common/result.jsp").forward(req, resp);
	}
}
