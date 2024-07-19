package com.kh.app99.board.controller;


import com.kh.app99.board.service.BoardService;
import com.kh.app99.board.vo.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("api/board")
@RequiredArgsConstructor
public class BoardRestController {

    private final BoardService service;

    //게시글 작성
    @PostMapping
    public HashMap<String, String> write(BoardVo vo){

        int result = service.write(vo);
        if(result != 1){
            throw new RuntimeException("작성하다 에러발생");
        }
        HashMap<String , String> map = new HashMap<>();
        map.put("msg" ,"작성성공~");
        map.put("status" , "200OK");

        return map;

    }

    //게시글 조회(번호)
    @GetMapping
    public ResponseEntity getBoardByNo(String no){

        BoardVo vo = service.getBoardByNo(no);

        if (vo == null){
            throw new RuntimeException("게시글 상세조회 실패 ㅠ");
        }



        return ResponseEntity.ok(vo);


    }

    //게시글 삭제(번호)
    @DeleteMapping
    public ResponseEntity<String> deleteBoardByNo(String no){

        int result = service.deleteBoardByNo(no);
        if(result != 1){
            throw new RuntimeException();
        }
        return ResponseEntity.ok("delete 성공");


    }
    

}
