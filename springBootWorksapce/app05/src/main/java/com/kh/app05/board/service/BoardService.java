package com.kh.app05.board.service;

import com.kh.app05.board.dao.BoardDao;
import com.kh.app05.board.vo.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class BoardService {

    private final BoardDao dao;

    public List<BoardVo> getBoardList() {

        List<BoardVo> voList =dao.getBoardList();
        return  voList;
    }



    public BoardVo getBoardByNo(String no) {

        return dao.getBoardByNo(no);
    }
}
