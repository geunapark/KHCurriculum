package com.kh.app99.notice.controller;

import com.kh.app99.notice.service.NoticeService;
import com.kh.app99.notice.vo.NoticeVo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/notice")
@RestController
@RequiredArgsConstructor
public class NoticeApiController {

    private final NoticeService service;

    //공지사항 목록조회
    @GetMapping("list")
    public List<NoticeVo> getNoticeList(){

        List<NoticeVo> voList= service.getNoticeList();
        return voList;
    }

    //공지사항 상세조회
    @GetMapping
    public NoticeVo getNoticeByNo(String no){

        NoticeVo vo = service.getNoticeByNo(no);

        return vo;


    }

    //공지사항 작성하기

    @PostMapping
    public ResponseEntity<String> write(@RequestBody NoticeVo vo) {
        System.out.println("NoticeApiController.write");
        System.out.println("vo" + vo);
        vo.setWriterNo("1");// 로그인한 유저 정보로 변경하기
        int result = service.write(vo);

        if (result == 1) {
            return ResponseEntity.ok("작성하기 성공~");
        } else {
            return ResponseEntity.internalServerError().body("작성하기 실팽 ㅜ");
        }
    }



    //공지사항 수정하기
    @PutMapping
    public String edit(@RequestParam("no")String no , NoticeVo vo){
        int result = service.edit(no , vo);

        return "notice/list";

    }


    //공지사항 삭제하기
    @DeleteMapping
    public String delete(@RequestParam("no") String no){

        int result = service.delete(no);

        return "notice/list";
    }
}
