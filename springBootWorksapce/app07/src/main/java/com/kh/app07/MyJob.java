package com.kh.app07;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyJob {

    public MyJob(){
        System.out.println("MyJob.MyJob");
    }

    @Scheduled(cron = "0 33 9 * * ?")
    public void helloWorld() throws Exception {
        System.out.println("MyJob.helloWorld");
    }
}
