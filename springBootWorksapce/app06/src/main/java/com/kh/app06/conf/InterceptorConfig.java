package com.kh.app06.conf;

import com.kh.app06.interceptor.KhInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry
                .addInterceptor(new KhInterceptor())
                .addPathPatterns("/**");
    }
}
