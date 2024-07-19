package com.kh.app12.member.controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("member")
public class MemberController {

    @GetMapping("login")
    public String join(HttpServletResponse resp){
        Cookie c = new Cookie("k01" , "h01");
        c.setMaxAge(10);
        c.setPath("/");
        resp.addCookie(c);
        return "member/login";
    }
}
