package com.kh.age;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value ="/age")
public class AgeController extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//데이터 꺼내기
		String age_ = req.getParameter("age");
		int age = Integer.parseInt(age_);
		String name = req.getParameter("name");
	
		
		//응답하기
		resp.setCharacterEncoding("UTF-8");
		PrintWriter out = resp.getWriter();
		
		 out.write("<!DOCTYPE html>");
		 out.write("<html lagn=\"ko\">");
		 out.write("<html>");
	     out.write("<head>");
	     out.write("<title>");
	     out.write("나이판단");
	     out.write("</title>");
	     out.write("<meta charset=\"UTF-8\">");
	     out.write("</head>");
	     out.write("<body>");
	     out.write("<h1> 너 이새끼 " + name +  " 나이는 : " + age + "</h1>");
		
		if(age > 19) {
			out.write("<h1>성인 으른이야 임마</h1>");			
		}else {
			out.write("<h1>애쉐키야 임마</h1>");			
		}
		
		

	}
	
}
