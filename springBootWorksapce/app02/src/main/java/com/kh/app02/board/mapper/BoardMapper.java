package com.kh.app02.board.mapper;

import com.kh.app02.board.vo.BoardVo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

@Mapper
public interface BoardMapper {

    @Select("SELECT * FROM BOARD")
    List<BoardVo> getBoardList(RowBounds rb);

    @Insert("INSERT INTO BOARD(TITLE , CONTENT , WRITER) VALUES (#{t} , #{c}  ,#{w})")
    int write(@Param("t") String a, @Param("c") String b, @Param("w") String c);
}
