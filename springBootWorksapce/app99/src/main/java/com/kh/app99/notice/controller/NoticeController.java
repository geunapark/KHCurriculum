package com.kh.app99.notice.controller;

import com.kh.app99.notice.service.NoticeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("notice")
@RequiredArgsConstructor
public class NoticeController {

    private final NoticeService service;

    //공지사항 작성(화면)
    @GetMapping("write")
    public String writeView(){
        return "notice/write";
    }

    @GetMapping("list")
    //공지사항 목록조회 (화면)
    public String listView(){
        return "notice/list";
    }

    @GetMapping("edit")
    //공지사항 수정하기(화면)
    public String editView(){
        return "notice/edit";
    }

    @GetMapping("detail")
    //공지사항 상세조회(화면)
    public String detailView(){
        return "notice/detail";

    }


}
