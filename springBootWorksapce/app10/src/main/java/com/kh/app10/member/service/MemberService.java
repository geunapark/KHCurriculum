package com.kh.app10.member.service;


import com.kh.app10.member.dao.MemberDao;
import com.kh.app10.member.vo.MemberVo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {


    private final MemberDao dao;
    private final BCryptPasswordEncoder encoder;

    public int join(MemberVo vo) {
        String encStr = encoder.encode(vo.getPwd());
        vo.setPwd(encStr);
        return dao.join(vo);
    }

    public MemberVo login(MemberVo vo) {
        MemberVo loginVo =  dao.login(vo);
        boolean isMatch = encoder.matches(vo.getPwd(), loginVo.getPwd());
        return isMatch ? loginVo : null;
    }
}

