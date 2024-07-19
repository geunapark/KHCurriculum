package com.kh.app09.todo.controller;


import com.kh.app09.todo.service.TodoService;
import com.kh.app09.todo.vo.TodoVo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("todo")
@RequiredArgsConstructor
@CrossOrigin
public class TodoController {

    private final TodoService service;

    @GetMapping
    @ResponseBody
    public List<TodoVo> getTodoList(){
        System.out.println("TodoController.getTodoList");
        return service.list();
    }

    @PostMapping
    public int insertTodo(TodoVo vo){
        System.out.println("TodoController.insertTodo");
        int result = service.insert(vo);
        return result;
    }

    //상세조회
    @GetMapping("detail")
    public TodoVo getTodoByNo(@RequestParam("no") String no){
        TodoVo voList = service.getTodoByNo(no);
        return voList;

    }

    @DeleteMapping
    public int delete(@RequestParam("no") String num){
        int result = service.delete(num);
        return result;
    }


    @PutMapping
    public int edit(TodoVo vo){
        int result = service.edit(vo);

        return result;

    }
}
