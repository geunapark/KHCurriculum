package com.kh.app.home.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/board/list")
public class BoardListController extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher("/WEB-INF/views/board/list.jsp").forward(req, resp);
	}

//게시글 작성하기
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}
}