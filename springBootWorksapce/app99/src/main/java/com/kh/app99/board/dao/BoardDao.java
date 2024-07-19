package com.kh.app99.board.dao;

import com.kh.app99.board.mapper.BoardMapper;
import com.kh.app99.board.vo.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class BoardDao {

    private final BoardMapper mapper;

    public int write(BoardVo vo) {
        System.out.println("vo = " + vo);
        return mapper.write(vo);
    }

    public BoardVo getBoardByNo(String no) {
        return mapper.getBoardByNo(no);
    }

    public int deleteBoardByNo(String no) {
        return mapper.deleteBoardByNo(no);
    }
}
