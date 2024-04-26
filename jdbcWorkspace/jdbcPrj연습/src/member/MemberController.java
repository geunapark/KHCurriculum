package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import main.Main;

public class MemberController {

	public void printMenu() throws Exception {
		System.out.println("-----MEMBER-----");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		
		System.out.print("번호를 입력하세요 : ");
		String input = Main.SC.nextLine();
		
		switch(input) {
		case "1" : join(); break;
		case "2" : login(); break;
		default : System.out.println("잘못입력하셨습니다.");
		}
	}
	
	
	public void join()throws Exception {
		System.out.println("-----회원가입-----");
		Connection conn = getConn();
		
		//SQL 준비
		String sql = "INSERT INTO MEMBER(ID,PWD,NICK)VALUES(?,?,?)";
		
		//유저한테 입력받기
		System.out.println("아이디 : ");
		String id =Main.SC.nextLine();
		System.out.println("비밀번호 : ");
		String pwd =Main.SC.nextLine();
		System.out.println("닉네임 : ");
		String nick =Main.SC.nextLine();
		
		//SQL을 실행을 위한 statment 준비
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,id);
		pstmt.setString(2,pwd);
		pstmt.setString(3,nick);
		
		//statment 에 SQL을 담아주고 실행 및 결과 리턴받기
		int result = pstmt.executeUpdate();
		
		//결과출력
		if(result != 1) {
			System.out.println("회원가입 실패,,,");
			
		}else {
			System.out.println("회원가입 성공!" );
		}
		
	}
	
	
	public void login()throws Exception {
		System.out.println("-----로그인-----");
		Connection conn = getConn();
		
		//SQL준비
		String sql = "SELECT * FROM ID = ? AND PWD = ?";
		System.out.println("아이디를 입력해주세요 : ");
		String id = Main.SC.nextLine();
		System.out.println("비밀번호를 입력해주세요 :");
		String pwd = Main.SC.nextLine();
		
		//SQL 실행을 위한 statement 준비
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1 , id);
		pstmt.setString(2 , pwd);
		
		//statement 에 SQL 담아주고 실행 및 결과 리턴받기
		ResultSet rs = pstmt.executeQuery();
		
		//결과출력
		if(rs.next()) {
			String dbid = rs.getString("ID");
			String dbpwd = rs.getString("PWD");
			String dbnick = rs.getString("NICK");
			
			MemberVo vo = new MemberVo(dbid,dbpwd,dbnick);
			System.out.println(vo);
		}else {
			System.out.println("로그인 실패,,,");
		}
		
		
		
		
	}
	
	private Connection getConn()throws Exception {
		//JDBC 드라이버 로딩
		String driver = "";
		Class.forName(driver);
		
		String url = "";
		String id = "";
		String pwd = "";
		
		Connection conn = DriverManager.getConnection(url,id,pwd);
		
		return conn;
		
	}
}
