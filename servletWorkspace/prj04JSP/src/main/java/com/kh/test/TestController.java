package com.kh.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class TestController extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	
		//데이터 받기
	  String name =req.getParameter("name");
	  
//	 resp.setContentType("txt/html; charset=UTF-8");;
//	 //는 HTTP 응답 헤더의 Content-Type을 설정하는 코드입니다. 여기서 사용된 Content-Type은 
//	 //"text/html"입니다. 이는 응답의 콘텐츠가 HTML 형식임을 나타냅니다.
//
////또한, charset=UTF-8는 해당 HTML 콘텐츠의 문자 인코딩을 UTF-8로 설정한다는 것을 의미합니다. UTF-8은 다국어를 지원하는 유니코드 문자 인코딩 방식 중 하나로, 다양한 문자를 표현할 수 있습니다.
//	 PrintWriter out =resp.getWriter();
//	 out.write("<h1>df<h1>");
//	 if(name!=null) {
//		 out.write("<h1>"+name+"님 환영</h1>");
//		 
//	 }else {
//		 out.write("<h1>게스트님 환영<h1>");
//	 }
//	  
	  req.getRequestDispatcher("/WEB-INF/views/test.jsp").forward(req,resp);
	 
}
	
}
