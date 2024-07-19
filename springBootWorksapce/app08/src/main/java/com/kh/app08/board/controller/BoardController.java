package com.kh.app08.board.controller;

import com.kh.app08.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
@RequestMapping("board")
public class BoardController {

    private final BoardService service;

    @GetMapping("list")
    @ResponseBody
    public String list(){
        System.out.println("BoardController.restApi");
        service.list();
        return "board list";
    }


}
