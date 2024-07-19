package com.kh.app.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.app.board.vo.BoardVo;
import com.kh.app.board.vo.SearchVo;

public class BoardDao {

	public int write(SqlSession ss,BoardVo vo) {
	 	return ss.insert("BoardMapper.write" , vo);
	}
	//게시글 목록 조회
   public List<BoardVo> getBoardList(SqlSession ss , SearchVo vo) {
	   return ss.selectList("BoardMapper.getBoardList" , vo );
		
	}
   //게시글 검색 (제목)
   public List<BoardVo> getBoardListByTitle(SqlSession ss ,SearchVo vo) {
	   
	   return ss.selectList("BoardMapper.serachBoardByTitle" , vo);
		
	}
   //게시글 검색 (내용)
   public List<BoardVo> getBoardListByContent(SqlSession ss,SearchVo vo) {
	   
	   return ss.selectList("BoardMapper.serachBoardByContent" , vo);
	}
   //게시글 검색 (작성자)
   public List<BoardVo> getBoardListByWriter(SqlSession ss,SearchVo vo) {
	   
	   return ss.selectList("BoardMapper.serachBoardByWriter" , vo);
	}
}
