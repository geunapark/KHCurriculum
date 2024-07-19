package com.kh.app.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.board.service.BoardService;
import com.kh.app.board.vo.BoardVo;

@WebServlet("/board/insert")
public class BoardInsertController extends HttpServlet {
	
	// 게시글 작성 화면을 요청받아 처리하는 메서드 (GET 요청)
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/board/insert.jsp").forward(req, resp); // 게시글 작성 화면으로 포워딩
	}
	
	// 게시글 작성을 요청받아 처리하는 메서드 (POST 요청)
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 요청 데이터 가져오기
//		req.setCharacterEncoding("UTF-8"); // POST 요청 시 한글 처리를 위한 인코딩 설정 (주석 처리된 부분)

		String title = req.getParameter("title"); // 제목 가져오기
		String content = req.getParameter("content"); // 내용 가져오기
		
		// 데이터 객체 생성 및 설정
		BoardVo vo = new BoardVo(); // 게시글 데이터를 담을 BoardVo 객체 생성
		vo.setTitle(title); // 제목 설정
		vo.setContent(content); // 내용 설정
		
		// 복잡한 작업 수행을 위해 BoardService 객체 생성
		BoardService bs = new BoardService();
		int result = 0;
		try {
			result = bs.insert(vo); // 게시글 작성 요청 및 결과 반환
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("errMsg", "게시글 작성 중 에러 발생!"); // 에러 메시지 설정
			req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp); // 에러 페이지로 포워딩
		}
		
		// 작업 결과에 따라 메시지 설정
		if(result == 1) {
			req.setAttribute("msg", "게시글 작성 성공!"); // 성공 메시지 설정
		} else {
			req.setAttribute("msg", "게시글 작성 실패..."); // 실패 메시지 설정
		}
		
		req.getRequestDispatcher("/WEB-INF/views/common/result.jsp").forward(req, resp); // 결과 페이지로 포워딩
	}//method

}//class