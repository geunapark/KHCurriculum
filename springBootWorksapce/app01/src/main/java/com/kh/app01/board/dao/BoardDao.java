package com.kh.app01.board.dao;

import com.kh.app01.board.mapper.BoardMapper;
import com.kh.app01.board.vo.BoardVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardDao {

    @Autowired
    private BoardMapper mapper;

    public List<BoardVo> getBoardList() {

        return mapper.getBoardList();

    }


    public int write(BoardVo vo) {

        return mapper.write(vo);
    }
}
