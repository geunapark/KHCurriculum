package com.kh.app08.member.service;


import com.kh.app08.member.dao.MemberDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberDao dao;

    public void list() {
        System.out.println("MemberService.list");
        dao.list();
    }
}
