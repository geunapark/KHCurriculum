package com.kh.app.board.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.board.service.BoardService;
import com.kh.app.board.vo.BoardVo;

@WebServlet("/board/insert")
public class BoardInsertController extends HttpServlet {
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	 req.getRequestDispatcher("/WEB-INF/views/insert.jsp").forward(req, resp);
}
 @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	try {
		 String title =req.getParameter("title");
		 String content= req.getParameter("content");
		 
		 BoardVo vo =new BoardVo();
		 vo.setTitle(title);
		 vo.setContent(content);
		 
		 BoardService bs = new BoardService();
		 int result =bs.insertBoard(vo);
		 
		 //문자열 내보내기 (서블릿 직접 ㄴ jsp 한테 부탁 ㄱ)
		 req.setAttribute("result", result);
	req.getRequestDispatcher("/WEB-INF/views/result/jsp").forward(req, resp);
	}
	catch(Exception e){
		System.out.println(e.getMessage());
		
	}
	
	}
}
