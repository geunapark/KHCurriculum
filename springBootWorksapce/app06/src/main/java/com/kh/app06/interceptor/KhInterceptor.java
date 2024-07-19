package com.kh.app06.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class KhInterceptor implements HandlerInterceptor {

    //핸들러 가기 전
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("KhInterceptor.preHandle");
        Thread.sleep(3000);
        System.out.println("headler = " + handler);
        return true;
    }


    //핸들러 이후
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("KhInterceptor.postHandle");
        Thread.sleep(3000);
        System.out.println("modelAndView" + modelAndView);
    }


    //view 처리 이후 DS로 넘겨지기전
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("KhInterceptor.afterCompletion");
        Thread.sleep(3000);
        System.out.println("ex=" + ex);
    }
}
