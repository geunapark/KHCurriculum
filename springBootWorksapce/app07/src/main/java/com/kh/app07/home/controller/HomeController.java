package com.kh.app07.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")
public class HomeController {

    @GetMapping
    public String home(Model model){
        model.addAttribute("msg" ,"오류닥 이자식아");
        return "home";
    }
}
