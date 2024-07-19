package com.kh.app99.member.controller;

import com.kh.app99.member.service.MemberService;
import com.kh.app99.member.vo.MemberVo;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Controller
@RequestMapping("member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService service;

    @GetMapping("join")
    public String joinView(){
        return "member/join";
    }

    @PostMapping("join")
    public String join(MemberVo vo){

        int result = service.join(vo);
        if(result != 1){
            throw new RuntimeException("{MEMBER-000}회원가입 실패,,,,");
        }
        return "redirect:/home";
    }

    @GetMapping("login")
    public String loginView(){

        return "member/login";
    }

    @PostMapping("login")
    public String login(MemberVo vo , HttpSession session){
        MemberVo loginMemberVo = service.lgoin(vo);
       if(loginMemberVo == null){
           throw  new RuntimeException("로그인 실패");
       }

       session.setAttribute("loginMemberVo" , loginMemberVo);

       HashMap<String , String> map = new HashMap<>();
       map.put("msg" , "login ok");
        return "redirect:/home";
    }

    @GetMapping("quit")
    @ResponseBody
    public HashMap<String, String> quit(String num){


        int result = service.quit(num);

        if(result != 1){
            throw new RuntimeException();
        }

        HashMap<String , String > map = new HashMap<>();
        map.put("msg" , "quit ok");

        return map;
    }
}
