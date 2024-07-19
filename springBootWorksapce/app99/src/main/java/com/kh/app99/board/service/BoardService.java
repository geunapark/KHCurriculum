package com.kh.app99.board.service;

import com.kh.app99.board.dao.BoardDao;
import com.kh.app99.board.vo.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardDao dao;

    public int write(BoardVo vo) {
        return dao.write(vo);
    }

    public BoardVo getBoardByNo(String no) {
        return dao.getBoardByNo(no);
    }

    public int deleteBoardByNo(String no) {
        return dao.deleteBoardByNo(no);

    }
}
