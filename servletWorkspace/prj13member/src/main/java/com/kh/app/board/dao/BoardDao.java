package com.kh.app.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.kh.app.board.vo.BoardVo;
import com.kh.app.db.JDBCTemplate;

public class BoardDao {
	public int insert(Connection conn, BoardVo vo) throws Exception {

		// 게시글 삽입 메서드

		// SQL 쿼리문 작성
		String sql = "INSERT INTO BOARD (TITLE, CONTENT) VALUES (?, ?)";

		// PreparedStatement 객체 생성 및 값 설정
		PreparedStatement pstmt = conn.prepareStatement(sql); // 준비된 SQL 문을 실행하기 위한 PreparedStatement 객체 생성
		pstmt.setString(1, vo.getTitle()); // 첫 번째 물음표(?)에 제목 설정
		pstmt.setString(2, vo.getContent()); // 두 번째 물음표(?)에 내용 설정

		// SQL 실행 및 결과 반환
		int result = pstmt.executeUpdate(); // SQL을 실행하고 변경된 레코드 수(삽입된 행 수) 반환

		return result; // 삽입 결과(성공 시 1, 실패 시 0) 반환

	}
}