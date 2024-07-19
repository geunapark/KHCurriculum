package com.kh.app06.filter;

import jakarta.servlet.*;

import java.io.IOException;

public class KhFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("KhFilter.init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("KhFilter.doFilter start~~~");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("KhFilter.doFilter end~~~");
    }

    @Override
    public void destroy() {
        System.out.println("KhFilter.destroy");
    }
}
