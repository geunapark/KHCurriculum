package com.kh.app.db.board.service;

import static com.kh.app.db.JDBCTemplate.close;
import static com.kh.app.db.JDBCTemplate.commit;
import static com.kh.app.db.JDBCTemplate.getConnection;
import static com.kh.app.db.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.List;

import com.kh.app.board.dao.BoardDao;
import com.kh.app.db.JDBCTemplate;
import com.kh.app.db.board.vo.BoardVo;
import com.kh.app.db.board.vo.PageVo;
import com.kh.app.db.board.vo.categoryVo;

public class BoardService {

	private final BoardDao dao;

	public BoardService() {
		dao = new BoardDao();
	}

	public int insert(BoardVo vo) throws Exception {

		// 비지니스로직
		if (vo.getTitle().contains("18")) {
			throw new Exception("욕하지마세요-제목");
		}

		if (vo.getContent().contains("욕설")) {
			throw new Exception("욕하지마세요-내용");
		}

		// DAO 호출
		Connection conn = JDBCTemplate.getConnection();
		int result = dao.insert(conn, vo);
		if (result == 1) {
			commit(conn);
		} else {
			rollback(conn);
		}
		close(conn);
		return result;

	}

	// 게시글 목록 조회
	public List<BoardVo> selectBoardList(PageVo pvo) throws Exception {
		// 비즈니스로직

		// dao 호출
		Connection conn = getConnection();
		List<BoardVo> voList = dao.selectBoardList(conn,pvo);

		close(conn);
		return voList;

	}

	public BoardVo getBoardByNo(String no, boolean isSelf) throws Exception {
		// 비지니스 로직 (여기서는 게시글 조회 및 조회수 증가)

		Connection conn = null;
		BoardVo vo = null;

		try {
			// 데이터베이스 연결 획득
			conn = getConnection();

			// 조회수 증가 메소드 호출
			int result = 1;
			if (!isSelf) {
				result = dao.increaseHit(conn, no);

			}
			// 게시글 상세 정보 조회 메소드 호출
			vo = dao.getBoardByNo(conn, no);

			// 조회수 증가 성공 여부 확인
			if (result == 1 && vo != null) {
				commit(conn); // 커밋
			} else {
				rollback(conn); // 롤백
				throw new Exception("[ERROR-B001] 게시글 조회수 증가 실패...");
			}

		} finally {
			// 연결 종료 (반환)
			close(conn);
		}

		return vo; // 조회된 게시글 정보 반환
	}
	// String sql="SELECT * FROM BOARD WHERE=?"

	// 카테고리 목록 조회
	public List<categoryVo> getCategoryVoList() throws Exception {
		// 비지니스

		// dao
		Connection conn = getConnection();
		List<categoryVo> categoryVoList = dao.getCategoryVoList(conn);

		close(conn);

		return categoryVoList;
	}

	public int edit(BoardVo vo) throws Exception {
		// 비지니스 로직
		if (vo.getTitle().contains("18")) {
			throw new Exception("욕 ㄴ");
		}
		if (vo.getContent().contains("18")) {
			throw new Exception("욕 ㄴ");
		}
		// dao호출
		Connection conn = getConnection();
		int result = dao.edit(conn, vo);

		if (result == 1) {
			commit(conn);
		} else {
			rollback(conn);
		}
		close(conn);
		return result;

	}

//게시글 삭제
	public int delete(BoardVo boardVo) throws Exception {
		//비즈니스 로직
		
		
		
		//dao 호출
		Connection conn =getConnection();
		int result =dao.delete(conn,boardVo);
		
		if(result ==1) {
			commit (conn);
		}else {
			rollback(conn);
			throw new Exception("게시글 삭제 실패");
		}close(conn);
		return result;
		
	}
	public int getBoardCnt() throws Exception {
		//biz 
		
		//sql 
		Connection conn =getConnection();
		int cnt =dao.getBoardCnt(conn);
		
		close(conn);
		return cnt;
	}
	}

