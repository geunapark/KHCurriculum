package com.kh.app.home.member.vo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.member.controller.MemberVo;

@WebServlet
public class MemberJoinController2 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//데이터 꺼내기
		String memberId = req.getParameter("memberId");
		String memberpwd = req.getParameter("memberPwd");
		String memberpwdCheck = req.getParameter("memberPwdCheck");
		String memberNick = req.getParameter("memberNick");
		
		//데이터 뭉치기
		MemberVo vo = new MemberVo(memberId,memberPwd,memberNick);

		String pwd1 = req.getParameter("memberPwd");
		String pwd2 = req.getParameter("memberPwdCheck");
		String msg = "";
		if(pwd1.equals(pwd2)) {
			msg ="성공";
		}else {
			msg="실패";
		}
		req.setAttribute("x", msg);
		
		//결과처리
		req.getRequestDispatcher(msg)