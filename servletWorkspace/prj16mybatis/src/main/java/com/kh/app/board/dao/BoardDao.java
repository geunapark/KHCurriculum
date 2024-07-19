package com.kh.app.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.board.vo.BoardVo;
import com.kh.app.db.JDBCTemplate;

public class BoardDao {

    // 게시글 작성
    public int insertBoard(SqlSession ss, BoardVo vo) throws Exception {
    	return ss.insert("BoardMapper.insertBoard" , vo);
//        // SQL 쿼리 작성
//        String sql = "INSERT INTO BOARD_TEMP (TITLE, CONTENT) VALUES (?, ?)";
//        
//        // PreparedStatement 객체 생성
//        PreparedStatement pstmt = conn.prepareStatement(sql);
//        
//        // SQL 쿼리의 첫 번째와 두 번째 인덱스에 제목과 내용을 설정
//        pstmt.setString(1, vo.getTitle());
//        pstmt.setString(2, vo.getContent());
//        
//        // SQL 쿼리 실행 및 실행 결과(적용된 행의 수)를 반환
//        int result = pstmt.executeUpdate();
//        
//        // PreparedStatement 객체 닫기
//        JDBCTemplate.close(pstmt);
//        
//        // 실행 결과 반환
//        return result;
    	
    }
    
    // 게시글 목록 조회
    public List<BoardVo> getBoardList(SqlSession ss) throws Exception {
    	return ss.selectList("BoardMapper.selectBoardList");
//        // SQL 쿼리 작성
//        String sql = "SELECT TITLE, CONTENT FROM BOARD_TEMP";
//        
//        // PreparedStatement 객체 생성
//        PreparedStatement pstmt = conn.prepareStatement(sql);
//        
//        // SQL 쿼리 실행 및 결과 집합(ResultSet) 반환
//        ResultSet rs = pstmt.executeQuery();
//        
//        // BoardVo 객체를 담을 리스트 생성
//        List<BoardVo> voList = new ArrayList<BoardVo>();
//        
//        // 결과 집합을 순회하면서 제목과 내용을 추출
//        while (rs.next()) {
//            String title = rs.getString("TITLE");
//            String content = rs.getString("CONTENT");
//            
//            // 새로운 BoardVo 객체 생성 및 제목과 내용 설정
//            BoardVo vo = new BoardVo();
//            vo.setTitle(title);
//            vo.setContent(content);
//            
//            // BoardVo 객체를 리스트에 추가
//            voList.add(vo);
//        }
//        
//        // ResultSet 객체 닫기
//        JDBCTemplate.close(rs);
//        
//        // PreparedStatement 객체 닫기
//        JDBCTemplate.close(pstmt);
//        
//        // 게시글 목록 반환
//        return voList;
    }
}
