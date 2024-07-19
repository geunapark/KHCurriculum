package com.kh.app99.board.mapper;

import com.kh.app99.board.vo.BoardVo;
import org.apache.ibatis.annotations.*;

@Mapper
public interface BoardMapper {

    @Insert("INSERT INTO BOARD(NO , TITLE , CONTENT , WRITER_NO)VALUES (SEQ_BOARD.NEXTVAL , #{title} , #{content} , #{writerNo})")
    int write(BoardVo vo);

    @Select("SELECT * FROM BOARD WHERE NO = #{no}")
    BoardVo getBoardByNo(String no);

    @Update("DELETE BOARD WHERE NO =#{no}")
    int deleteBoardByNo(String no);
}
