package com.kh.app.board.dao;

import com.kh.app.board.mapper.BoardMapper;
import com.kh.app.board.vo.BoardVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardDao {

    @Autowired
    private BoardMapper mapper;

    public List<BoardVo> getBoardList() {

        //SQL
        List<BoardVo> voList = mapper.getBoardList();
        return voList;
    }
}
