package com.kh.app.member.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.kh.app.member.service.MemberService;
import com.kh.app.member.vo.MemberVo;

// 파일 업로드를 위한 MultipartConfig 어노테이션 선언
@MultipartConfig(maxFileSize = 1024 * 1024 * 10, maxRequestSize = 1024 * 1024 * 50, fileSizeThreshold = 1024 * 1024 * 10)
// "/member/join" URL에 대한 매핑을 처리하는 서블릿
@WebServlet("/member/join")
public class MemberJoinController extends HttpServlet {

	// 회원가입 화면 요청(GET 방식)을 처리하는 메서드
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 회원가입 화면으로 포워드
		req.getRequestDispatcher("/WEB-INF/views/member/join.jsp").forward(req, resp);
	}

	// 회원가입 데이터를 받아 처리(POST 방식)하는 메서드
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			// 데이터 받아오기
			String id = req.getParameter("id"); // 아이디
			String pwd = req.getParameter("pwd"); // 비밀번호
			String pwd2 = req.getParameter("pwd2"); // 비밀번호 확인
			String nick = req.getParameter("nick"); // 닉네임
			Part profile = req.getPart("profile"); // 프로필 이미지

			String changeName = ""; // 변경된 파일 이름을 저장할 변수

			if (profile.getSize() > 0) {
				// 파일을 서버에 저장하기
				String originFileName = profile.getSubmittedFileName(); // 업로드한 파일명
				InputStream is = profile.getInputStream(); // 파일 입력 스트림

				String path = "D:\\dev\\servletWorkspace\\prj99semi\\src\\main\\webapp\\resources\\upload\\"; // 파일 저장 경로
				String random = UUID.randomUUID().toString(); // 랜덤 문자열 생성
				String ext = originFileName.substring(originFileName.lastIndexOf(".")); // 파일 확장자 추출
				changeName = System.currentTimeMillis() + "_" + random + ext; // 변경할 파일 이름 생성
				FileOutputStream fos = new FileOutputStream(path + changeName); // 파일 출력 스트림

				byte[] buf = new byte[1024];
				int size = 0;
				while ((size = is.read(buf)) != -1) {
					fos.write(buf, 0, size); // 파일 쓰기
				}

				is.close(); // 입력 스트림 닫기
				fos.close(); // 출력 스트림 닫기
			}

			// 회원 정보를 MemberVo 객체에 담기
			MemberVo vo = new MemberVo();
			vo.setId(id); // 아이디 설정
			vo.setPwd(pwd); // 비밀번호 설정
			vo.setPwd2(pwd2); // 비밀번호 확인 설정
			vo.setNick(nick); // 닉네임 설정
			vo.setProfile(changeName); // 프로필 이미지 설정

			// 회원가입 서비스 호출
			MemberService ms = new MemberService();
			int result = ms.join(vo); // 회원가입 결과

			// 결과 처리
			if (result == 1) {
				req.setAttribute("resultMsg", "회원가입 성공 !!!"); // 성공 메시지 설정
			} else {
				req.setAttribute("resultMsg", "회원가입 실패 ..."); // 실패 메시지 설정
			}
			// 회원가입 성공 후 로그인 화면으로 리다이렉트
			resp.sendRedirect("/app/member/login");
		} catch (Exception e) {
			System.out.println("[ERROR-M0001] " + e.getMessage());
			e.printStackTrace();
			req.setAttribute("errMsg", e.getMessage()); // 에러 메시지 설정
			req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp); // 에러 페이지로 포워드
		}

	}// method

}// class
