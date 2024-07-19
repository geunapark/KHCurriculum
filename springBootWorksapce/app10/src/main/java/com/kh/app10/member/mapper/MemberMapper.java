package com.kh.app10.member.mapper;

import com.kh.app10.member.service.MemberService;
import com.kh.app10.member.vo.MemberVo;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Controller;

@Mapper
public interface MemberMapper {


    @Insert("INSERT INTO MEMBER" +
            "(NO" +
            ",ID" +
            ",PWD" +
            ",NICK" +
            ")VALUES(" +
            "SEQ_MEMBER.NEXTVAL" +
            ",#{id}" +
            ",#{pwd}" +
            ",#{nick})")
    int join(MemberVo vo);

    @Select("""
            SELECT *
            FROM MEMBER
            WHERE ID = #{id}
            """)
    MemberVo login(MemberVo vo);

}
