package com.kh.app.member.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.db.JDBCTemplate;
import com.kh.app.member.service.MemberService;
import com.kh.app.member.vo.MemberVo;

@WebServlet("/member/join")
public class MemberJoginController extends HttpServlet {

	// 회원가입 화면을 GET 요청으로 처리하는 메서드
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    req.getRequestDispatcher("/WEB-INF/views/member/join.jsp").forward(req, resp); // 회원가입 화면으로 포워딩
	}

	// 회원가입 요청을 POST 요청으로 처리하는 메서드
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    // 요청 데이터 추출하기
	    String memberId = req.getParameter("memberId"); // 회원 아이디 가져오기
	    String memberPwd = req.getParameter("memberPwd"); // 회원 비밀번호 가져오기
	    String memberPwd2 = req.getParameter("memberPwd2"); // 비밀번호 확인 값 가져오기
	    String memberNick = req.getParameter("memberNick"); // 회원 닉네임 가져오기
	    
	    // 회원 데이터 객체 생성 및 설정
	    MemberVo vo = new MemberVo(); // 회원 정보를 담을 MemberVo 객체 생성
	    vo.setMemberId(memberId); // 회원 아이디 설정
	    vo.setMemberPwd(memberPwd); // 회원 비밀번호 설정
	    vo.setMemberPwd2(memberPwd2); // 비밀번호 확인 값 설정
	    vo.setMemberNick(memberNick); // 회원 닉네임 설정
	    
	    MemberService ms = new MemberService(); // MemberService 객체 생성
	    int result = 0; // 회원 가입 결과를 저장할 변수 초기화
	    
	    try {
	        result = ms.join(vo); // 회원 가입 요청 처리 및 결과 반환
	    } catch (Exception e) {
	        e.printStackTrace(); // 예외 발생 시 스택 트레이스 출력
	        System.out.println("join 예외");
	    }
	    
	    // 회원 가입 결과에 따라 메시지 설정
	    if (result == 1) {
	        req.setAttribute("msg", "회원가입 성공"); // 회원 가입 성공 메시지 설정
	    } else {
	        req.setAttribute("msg", "회원가입 실패"); // 회원 가입 실패 메시지 설정
	    }
	    
	    req.getRequestDispatcher("/WEB-INF/views/common/result.jsp").forward(req, resp); // 결과 페이지로 포워딩
	}
}