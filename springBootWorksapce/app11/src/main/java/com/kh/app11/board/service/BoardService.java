package com.kh.app11.board.service;

import com.kh.app11.board.dao.BoardDao;
import com.kh.app11.board.vo.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardDao dao;

    public int boardWrite(BoardVo vo) {
        return dao.boardWrite(vo);
    }

    public BoardVo detail(String no) {
        return dao.getBoardByNo(no);
    }
}
