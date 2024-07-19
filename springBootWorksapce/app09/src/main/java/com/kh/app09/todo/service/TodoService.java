package com.kh.app09.todo.service;

import com.kh.app09.todo.dao.TodoDao;
import com.kh.app09.todo.vo.TodoVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoService {

    private final TodoDao dao;

    public int insert(TodoVo vo) {
        return dao.insert(vo);

    }

    public List<TodoVo> list() {
        return dao.list();
    }

    public TodoVo getTodoByNo(String no) {
        return dao.getTodoByNo(no);
    }

    public int delete(String num) {
        return dao.delete(num);
    }

    public int edit(TodoVo vo) {

        return dao.edit(vo);

    }
}
