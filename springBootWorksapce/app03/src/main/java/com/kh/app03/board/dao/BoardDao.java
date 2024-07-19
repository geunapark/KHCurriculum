package com.kh.app03.board.dao;

import com.kh.app03.board.mapper.BoardMapper;
import com.kh.app03.board.vo.BoardVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDao {

    @Autowired
    private BoardMapper mapper;

    public int write(BoardVo vo) {

        return  mapper.write();
    }
}
