package com.kh.app02.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

    @GetMapping("member/join")
    public String join(){
        return "member/join";

    }
    @GetMapping("member/login")
    public String login(){
        return "member/login";

    }
}
