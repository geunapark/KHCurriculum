package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import main.Main;
import util.JDBCTemplate;

public class MemberController {
	
	public void printMenu()throws Exception{
		System.err.println("-----MEMBER-----");
		System.out.println("1.회원가입");
		System.out.println("2.로그인");
		System.out.print("번호를 입력하세요 : ");
		String num = Main.SC.nextLine();

		switch(num) {
		
		case "1" : join(); break;
		case "2" : login(); break;
		default : System.out.println("잘못입력하셨습니다"); return;
		}
	}

	
	private void join()throws Exception {
		System.out.println("-----회원가입-----");
		Connection  conn = JDBCTemplate.getConn();
		
		System.out.print("아이디 : ");
		String id = Main.SC.nextLine();
		System.out.print("비밀번호 : ");
		String pwd = Main.SC.nextLine();
		System.out.print("닉네임 : ");
		String nick = Main.SC.nextLine();
		
		String sql = "INSERT INTO MEMBER(NO, ID, PWD, NICK) VALUES(SEQ_MEMBER_NO.NEXTVAL , ?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, pwd);
		pstmt.setString(3, nick);
		
		int result = pstmt.executeUpdate();
		
		if(result != 1) {
			System.out.println("회원가입 실패 ㅠㅠ");
		}System.out.println("회원가입 성공!" + nick + "님 반갑습니다");
		
	}
	
	private void login()throws Exception {
		System.out.println("-----로그인-----");
		Connection conn = JDBCTemplate.getConn();
		
		String sql = "SELECT * FROM MEMBER WHERE ID = ? AND PWD = ?";
		
		System.out.print("아이디를 입력해주세요 :");
		String id = Main.SC.nextLine();
		System.out.println("비밀번호를 입력해주세요 : ");
		String pwd = Main.SC.nextLine();
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, pwd);
		
		ResultSet rs = pstmt.executeQuery();
		boolean found = false;
		MemberVo mv = null;
		if (rs.next()) {
			found = true;
			String no = rs.getString("NO");
			String userid = rs.getString("ID");
			String userpwd = rs.getString("PWD");
			String usernick = rs.getString("NICK");
			String enrollDate = rs.getString("ENROLL_DATE");
			String mondifyDate = rs.getString("MODIFY_DATE");
			String quitYn = rs.getString("QUIT_YN");

			mv = new MemberVo(no, userid, userpwd, usernick, enrollDate, mondifyDate, quitYn);

		}
		if (found == false) {
			System.out.println("로그인 실패");
			return;
		}
		System.out.println("로그인 성공");
		System.out.println(mv.getNick() + " 님 ㅎㅇ");
		Main.loginMember = mv;
		
	}
}
