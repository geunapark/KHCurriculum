package com.kh.app.board.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.board.dao.BoardDao;
import com.kh.app.board.vo.BoardVo;

@WebServlet
public class BoardListController extends HttpServlet {

protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException ,IOException {
	BoardDao dao = new BoardDao ();
	
	List<BoardVo> voList = new ArrayList<BoardVo>();
	try {
		voList = dao.selectBoardList();
	}catch (Exception e) {
		e.printStackTrace();
	}
	
	//문자열 내보내기
	req.setAttribute("voList", voList);
	req.getRequestDispatcher("/WEB-INF/views/board/list.jsp").forward(req, resp);
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
}
	}
