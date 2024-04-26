package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.JDBCTemplate;
import main.Main;

public class MemberController {
	
	public void printMenu() throws Exception{
		
		
		System.out.println("1.회원가입");
		System.out.println("2.로그인");
		System.out.println("3.정보수정(비번)");
		System.out.println("4.정보수정(닉네임)");
		System.out.println("5.회원탈퇴");
		System.out.println("6.전체 목록 조회(관리자 전용)");
		System.out.println("7.회원상세조회(관리자 전용)");
		System.out.println("8.로그아웃");
		System.out.println("9.이전으로 돌아가기");
		System.out.println("번호를 입력해주세요 : ");
		String num = Main.SC.nextLine();
		
		switch(num) {
		case "1" : join(); break;
		case "2" : login(); break;
		//case "3" : join; break;
		//case "4" : join; break;
		//case "5" : join; break;
		//case "6" : join; break;
		//case "7" : join; break;
		case "8" : logout(); break;
		//case "9" : System.out.println("돌아가기"); return;
		default : System.out.println("잘못 입력하셨습니다");
		}
		
		
		
	}

	//회원가입
	private void join()throws Exception {
		Connection conn = JDBCTemplate.getConn();
		
		System.out.print("아이디 : ");
		String id = Main.SC.nextLine();
		System.out.print("패스워드 : ");
		String pwd = Main.SC.nextLine();
		System.out.print("닉네임  : ");
		String nick = Main.SC.nextLine();
		 
		MemberVo inputVo = new MemberVo();
		inputVo.setId(id);
		inputVo.setPwd(pwd);
		inputVo.setNick(nick);
		
		MemberDao md = new MemberDao();
		int result = md.m01(conn, inputVo);
		
		
		if(result != 1) {
			System.out.println("회원가입 실패 ㅠㅠ");
			return;
		}
	
		conn.commit();
		System.out.println("회원가입 성공!");
		
	}
	
	//로그인
	public void login()throws Exception{
		
		Connection conn = JDBCTemplate.getConn();
		String sql  = "SELECT * FROM MEMBER WHERE ID = ? AND PWD = ?";

		System.out.print("아이디 : ");
		String id = Main.SC.nextLine();
		System.out.println("비밀번호  : ");
		String pwd = Main.SC.nextLine();
		
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, pwd);
		ResultSet rs = pstmt.executeQuery();
		
		MemberVo vo = null;
		
		if(rs.next()) {
			String no = rs.getString("NO");
			String nick =rs.getString("NICK");
			String enrollDate = rs.getString("ENROLL_DATE");
			String modifyDate =rs.getString("MODIFY_DATE");
			String quitYn =rs.getString("QUIT_YN");
			vo  =new MemberVo(no,id,pwd,nick,enrollDate,modifyDate,quitYn);
		}
		
		if(vo == null) {
			System.out.println("로그인 실패 !");
			return;
		}
		Main.loginMember = vo;
		System.out.println("로그인 성공 !");
		
	}
	
	//로그아웃
	public void logout() {
		Main.loginMember = null;
		System.out.println("로그아웃 완료");
	}
	
}
