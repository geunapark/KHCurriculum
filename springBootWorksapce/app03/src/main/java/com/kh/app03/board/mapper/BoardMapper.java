package com.kh.app03.board.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {

    @Insert("INSERT INTO BOARD (NO , TITLE , CONTENT) VALUES (SEQ_BOARD.NEXTVAL , #{title} , #{content})")
    int write();
}
