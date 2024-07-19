package com.kh.app08.member.controller;

import com.kh.app08.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService service;

    @GetMapping("list")
    @ResponseBody
    public String list(){
        System.out.println("MemberController.restApi");
        service.list();
        return "member list";

    }
}
