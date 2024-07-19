package com.kh.app11.board.controller;

import com.kh.app11.board.service.BoardService;
import com.kh.app11.board.vo.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@RequestMapping("board")
@Controller
@RequiredArgsConstructor
public class BoardController {

    private final BoardService service;

    @GetMapping("write")
    public String write(){
        return "board/write";
    }

    @PostMapping("write")
    public String boardWrite(BoardVo vo){
        int result = service.boardWrite(vo);
        return "redirect:/home";
    }

    @GetMapping("detail")
    public String detail(){
        return "board/detail";
    }

    @GetMapping
    @ResponseBody
    public BoardVo getBoardByNo(@RequestParam("no") String no){
        BoardVo vo = service.detail(no);
        return vo;
    }

    @PostMapping("upload")
    @ResponseBody
    public String uploadFile(@RequestParam("fileList") List<MultipartFile> fileList) throws Exception{

        MultipartFile file = fileList.get(0);

        File targetFile=new File("D:\\dev\\springBootWorksapce\\app11\\src\\main\\resources\\static\\img\\"+file.getOriginalFilename());

        file.transferTo(targetFile);

        return "http://192.168.40.109:5500/img/" + file.getOriginalFilename();
    }

}
