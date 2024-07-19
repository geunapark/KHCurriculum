package com.kh.app.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTemplate {

	public static Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String id = "C##SEMI";
		String pwd = "1234";
		  // DriverManager를 사용하여 Connection 객체 생성
		Connection conn = DriverManager.getConnection(url, id, pwd);
		// 자동 커밋 비활성화
		conn.setAutoCommit(false);
		return conn;
	}


    // 커밋 메소드: Connection 객체의 변경 사항을 커밋하는 역할
    public static void commit(Connection conn) {
        try {
            if (conn != null && !conn.isClosed()) { // Connection이 유효하고 닫히지 않았을 경우
                conn.commit(); // 변경 내용 커밋
            }
        } catch (Exception e) {
            e.printStackTrace(); // SQLException 발생 시 스택 트레이스 출력
        }
    }

    // 롤백 메소드: Connection 객체의 변경 사항을 롤백하는 역할
    public static void rollback(Connection conn) {
        try {
            if (conn != null && !conn.isClosed()) { // Connection이 유효하고 닫히지 않았을 경우
                conn.rollback(); // 변경 내용 롤백
            }
        } catch (Exception e) {
            e.printStackTrace(); // SQLException 발생 시 스택 트레이스 출력
        }
    }

    // 오버로딩된 close 메소드: Connection 객체를 닫는 역할
    public static void close(Connection conn) {
        try {
            if (conn != null && !conn.isClosed()) { // Connection이 유효하고 닫히지 않았을 경우
                conn.close(); // Connection 닫기
            }
        } catch (Exception e) {
            e.printStackTrace(); // SQLException 발생 시 스택 트레이스 출력
        }
    }

    // 오버로딩된 close 메소드: Statement 객체를 닫는 역할
    public static void close(Statement stmt) {
        try {
            if (stmt != null && !stmt.isClosed()) { // Statement가 유효하고 닫히지 않았을 경우
                stmt.close(); // Statement 닫기
            }
        } catch (Exception e) {
            e.printStackTrace(); // SQLException 발생 시 스택 트레이스 출력
        }
    }

    // 오버로딩된 close 메소드: ResultSet 객체를 닫는 역할
    public static void close(ResultSet rs) {
        try {
            if (rs != null && !rs.isClosed()) { // ResultSet이 유효하고 닫히지 않았을 경우
                rs.close(); // ResultSet 닫기
            }
        } catch (SQLException e) {
            e.printStackTrace(); // SQLException 발생 시 스택 트레이스 출력
        }
    }
}