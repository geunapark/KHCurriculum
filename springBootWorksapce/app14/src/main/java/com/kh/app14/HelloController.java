package com.kh.app14;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("hello")
@RequiredArgsConstructor
public class HelloController {

    private final HelloMapper mapper;

    @GetMapping
    public List<HelloVo> getList(){
        return mapper.getList();
    }

    @PostMapping
    public int insert(HelloVo vo){
        return mapper.insert(vo);
    }



}
