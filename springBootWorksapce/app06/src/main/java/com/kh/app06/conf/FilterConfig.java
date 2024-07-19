package com.kh.app06.conf;

import com.kh.app06.filter.AdminFilter;
import com.kh.app06.filter.KhFilter;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Filter;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean m01(){

        KhFilter khFilter = new KhFilter();
        FilterRegistrationBean x = new FilterRegistrationBean<>(khFilter);
        x.addUrlPatterns("/*");
        x.setOrder(1);
        return x;

    }

    @Bean
    public FilterRegistrationBean m02(){

        AdminFilter adminFilter = new AdminFilter();
        FilterRegistrationBean y = new FilterRegistrationBean<>(adminFilter);
        y.addUrlPatterns("/*");
        y.setOrder(Integer.MAX_VALUE);
        return y;

    }
}
