package com.kh.app03.board.service;

import com.kh.app03.board.dao.BoardDao;
import com.kh.app03.board.vo.BoardVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
    @Autowired
    private BoardDao dao;

    public int write(BoardVo vo) {

        int result = dao.write(vo);
        return result;
    }
}
