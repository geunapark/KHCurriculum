package com.kh.app08.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TimerAop {

    @Around("execution( * com.kh.app08..*.*(..))")
    public void m01(ProceedingJoinPoint jp)throws Throwable{
    long start = System.nanoTime();
    jp.proceed();
    long end = System.nanoTime();
    long time = end-start;
        System.out.println("time = " + time);
    }

}

