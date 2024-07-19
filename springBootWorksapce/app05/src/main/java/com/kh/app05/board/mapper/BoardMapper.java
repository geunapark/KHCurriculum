package com.kh.app05.board.mapper;

import com.kh.app05.board.vo.BoardVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface BoardMapper {

    @Select("SELECT * FROM BOARD")
    List<BoardVo> getBoardList();

    @Select("SELECT * FROM BOARD WHERE NO = ${no}")
    BoardVo getBoardByNo(String no);
}
