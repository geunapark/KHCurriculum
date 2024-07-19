package com.kh.app.member.controller;

import java.io.File;
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
import javax.servlet.http.Part; // Part 클래스를 import 해야 합니다.

@MultipartConfig(maxFileSize = 1024 * 1024 * 10, // 최대 파일 크기 10MB
		maxRequestSize = 1024 * 1024 * 50, // 최대 요청 크기 50MB
		fileSizeThreshold = 1024 * 1024 * 10)
@WebServlet("/member/join")
public class MemberJoinController extends HttpServlet {

	// 회원가입 화면
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/member/join.jsp").forward(req, resp);
	}

	// 회원가입 처리
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		String nick = req.getParameter("nick");
		Part f = req.getPart("f");

		// 파일 데이터를 Part 객체로 받아옵니다.
		Part filePart = req.getPart("f"); // input의 name='f'인 파트를 가져옴
		System.out.println("id :" + id);
		System.out.println("pwd :" + pwd);
		System.out.println("nick :" + nick);
		System.out.println("f(part) :" + f);

		// 파일 객체 (part) 로부터 필요한 데이터를 꺼냄
		String originName = f.getSubmittedFileName();
		InputStream is = f.getInputStream();

		// 파일 아웃풋 스트림 준비
		String path = "D:\\dev\\servletWorkspace\\prj14upload\\src\\main\\webapp\\resources\\upload\\";
	      String random = UUID.randomUUID().toString();
	      String ext = originName.substring(originName.lastIndexOf("."));
	      String changeName = System.currentTimeMillis() + "_" + random + ext;
	      FileOutputStream fos = new FileOutputStream(path + changeName);
	      
		byte[] buf = new byte[1024];
		int size = 0;
		while ((size = is.read(buf)) != -1) {
			//담아 줄게 없으면 -1
			fos.write(buf, 0, size);
		}

		is.close();
		fos.close();
	}

	// 파일 처리 로직 (파일 저장 등)
	// 예: 파일을 서버에 저장하기
}
