package com.kh.app05.board.controller;


import com.kh.app05.board.service.BoardService;
import com.kh.app05.board.vo.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/board")
@RequiredArgsConstructor
@CrossOrigin
public class BoardController {

    private final BoardService service;

    @GetMapping("list")
    public List<BoardVo> getBoardList() {

        List<BoardVo> voList = service.getBoardList();
        return  voList;
    }

    @GetMapping("detail")
    public BoardVo getBoardByNo(BoardVo vo){
        System.out.println("vo =" + vo);

       return  service.getBoardByNo(vo.getNo());

    }
}
