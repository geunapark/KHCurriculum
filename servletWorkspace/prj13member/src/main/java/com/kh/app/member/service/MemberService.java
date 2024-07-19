package com.kh.app.member.service;

import com.kh.app.member.dao.MemberDao;
import com.kh.app.member.vo.MemberVo;

public class MemberService {

	public int join(MemberVo vo) throws Exception {

		// 회원 가입 처리 메서드
		boolean isValid = true; // 유효성 검사를 위한 변수 초기화

		// 아이디 길이 검사 (4자 이상 12자 이하)
		if (vo.getMemberId().length() < 4 || vo.getMemberId().length() > 12) {
			isValid = false; // 유효하지 않은 경우
		}

		// 비밀번호 길이 검사 (4자 이상 12자 이하)
		if (vo.getMemberPwd().length() < 4 || vo.getMemberPwd().length() > 12) {
			isValid = false; // 유효하지 않은 경우
		}

		// 비밀번호 확인 일치 검사
		if (!vo.getMemberPwd().equals(vo.getMemberPwd2())) {
			isValid = false; // 유효하지 않은 경우
		}

		// 닉네임에 '관리자' 또는 '운영자' 포함 여부 검사
		if (vo.getMemberNick().contains("관리자") || vo.getMemberNick().contains("운영자")) {
			isValid = false; // 유효하지 않은 경우
		}

		// 유효성 검사 결과가 유효하지 않은 경우 처리
		if (!isValid) {
			return 0; // 회원 가입 실패 (0 반환)
		}

		System.out.println("isValid :" + isValid); // 유효성 검사 결과 로그 출력

		// 회원 가입 DAO 호출 및 결과 반환
		MemberDao dao = new MemberDao();
		int result = dao.join(vo); // 회원 가입 처리 결과

		return result; // 회원 가입 성공 여부 반환

	}// join

	public MemberVo login(MemberVo vo) throws Exception {

		// 로그인 처리 메서드

		// 로그인 DAO 호출 및 로그인한 회원 정보 반환
		MemberDao dao = new MemberDao();
		MemberVo loginMemberVo = dao.login(vo); // 로그인 처리 결과 (회원 정보)

		return loginMemberVo; // 로그인한 회원 정보 반환

	}
}