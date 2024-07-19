package com.kh.app01.board.service;

import com.kh.app01.board.dao.BoardDao;
import com.kh.app01.board.vo.BoardVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardDao dao;

    public List<BoardVo> getBoardList() {
        List<BoardVo> voList  = dao.getBoardList();

        return voList;

    }


    public int write(BoardVo vo) {

        int result = dao.write(vo);

        return result;
    }
}
