package com.kh.app.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.kh.app.board.vo.BoardVo;
import com.kh.app.db.JDBCTemplate;

public class BoardDao {
    
    // 게시글 작성 메서드
    public int insert(BoardVo vo) throws Exception {
        // Connection 객체 획득
        Connection conn = JDBCTemplate.getConnection();
        
        // SQL 문 작성
        String sql = "INSERT INTO BOARD(TITLE, CONTENT) VALUES(?, ?)";
        
        // PreparedStatement 객체 생성 및 값 설정
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, vo.getTitle());     // 첫 번째 매개변수에 제목 설정
        pstmt.setString(2, vo.getContent());   // 두 번째 매개변수에 내용 설정
        
        // SQL 실행 및 결과 반환
        int result = pstmt.executeUpdate();     // 실행된 쿼리의 영향을 받은 행 수 반환
        
        // 실행 결과 확인 후 커밋
        if (result == 1) {
            conn.commit();  // 트랜잭션 커밋
        }
        
        return 1;  // 작업 완료를 의미하는 임의의 값 반환
    }
    
    // 게시글 목록 조회 메서드
    public List<BoardVo> selectBoardList() throws Exception {
        // Connection 객체 획득
        Connection conn = JDBCTemplate.getConnection();
        
        // SQL 문 작성
        String sql = "SELECT * FROM BOARD";
        
        // PreparedStatement 객체 생성 및 쿼리 실행
        PreparedStatement pstmt = conn.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();   // 쿼리 실행 결과인 ResultSet 반환
        
        // 조회 결과를 저장할 리스트 생성
        List<BoardVo> voList = new ArrayList<BoardVo>();
        
        // ResultSet에서 데이터 읽어오기
        while (rs.next()) {
            // 각 행의 데이터를 읽어서 BoardVo 객체 생성 및 리스트에 추가
            String title = rs.getString("TITLE");    // 제목 정보 읽기
            String content = rs.getString("CONTENT");  // 내용 정보 읽기
            
            // BoardVo 객체 생성 및 값 설정
            BoardVo vo = new BoardVo();
            vo.setTitle(title);
            vo.setContent(content);
            
            // 리스트에 BoardVo 객체 추가
            voList.add(vo);
        }
        
        return voList;  // 조회된 게시글 목록 반환
    }
}