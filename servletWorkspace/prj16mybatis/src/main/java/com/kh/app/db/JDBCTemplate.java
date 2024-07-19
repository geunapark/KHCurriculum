package com.kh.app.db;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class JDBCTemplate {

	// MyBatis SqlSession 객체를 얻는 메서드
	public static SqlSession getSqlSession() throws Exception {
		// MyBatis 설정 파일의 경로 지정
		String resource = "/abc.xml";

	    
	    // 설정 파일을 InputStream으로 읽어옴
	    InputStream inputStream = Resources.getResourceAsStream(resource);
	    
	    // SqlSessionFactoryBuilder를 사용하여 SqlSessionFactory 객체를 생성
	    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

	    // SqlSessionFactory를 통해 SqlSession 객체를 생성하고, 오토 커밋을 비활성화하여 트랜잭션 관리
	    SqlSession ss = sqlSessionFactory.openSession(false);
	    
	    // 생성된 SqlSession 객체 반환
	    return ss;
	}


    // JDBC Connection 객체를 얻는 메서드
    public static Connection getConnection() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String id = "C##SEMI";
        String pwd = "1234";
        Connection conn = DriverManager.getConnection(url, id, pwd);
        conn.setAutoCommit(false);
        return conn;
    }

    // 트랜잭션을 커밋하는 메서드
    public static void commit(Connection conn) {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.commit();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 트랜잭션을 롤백하는 메서드
    public static void rollback(Connection conn) {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.rollback();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Connection 객체를 닫는 메서드
    public static void close(Connection conn) {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Statement 객체를 닫는 메서드
    public static void close(Statement stmt) {
        try {
            if (stmt != null && !stmt.isClosed()) {
                stmt.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ResultSet 객체를 닫는 메서드
    public static void close(ResultSet rs) {
        try {
            if (rs != null && !rs.isClosed()) {
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
