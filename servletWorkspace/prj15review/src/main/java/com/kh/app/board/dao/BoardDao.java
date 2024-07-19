package com.kh.app.board.dao;

import static com.kh.app.db.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.kh.app.board.vo.BoardVo;
import com.kh.app.db.JDBCTemplate;

public class BoardDao {

	// 게시글 작성
	public int insertBoard(Connection conn, BoardVo vo) throws Exception {
		String sql = "INSERT INTO BOARD_TEMP(TITLE, CONTENT) VALUES (?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		try {
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getContent());
			int result = pstmt.executeUpdate();
			return result;
		} finally {
			close(pstmt);
		}
	}

	// 게시글 목록 조회
	public List<BoardVo> getBoardList(Connection conn) throws Exception {
		String sql = "SELECT TITLE, CONTENT FROM BOARD_TEMP";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = null;
		rs = pstmt.executeQuery();
		List<BoardVo> voList = new ArrayList<>();

		while (rs.next()) {
			String title = rs.getString("TITLE");
			String content = rs.getString("CONTENT");

			BoardVo vo = new BoardVo();
			vo.setTitle(title);
			vo.setContent(content);

			voList.add(vo);
		}

		close(rs);
		close(pstmt);
		return voList;
	}
}
