package com.kh.app.home;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class HomeController extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html; charset=UTF-8");
		String name = req.getParameter("name");
		
	
//		PrintWriter out =resp.getWriter();
//		if(name == null) {
//			out.write("게스트 입니당~");			
//		}else {
//			out.write( name + "입니당~");			
//		}
//		req.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(req, resp);
		req.getRequestDispatcher("/WEB-INF/views/test.jsp").forward(req, resp);
		//파일경로에 맞게 찾아가서 그 파일이 뭔가 작업을 하나보다 라고 유추해봄
	}
	
	
}
