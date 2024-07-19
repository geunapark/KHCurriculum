package com.kh.app.board.service;

import java.sql.Connection;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.board.dao.BoardDao;
import com.kh.app.board.vo.BoardVo;
import com.kh.app.db.JDBCTemplate;

public class BoardService {

//보드대오 객체를 멤버 변수로 선언 
	private final BoardDao dao;
	
	//생성자에서 boardDao 객체 초기화 
	public BoardService() {
		this.dao = new BoardDao();
	}
	
	public int insertBoard(BoardVo vo ) throws Exception {
		//데이터 베이스 연결 객체 생성 
		SqlSession ss = JDBCTemplate.getSqlSession();
		int result =dao.insertBoard(ss, vo);
		
		if (result ==1) {
			ss.commit();
		}else {
			ss.rollback();
		}
		//연결 객체 닫기
		ss.close();
		
		//결과 반환 
		return result;
	}
	//게시글 목록 조회 서비스 메소드
	public List<BoardVo> getBoardList() throws Exception{
		//데이터 베이스 연결 객체 생성 
		SqlSession ss =JDBCTemplate.getSqlSession();
		List<BoardVo> voList = dao.getBoardList(ss);
		ss.close();
		
		//조회된 게시글 목록 반환 
		return voList;
	}
}
