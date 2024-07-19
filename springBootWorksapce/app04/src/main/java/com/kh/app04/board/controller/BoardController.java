package com.kh.app04.board.controller;

import com.kh.app04.board.service.BoardService;
import com.kh.app04.board.vo.BoardVo;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

//@Controller
//@ResponseBody
//@RestController 은 위에 두개 합친거
@RequestMapping("board")
@RequiredArgsConstructor
@Controller
public class BoardController {

    private final BoardService service;


    @GetMapping("write")
    public String write(){

        return "board/write";
    }

    @PostMapping("insert")
    public void insert(BoardVo vo) throws Exception {

        System.out.println("vo =" +vo);
        List<MultipartFile> att = vo.getAttachmentList();
        for (MultipartFile multipartFile : att) {
            System.out.println("att" + att);

        }

    }


    @PostMapping("write")
    @ResponseBody
    public int write(BoardVo vo){

        int result = service.write(vo);
        System.out.println("result :" + result);

        return result;
    }

    @GetMapping("list")
    @ResponseBody
    public List<BoardVo> getBoardList(){

        List<BoardVo> voList = service.getBoardList();


        return voList;

    }
    @GetMapping("serach")
    @ResponseBody
    public List<BoardVo> getBoardList(@RequestParam Map<String , String > paramMap){

        System.out.println("paramMap" + paramMap);
        List<BoardVo> voList = service.getBoardList(paramMap);
        return voList;
    }

}
