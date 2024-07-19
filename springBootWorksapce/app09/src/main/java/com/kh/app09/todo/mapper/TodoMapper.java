package com.kh.app09.todo.mapper;

import com.kh.app09.todo.vo.TodoVo;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Mapper
public interface TodoMapper {

    @Insert("INSERT INTO TODO(NO , CONTENT)VALUES(SEQ_TODO.NEXTVAL , #{content})")
    int insert(TodoVo vo);

    @Select("SELECT * FROM TODO")
    List<TodoVo> list();

    @Select("SELECT * FROM TODO WHERE NO = #{no}")
    TodoVo getTodoByNo(String no);

    @Delete("DELETE FROM TODO WHERE NO = #{num}")
    int delete(String num);

    @Update("UPDATE TODO SET CONTENT =#{content} WHERE NO = #{no}")
    int edit(TodoVo vo);
}
