package com.kh.app.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.spi.DirStateFactory.Result;

import com.kh.app.db.JDBCTemplate;
import com.kh.app.member.vo.MemberVo;

public class MemberDao {

	public int join(MemberVo vo) throws Exception {
		// conn
		Connection conn = JDBCTemplate.getConnection();

		// sql
		String sql = "INSERT INTO MEMBER(ID,PWD,NICK) VALUES (?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, vo.getMemberId());
		pstmt.setString(2, vo.getMemberPwd());
		pstmt.setString(3, vo.getMemberNick());
		int result = pstmt.executeUpdate();
		
		if(result ==1) {
			conn.commit();
		}else {
			conn.rollback();
		}		
		return result;
	}

	public MemberVo login(MemberVo vo) throws Exception {
		//conn
		Connection conn =JDBCTemplate.getConnection();
		// sql
		String sql ="SELECT * FROM MEMBER WHERE ID =? AND PWD =?";
		PreparedStatement pstmt =conn.prepareStatement(sql);
		pstmt.setString(1, vo.getMemberId());
		pstmt.setString(2, vo.getMemberPwd());
		ResultSet rs = pstmt.executeQuery();
		
		MemberVo loginMemberVo =null;
		if(rs.next()) {
			String id =rs.getString("ID");
			String pwd =rs.getString("pwd");
			String nick =rs.getString("NICK");
			
			loginMemberVo =new MemberVo();
			
			loginMemberVo.setMemberId(id);
			loginMemberVo.setMemberPwd(pwd);
			loginMemberVo.setMemberNick(nick);
		}
		return loginMemberVo;
			
			
			
		}
	
		
		
	}

