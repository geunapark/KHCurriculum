package com.kh.app11.board.mapper;

import com.kh.app11.board.vo.BoardVo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BoardMapper {

    @Insert("""
            INSERT INTO BOARD
            (NO , TITLE , CONTENT)
            VALUES (
            SEQ_BOARD.NEXTVAL
            ,#{title}
            ,#{content})
            """)
    int boardWrite(BoardVo vo);

    @Select("""
            SELECT *
            FROM BOARD
            WHERE NO = #{no}
            """)
    BoardVo getBoardByNo(@Param("no") String no);


}
