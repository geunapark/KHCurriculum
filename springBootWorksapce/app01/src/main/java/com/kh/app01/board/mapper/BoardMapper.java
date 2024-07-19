package com.kh.app01.board.mapper;

import com.kh.app01.board.vo.BoardVo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper
public interface BoardMapper {

    @Select("SELECT * FROM BOARD")
    List<BoardVo> getBoardList();

    @Insert("INSERT INTO BOARD(TITLE,CONTENT,WRITER) VALUES(#{title} , #{content} , #{writer})")
    int write(BoardVo vo);
}

