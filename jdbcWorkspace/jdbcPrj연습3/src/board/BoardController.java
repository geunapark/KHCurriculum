package board;

import java.sql.Connection;
import java.sql.PreparedStatement;

import main.Main;
import util.JDBCTemplate;

public class BoardController {

	public void printMenu()throws Exception {
		System.out.println("-----BOARD-----");
		System.out.println("1.게시물 작성");
		System.out.println("2.게시물 조회");
		System.out.println("3.게시물 상세조회");
		System.out.print("번호를 입력해주세요 : ");
		String num = Main.SC.nextLine();
		
		switch(num) {
		case "1" : write(); break;
		case "2" : selectBoardList(); break;
		case "3" : selectBoardOne(); break;
		default : System.out.println("잘못입력하셨습니다");
		}
		
		
	}
	private void write() throws Exception{
		Connection conn = JDBCTemplate.getConn();
		
		if(Main.loginMember == null) {
			System.out.println("로그인 후 이용해주세요");
			return;
		}
		System.out.println("-----게시물 작성-----");
		String sql = "INSERT INTO BOARD(NO, TITLE, CONTENT, WRITER_NO) VALUES(SEQ_BOARD_NO.NEXTVAL , ? , ?, ?)";
		
		System.out.print("제목 : ");
		String title = Main.SC.nextLine();
		System.out.print("내용 : ");
		String content = Main.SC.nextLine();
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, title);
		pstmt.setString(2, content);
		
		int result = pstmt.executeUpdate();
		
		if(result != 1) {
			System.out.println("게시글 작성 실패");
		}System.out.println("게시글 작성 성공!");
	}
	
	private void selectBoardList() {
		
	}
	private void selectBoardOne() {
		
	}
	}
