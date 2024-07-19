package com.kh.app.board.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.app.board.service.BoardService;
import com.kh.app.board.vo.BoardVo;

@WebServlet("/board/list")
public class BoardListController extends HttpServlet {

	private BoardService boardService = new BoardService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			BoardService bs = new BoardService();
			List<BoardVo> voList =bs.getBoardList();

			//문자열 내보내기 (서블릿 직접 ㄴ jsp)
			// jsp fow
			req.setAttribute("VoList", voList);
			req.getRequestDispatcher("/WEB-INF/views/board/list.jsp").forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
