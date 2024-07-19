package com.kh.app01.board.controller;

import com.kh.app01.board.service.BoardService;
import com.kh.app01.board.vo.BoardVo;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BoardController {

    @Autowired
    private BoardService service;

    @GetMapping("board/list")
    public void getBoardList(){
        List<BoardVo> voList = service.getBoardList();
        for (BoardVo boardVo : voList){
            System.out.println("voList" + boardVo);
        }
    }

    @PostMapping("board/write")
    public void writer(BoardVo vo){
        //date 꺼내기랑 뭉치기는 파라미터에서 처리


        int result = service.write(vo);
        System.out.println("result = " + result );

    }
}
