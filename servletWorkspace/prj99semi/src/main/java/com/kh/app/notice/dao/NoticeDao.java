package com.kh.app.notice.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.kh.app.db.board.vo.PageVo;
import com.kh.app.notice.vo.NoticeVo;

public class NoticeDao {

	 public int write(SqlSession ss, NoticeVo vo) {
		 return ss.insert("NoticeMapper.write" , vo);	
	}
	 //목록 조회
	 public List<NoticeVo> getNoticeList(SqlSession ss,PageVo pvo) {
		 int offset = pvo.getStartNum() -1;
		 int limit =pvo.getBoardLimit();
		 RowBounds rb =new RowBounds(offset , limit);
		 return	ss.selectList("NoticeMapper.getNoticeList", null, rb);
	 }
	
	 //상세조회
	 public  NoticeVo getNotice(SqlSession ss , String no) {
		 return ss.selectOne("NoticeMapper.getNotice" , no);
	 }

	 public int getNoticeCount(SqlSession ss) {
		 return ss.selectOne("NoticeMapper.getCnt");
	 }
	 
}
