package com.kh.app02.board.dao;

import com.kh.app02.board.mapper.BoardMapper;
import com.kh.app02.board.vo.BoardVo;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BoardDao {

    @Autowired
    BoardMapper mapper;


    public List<BoardVo> getBoardList() {
        int offset =1;
        int limit =5;
        RowBounds rb =new RowBounds(offset , limit);
        return mapper.getBoardList(rb);
    }

    public int write(BoardVo vo) {

        return mapper.write(vo.getTitle(),vo.getContent(),vo.getWriter());

    }
}
