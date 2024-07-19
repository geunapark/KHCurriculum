package com.kh.app09.todo.dao;


import com.kh.app09.todo.mapper.TodoMapper;
import com.kh.app09.todo.vo.TodoVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class TodoDao {

    private final TodoMapper mapper;

    public int insert(TodoVo vo) {
        return mapper.insert(vo);
    }

    public List<TodoVo> list() {
        return mapper.list();
    }

    public TodoVo getTodoByNo(String no) {
        return mapper.getTodoByNo(no);
    }

    public int delete(String num) {
        return mapper.delete(num);
    }

    public int edit(TodoVo vo) {
        return mapper.edit(vo);
    }
}
