package com.kh.baemin.app.member.dao;

import org.apache.ibatis.session.SqlSession;


import com.kh.baemin.app.member.vo.MemberVo;

public class MemberDao {
	

	public int insert(SqlSession ss, MemberVo vo) throws Exception {
		return ss.insert("BaeminMapper.insert" , vo);
}
}
