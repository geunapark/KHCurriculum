package com.kh.app.board.service;

import java.sql.Connection;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.board.dao.BoardDao;
import com.kh.app.board.vo.BoardVo;
import com.kh.app.db.JDBCTemplate;

public class BoardService {

	// BoardDao 객체를 멤버 변수로 선언
	private final BoardDao dao;

	// 생성자에서 BoardDao 객체 초기화
	public BoardService() {
		this.dao = new BoardDao();
	}

	// 게시글 작성 서비스 메서드
	public int insertBoard(BoardVo vo) throws Exception {
		// 데이터베이스 연결 객체 생성
		SqlSession ss = JDBCTemplate.getSqlSession();
		int result = dao.insertBoard(ss, vo);

		// BoardDao의 insertBoard 메서드를 호출하여 게시글 작성

		// 결과에 따라 트랜잭션 커밋 또는 롤백
		if (result == 1) {
			ss.commit(); // 성공 시 커밋
		} else {
			ss.rollback(); // 실패 시 롤백
		}

		// 연결 객체 닫기
		ss.close();
		// 결과 반환
		return result;
	}

	// 게시글 목록 조회 서비스 메서드
	public List<BoardVo> getBoardList() throws Exception {
		// 데이터베이스 연결 객체 생성
		SqlSession ss = JDBCTemplate.getSqlSession();

		// BoardDao의 getBoardList 메서드를 호출하여 게시글 목록 조회
		List<BoardVo> voList = dao.getBoardList(ss);
		// 연결 객체 닫기
		ss.close();


		// 조회된 게시글 목록 반환
		return voList;
	}
}
