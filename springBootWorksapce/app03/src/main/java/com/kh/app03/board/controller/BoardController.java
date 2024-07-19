package com.kh.app03.board.controller;

import com.kh.app03.board.service.BoardService;
import com.kh.app03.board.vo.BoardVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("board")
public class BoardController {

    private final BoardService service;
    //final을 사용하는 이유는 service(변수명)에 재할당 불가능

    @Autowired
    public BoardController(BoardService service){
        this.service = service;
    }

    @PostMapping("write")
    public String write(BoardVo vo){
        System.out.println("vo = " + vo);
        int result = service.write(vo);
        System.out.println("result :" + result);

        if(result != 1){
            return "common/error";
        }


        return "redirect:board/list";
    }

    @GetMapping("write")
    public String write(){
        return "board/write";

    }

    @GetMapping("list")
    public void getBoardList(){

    }

    @GetMapping("detail")
    public void getBoardByNo(){

    }

    @GetMapping("delete")
    public void deleteByNo(String No){

    }

    @PostMapping("edit")
    public void editBoard(){

    }
}
