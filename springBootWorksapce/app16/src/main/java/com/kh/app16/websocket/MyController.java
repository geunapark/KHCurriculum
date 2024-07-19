package com.kh.app16.websocket;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/chat/page")
    public String chat(){
        return "websocket/page";
    }

}
