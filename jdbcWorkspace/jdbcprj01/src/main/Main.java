package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println("-----JDBC-----");

		// JDBC 드라이버 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");

		// 데이터베이스 연결 정보 준비 //접속 로그인
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // java = oracle 연결준비
		String id = "C##KH";
		String pwd = "1234";

		// 데이버베이스 연결 == 커넥션 객체 얻기 //접속
		Connection conn = DriverManager.getConnection(url, id, pwd);

		// SQL준비
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 : ");
		String a = sc.nextLine();
		System.out.println("비밀번호 : ");
		String b = sc.nextLine();
		System.out.println("닉네임 : ");
		String c = sc.nextLine();
		
		String sql = "INSERT INTO MEMBER(ID,PWD,NICK) VALUES('"+a+"','"+b+"','"+c+"')";
		//String sql = "UPDATE MEMBER SET PWD = '0000'";
		//String sql = "DELETE MEMBER";

		// SQl실행을 위한 statment 준비
		Statement stmt = conn.createStatement();

		// statment 에 SQL 담아주고 실맹 및 결과 리턴받기
		int result = stmt.executeUpdate(sql);
		//conn.commit();
		// dml을 사용할시에는 업데이트 사용하기

		// 결과 출력
		System.out.println("insert 쿼리문 실행 결과 : " + result);

		// 사용후 자원반납
		// ~~~
	}

}
