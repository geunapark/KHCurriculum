package com.kh.app06.filter;


import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;

import java.io.IOException;

public class AdminFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("AdminFilter.doFilter start~~");
        HttpSession session = ((HttpServletRequest) servletRequest).getSession();
        Object loginAdminVo = session.getAttribute("loginAdminVo");

        filterChain.doFilter(servletRequest,servletResponse);

//        if(loginAdminVo != null ){
//            filterChain.doFilter(servletRequest,servletResponse);
//        }else{
//            ((HttpServletResponse)servletResponse).sendRedirect("/adminLoginPage");
//        }

        System.out.println("AdminFilter.doFilter end~~~~");

    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
