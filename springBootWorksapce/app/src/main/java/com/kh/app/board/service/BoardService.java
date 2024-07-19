package com.kh.app.board.service;

import com.kh.app.board.dao.BoardDao;
import com.kh.app.board.vo.BoardVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardDao dao;
    //객체를 할당해주는 코드
    //생성자가 없음
    //Autowired 가 생성자를 자동으로 만들어줌 생성자를 대체한다는 뜻

    public List<BoardVo> getBoardList() {
        //biz

        //DAO
        List<BoardVo> voList = dao.getBoardList();
        System.out.println("BoardService.getBoardList");
        return voList;

    }
}
