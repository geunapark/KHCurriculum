package com.kh.app.board.service;

import static com.kh.app.db.JDBCTemplate.close;
import static com.kh.app.db.JDBCTemplate.commit;
import static com.kh.app.db.JDBCTemplate.getConnection;
import static com.kh.app.db.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.List;

import com.kh.app.board.dao.BoardDao;
import com.kh.app.board.vo.BoardVo;
import com.kh.app.db.JDBCTemplate;

public class BoardService {

	private final BoardDao dao;
	
	public BoardService () {
		this.dao =new BoardDao();
	}
	
	
	
	//게시글 작성
	public int insertBoard(BoardVo vo) throws Exception {
		
		Connection conn =JDBCTemplate.getConnection();
		int result = dao.insertBoard(conn, vo);
	
		
		if(result == 1) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		
		JDBCTemplate.close(conn);
		
		return result;
	}
	
	//게시글 목록 조회 셀렉이라 트랜잭션 처리 x 
	public List<BoardVo> getBoardList() throws Exception {
		// DAO호출
		Connection conn = JDBCTemplate.getConnection();
	List<BoardVo> voList =dao.getBoardList(conn);
		
		
		close(conn);
		
		return voList;
	}
}
