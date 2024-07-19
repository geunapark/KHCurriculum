package com.kh.age;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/age")
public class AgeController extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
	    // 데이터 꺼내기
	    String age_ = req.getParameter("age"); // HTTP 요청에서 "age" 파라미터를 가져옵니다.
	    int age = Integer.parseInt(age_); // 가져온 "age" 파라미터를 정수형으로 변환합니다.
	    String name = req.getParameter("name"); // HTTP 요청에서 "name" 파라미터를 가져옵니다.
		
		
		//응답하기
		resp.setCharacterEncoding("UTF-8");
		PrintWriter out = resp.getWriter();
	
		
		out.write("<!DOCTYPE html>");
		out.write("<html lagn=\"ko\">");
		out.write("<head>");
		out.write("<title>");
		out.write("나이판단");
		out.write("</title>");
		out.write("<meta charset=\"UTF-8\">");
		out.write("</head>");
		out.write("<body>");
		out.write("<h1>" + name + "님의 나이 : " + age +"</h1>");
		
		if(age>19) {
		out.write("<h1>" +name +"성인.<h1>");
		}else {
			out.write("<h1>" +name +"그나는애기야.<h1>");
		}
		out.write("</body>");
		out.write("</html>");
	}
		
		}
	
	
	

