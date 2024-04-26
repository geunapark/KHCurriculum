package member;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class MemberDao {

	// 회원가입
	public int m01(Connection conn , MemberVo vo) throws Exception{

	
		
		// SQL
		String sql = "INSERT INTO MEMBER(NO, ID, PWD, NICK) VALUES( SEQ_MEMBER_NO.NEXTVAL, ?, ?, ? )";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.setString(1, vo.getId());
		ptmt.setString(2, vo.getPwd());
		ptmt.setString(3, vo.getNick());
		int result = ptmt.executeUpdate();
		return result;

	}

}
