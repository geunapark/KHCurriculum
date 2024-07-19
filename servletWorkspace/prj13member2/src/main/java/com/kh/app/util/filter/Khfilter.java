package com.kh.app.util.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;

@WebFilter("/*")
public class Khfilter implements Filter {

	@Override
	public void doFilter(ServletRequest request , ServletResponse response , FilterChain chain  )
			throws IOException, ServletException {
		
		request.setCharacterEncoding("UTF-8");
		System.out.println("필터에 요청 들어옴"); 
		chain.doFilter(request, response);
		//객체를 통해서 다음으로 넘어갈수 있음 
		
	}//method

}//class
