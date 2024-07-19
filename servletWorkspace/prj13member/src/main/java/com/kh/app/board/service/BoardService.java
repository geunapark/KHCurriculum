package com.kh.app.board.service;

import java.sql.Connection;

import com.kh.app.board.dao.BoardDao;
import com.kh.app.board.vo.BoardVo;
import com.kh.app.db.JDBCTemplate;

public class BoardService {

	public int insert(BoardVo vo) throws Exception {
		//비즈니스 로직
		
		// conn
		Connection conn = JDBCTemplate.getConnection();
		
		//sql
		BoardDao dao = new BoardDao();
		int result = dao.insert(conn ,vo);
		
		if(result ==1) {
			conn.commit();
		}else {
			conn.rollback();
		}
		
		
		
		return result;
		
	}//method

}
