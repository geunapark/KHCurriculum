package com.kh.app04.board.service;

import com.kh.app04.board.dao.BoardDao;
import com.kh.app04.board.vo.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardDao dao;

    public int write(BoardVo vo) {

    int result = dao.write(vo);

    return result;

    }

    public List<BoardVo> getBoardList() {

        List<BoardVo> voList = dao.getBoardList();

        return voList;

    }

    public List<BoardVo> getBoardList(Map<String, String> paramMap) {

        return dao.getBoardList(paramMap);

    }
}
