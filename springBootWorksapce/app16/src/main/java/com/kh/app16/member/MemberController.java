package com.kh.app16.member;

import com.kh.app16.websocket.MemberVo;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("member")
public class MemberController {

    @GetMapping("login")
    public String loginview(){
        return "member/login";
    }

    @PostMapping
    @ResponseBody
    public String login(HttpSession session , MemberVo vo){
        session.setAttribute("loginMemberVo" , vo);
        return "login ok~~~";
    }

}
