package com.kh.baemin.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.baemin.app.member.vo.MemberVo;
import com.kh.baemin.member.service.MemberService;

@WebServlet("/member/join")
public class MemberJoinController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/member/join.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	//데이터 추출 회원가입 과정에서 사용자가 입력한 데이터를 서버에서 처리하는 것은 폼 데이터를 처리하는 것입니다
		String id= req.getParameter("id");
		String pwd =req.getParameter("pwd");
		String nick = req.getParameter("nickName");
		String phone = req.getParameter("phone");
		String address =req.getParameter("address");
		String addressDetail =req.getParameter("AddressDetail");
		String generation = req.getParameter("generation");
		String gender = req.getParameter("gender");
		String profile = req.getParameter("profile");
	
	//데이터 객체 
		MemberVo vo =new MemberVo();
		vo.setId(id);
		vo.setPwd(pwd);
		vo.setNick(nick);
		vo.setPhone(phone);
		vo.setAddress(address);
		vo.setGeneration(generation);
		vo.setGender(gender);
		vo.setAddressDetail(addressDetail);
		vo.setProfile(profile);
		
		
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


