package com.kh.app04.member.controller;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping("member")
public class MemberController {

    @GetMapping("login")
    public String login(){
        return "member/login";

    }

    @PostMapping("login")
    public String login(@RequestParam Map<String , String> paramMap , HttpSession session){
        System.out.println("paramMap = " + paramMap);
//        req.setAttribute("msg" ,"로그인성공");

        session.setAttribute("msg" , "로그인성공");

        return "redirect:/home";

    }
}
