package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import main.Main;

public class BoardDao {

	//게시글 상세조회 SQL
	public BoardVo selectBoardByNo(Connection conn , String no) throws Exception {

	
		
		// rs->date->obj
		String sql = "SELECT B.NO ,TITLE ,CONTENT ,NICK , HIT ,TO_CHAR(B.ENROLL_DATE, 'YYYY\"년\" MM\"월\"DD\"일\"HH:MI:SS') ENROLL_DATE FROM BOARD B JOIN MEMBER M ON M.NO = B.WRITER_NO WHERE B.NO = ? AND B.DEL_YN = 'N'";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, no);
		ResultSet rs = pstmt.executeQuery();

		BoardVo vo = null;
		if (rs.next()) {
			// String No = rs.getString("NO");
			String title = rs.getString("TITLE");
			String content = rs.getString("CONTENT");
			String nick = rs.getString("NICK");
			String hit = rs.getString("HIT");
			String enrollDate = rs.getString("ENROLL_DATE");

//					BoardVo vo = new BoardVo(No, title, content, writerNo, hit, enrollDate, null , null );

			vo = new BoardVo();
			vo.setNo(no);
			vo.setTitle(title);
			vo.setContent(content);
			vo.setWriter_no(nick);
			vo.setHit(hit);
			vo.setEnroll_date(enrollDate);
		}
		return vo;
	}

	//조회수 증가 SQL
	public int increaseHit(Connection conn ,String no)throws Exception {
		
		String sql = "UPDATE BOARD\r\n"
				+ "SET HIT = HIT+1 WHERE NO = ? AND DEL_YN = 'N'";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, no);
		int result = pstmt.executeUpdate();
		return result;
		
	}
	
}
