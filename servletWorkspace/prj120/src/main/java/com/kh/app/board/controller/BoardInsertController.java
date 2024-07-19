package com.kh.app.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.board.dao.BoardDao;
import com.kh.app.board.vo.BoardVo;

@WebServlet("/board/insert")
public class BoardInsertController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	req.getRequestDispatcher("/WEB-INF/views/board/insert.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//데이터 꺼내기
		req.setCharacterEncoding("UTF-8");
		
		//꺼내기전에 앞에
		String title =req.getParameter("title");
		String content =req.getParameter("content");
		
		//데이터 뭉치기
		BoardVo vo =new BoardVo();
		vo.setTitle(title);
		vo.setContent(content);
		
		int result =0;
		try {
			BoardDao dao =new BoardDao();
			result = dao.insert(vo);
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("디비에 인서트 하다가 예외 발생");
		}
		//결과 처리
		String msg ="게시글 작성 성공";
		if(result !=1) {
			msg ="게시글 작성 실패";
			
		}
		req.setAttribute("msg", msg);
		req.getRequestDispatcher("/WEB-INF/views/common/result.jsp").forward(req, resp);
	}
	
}
