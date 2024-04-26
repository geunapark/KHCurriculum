package board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

import db.JDBCTemplate;
import main.Main;

public class BoardController {

	//메뉴
	public void printMenu() throws Exception{
		System.out.println("번호를 선택해주세요");
		System.out.println("1.게시글 작성");
		System.out.println("2.게시글 목록 조회(최신순)");
		System.out.println("3.게시글 목록 조회(오래된순)");
		System.out.println("4.게시글 목록 조회(조회수 높은 순)");
		System.out.println("5.게시글 상세 조회 ");
		System.out.println("6.게시글 검색 (제목)");
		System.out.println("7.게시글 검색 (내용)");
		System.out.println("8.게시글 수정 (작성자 또는 관리자 만 가능)");
		System.out.println("9.게시글 삭제 (작성자 또는 관리자 만 가능)");
		System.out.println("0. 돌아가기");
		
		System.out.print(" 번호를 입력하세요  : ");
		String num = Main.SC.nextLine();
		
		
		switch(num) {
		case "1" : write(); break;
		case "2" : selectBoard(); break;
//		case "3" : write(); break;
//		case "4" : write(); break;
		case "5" : selectBoardByNo(); break;
//		case "6" : write(); break;
//		case "7" : write(); break;
//		case "8" : write(); break;
//		case "9" : write(); break;
		case "0" : System.out.println("돌아가기 "); return;
		default : System.out.println("잘못 입력하셨습니다;");
		}
	}
	private void write() throws Exception{
		
		if(Main.loginMember == null ) {
			System.out.println("로그인 먼저 하고 와");
			return;
		}
		Connection conn = JDBCTemplate.getConn();
		
		
		String sql = "INSERT INTO BOARD(NO, TITLE, CONTENT, WRITER_NO) VALUES(SEQ_BOARD_NO.NEXTVAL , ?, ?, ?)";
		System.out.print("제목 : ");
		String title = Main.SC.nextLine();
		System.err.println("내용 : ");
		String content = Main.SC.nextLine();
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, title);
		pstmt.setString(2, content);
		pstmt.setString(3, Main.loginMember.getNo());
		int result = pstmt.executeUpdate();
		
		if(result != 1) {
			System.out.println("게시글 작성 실패,,,");
			return;
		}
		conn.commit();
		System.out.println("게시글 작성 성공!");
		}
	
	   // 게시글 목록 조회(최신순)
	private void selectBoard()throws Exception {
		Connection conn = JDBCTemplate.getConn();
		
		String sql = "SELECT B.NO, TITLE, M.NICK, HIT FROM BOARD B JOIN MEMBER M ON M.NO = B.WRITER_NO ORDER BY B.NO DESC";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		
		ArrayList<BoardVo> voList = new ArrayList<BoardVo>();
		while(rs.next()) {
			String no = rs.getString("NO");
			String title = rs.getString("TITLE");
//			String content = rs.getString("CONTENT");
			//String writer = rs.getString("WRITER_NO");
			String writer = rs.getString("NICK");
			String hit = rs.getString("HIT");
//			String enroll = rs.getString("ENROLL_DATE");
//			String modify = rs.getString("MODIFY_DATE");
//			String del = rs.getString("DEL_YN");
			
			BoardVo vo = new BoardVo(no, title, null, writer, hit , null, null , null);
			voList.add(vo);
		}
		System.out.println("------------------");
		System.out.print("번호");
		System.out.print(" | ");
		System.out.print("제목");
		System.out.print(" | ");
		System.out.print("닉네임");
		System.out.print(" | ");
		System.out.println();
		for (BoardVo x : voList) {
			System.out.print(x.getNo());
			System.out.print(" | ");
			System.out.print(x.getTitle());
			System.out.print(" | ");
			System.out.print(x.getHit());
			System.out.print(" | ");
			System.out.print(x.getWriter_no());
			System.out.println();
		}
		System.out.println("--------------------");
		
	}
	   // 게시글 상세조회
	private void selectBoardByNo()throws Exception {
		
		Connection conn = JDBCTemplate.getConn();
		
		System.out.print("조회할 게시물 번호 : ");
		String no = Main.SC.nextLine();
		
		
		BoardDao dao = new BoardDao(); 
		int result = dao.increaseHit(conn, no);
		if(result != 1) {
			//conn.rollback();
			throw new Exception("게시글 상세 조회 중 에러 발생 (조회수 증가 실패)");
		} 
		conn.commit();
		BoardVo vo = dao.selectBoardByNo(conn,no);
		
		
		System.out.println("------------------------------");
		System.out.println("닉네임  : " + vo.getWriter_no());
		System.out.println("제목 : " + vo.getTitle());
		System.out.println("내용 : " + vo.getContent());
		System.out.println("조회수 : " + vo.getHit());
		System.out.println("작성일자 : "  + vo.getEnroll_date());
		System.out.println("------------------------------");
		
		
	}
	   // 게시글 목록 조회(조회수 높은 순)
	
	   // 게시글 상세 조회 
	   // 게시글 검색 (제목)
	   // 게시글 검색 (내용)
	   // 게시글 수정 (작성자 또는 관리자 만 가능)
	   // 게시글 삭제 (작성자 또는 관리자 만 가능)
}
