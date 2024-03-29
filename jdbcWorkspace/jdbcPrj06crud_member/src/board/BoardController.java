package board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import main.Main;
import util.JDBCTemplate;

public class BoardController {
	
	//메뉴
	public void printMenu()throws Exception{
		System.out.print("-----BOARD-----");
		System.out.println("1.게시글 작성");
		System.out.println("2.게시글 목록 조회");
		System.out.println("3. 게시글 상세 조회");
		System.out.println("번호를 입력하세요 : ");
		
		String num = Main.SC.nextLine();
		switch(num) {
		case "1" : write(); break;
		case "2" : selectBoardList(); break;
		case "3" : selectBoardOne(); break;
		default :System.out.println("잘못입력하셨습니다");
		}
	}
	
	//게시글 작성
	private void write() throws Exception{
		Connection conn = JDBCTemplate.getConn();
		
		if(Main.loginMember == null) {
			System.out.println("로그인 후 이용 가능합니다");
			return;
		}
		
		
		System.out.println("제목 : ");
		String title = Main.SC.nextLine();
		System.out.println("내용 : ");
		String content = Main.SC.nextLine();
		
		
		String sql = "INSERT INTO BOARD(NO, TITLE, CONTENT, WRITER_NO) VALUES(SEQ_BOARD_NO.NEXTVAL , ? , ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, title);
		pstmt.setString(2, content);
		pstmt.setString(3, Main.loginMember.getNo());
		int result = pstmt.executeUpdate();
		
		//result
		if(result != 1) {
			System.out.println("게시글 작성 실패 ,,,");
			return;
		}
		System.out.println("게시글 작성 성공 !");
		
	}
	//게시글 목록 조회
	private void selectBoardList() {
		
	}
	
	//게시글 상세 조회
	private void selectBoardOne() {
		
	}

	
	
}
