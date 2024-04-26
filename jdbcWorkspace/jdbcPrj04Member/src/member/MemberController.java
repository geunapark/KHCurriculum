package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import main.Main;

public class MemberController {

	
	public void printMenu()throws Exception{
		System.out.println("-----MEMBER-----");
		System.out.println("1.회원가입");
		System.out.println("2.로그인");
		
		System.out.print("번호를 입력하세요 : ");
		String input = Main.SC.nextLine();
		
		switch(input) {
		case "1" : join(); break;
		case "2" : login(); break;
		default : System.out.println("잘못입력하셨습니다.");
		}
		
	}
	
private void join() throws Exception{
		System.out.println("-----회원가입-----");
		Connection conn = getConn();
	     
	      //SQL 준비
		String sql = "INSERT INTO MEMBER(ID,PWD,NICK)VALUES(?,?,?)";

		//유저한테 입력받기
		System.out.println("아이디 : ");
		String inputId = Main.SC.nextLine();
		System.out.println("패스워드 : ");
		String inputPwd = Main.SC.nextLine();
		System.out.println("닉네임 : ");
		String inputNick = Main.SC.nextLine();
	    
		//SQL 실행을 위한 statement 준비
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, inputId);
		pstmt.setString(2, inputPwd);
		pstmt.setString(3, inputNick);
		
		
		//statement 에 SQL 담아주고 실행 및 결과 리턴받기
		int result = pstmt.executeUpdate();

		
		//결과출력
		if(result != 1) {
			//System.out.println("회원가입 실패...");
			throw new RuntimeException("회원가입 실패...");
			
		}
		System.out.println("회원가입 성공!"+ inputNick +"님 반갑습니다");
	}
	
	private void login()throws Exception {
		System.out.println("-----로그인-----");
		
		Connection conn = getConn();
		//SQL 준비
		String sql = "SELECT * FROM MEMBER WHERE ID = ? AND PWD =?";
		System.out.println("아이디를 입력해주세요 : ");
		String inputId = Main.SC.nextLine();
		System.out.println("비밀번호를 입력해주세요 : ");
		String inputPwd = Main.SC.nextLine();
		//SQL 실행을 위한 statement 준비
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, inputId);
		pstmt.setString(2, inputPwd);
		
		
		//statement 에 SQL 담아주고 실행 및 결과 리턴받기
		ResultSet rs = pstmt.executeQuery();
		
		//결과 출력
		if(rs.next()) {
			String dbId = rs.getString("ID");
			String dbPwd = rs.getString("PWD");
			String dbNick = rs.getString("NICK");
			
			MemberVo vo = new MemberVo(dbId,dbPwd,dbNick);
			System.out.println(vo);
		}else {
			throw new RuntimeException("로그인 실패,,,");
			//System.out.println("로그인 실패,,,");
		}
		//사용한 자원 반납
		// ~~~~~
	}
	
	private Connection getConn() throws Exception{
		//JDBC 드라이버 로딩
		String driver = "oracle.jdbc.driver.OracleDriver";
		Class.forName(driver);
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "C##KH";
		String pwd = "1234";
		
		Connection conn = DriverManager.getConnection(url,id,pwd);
	
		
		return conn;
		//데이터베이스 연결 정보 준비
		//데이터베이스 연결 == 커넥션 객체 얻기
		
	}
}
