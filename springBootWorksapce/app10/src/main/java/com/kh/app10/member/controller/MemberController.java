package com.kh.app10.member.controller;

import com.kh.app10.member.service.MemberService;
import com.kh.app10.member.vo.MemberVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("member")
public class MemberController {

    private final MemberService service;

    @PostMapping
    @ResponseBody
    public int join(MemberVo vo){
        int result = service.join(vo);
        return result;
    }


    @ResponseBody
    @GetMapping
    public MemberVo login(MemberVo vo){
        MemberVo loginVo = service.login(vo);
        return loginVo;
    }

}
