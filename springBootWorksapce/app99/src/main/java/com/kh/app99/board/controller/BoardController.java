package com.kh.app99.board.controller;

import com.kh.app99.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("board")
public class BoardController {

    private final BoardService service;

    @GetMapping("write")
    public void m01(){};

    @GetMapping("detail")
    public void m02(){};

    @GetMapping("delete")
    public String deleteBoardByNo(){
        return "board/delete";
    }

}
