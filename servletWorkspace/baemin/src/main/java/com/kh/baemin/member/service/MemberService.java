package com.kh.baemin.member.service;

import com.kh.baemin.app.member.vo.MemberVo;

public class MemberService {

    public int join(MemberVo vo) throws Exception {
        // 회원 가입 처리 메서드
        boolean isValid = true; // 유효성 검사를 위한 변수 초기화
        StringBuilder errorMessage = new StringBuilder();

        // 아이디 길이 검사 (4자 이상 10자 이하)
        if (vo.getId().length() < 4 || vo.getId().length() > 10) {
            isValid = false;
            throw new Exception("아이디는 4~10자여야 합니다. ");
           
        }

        // 비밀번호 길이 검사 (4자 이상 10자 이하)
        if (vo.getPwd().length() < 4 || vo.getPwd().length() > 10) {
            isValid = false;
            throw new Exception("비번은 4~10자여야 합니다. ");
        }

        // 이름 길이 검사 (1자 이상 10자 이하)
        if (vo.getName() ==null || vo.getName().trim().isEmpty()) {
            isValid = false;
            errorMessage.append("이름은 1~10자여야 합니다.");
        }

        // 닉네임 길이 검사 (1자 이상 10자 이하)
        if (vo.getNick().length() < 1 || vo.getNick().length() > 10) {
            isValid = false;
            errorMessage.append("닉네임은 1~10자여야 합니다.");
        }

        // 전화번호 길이 검사 (8자 이상 15자 이하)
        if (vo.getPhone().length() == 11) {
            isValid = false;
            errorMessage.append("전화번호는 11자여야 합니다.");
        }

        // 주소 길이 검사 (30자 이상 50자 이하)
        if (vo.getAddress().length() < 30 || vo.getAddress().length() > 50) {
            isValid = false;
            errorMessage.append("주소는 30~50자여야 합니다.\n");
        }

        // 상세주소 길이 검사 (40자 이상 50자 이하)
        if (vo.getAddressDetail().length() < 40 || vo.getAddressDetail().length() > 50) {
            isValid = false;
            errorMessage.append("상세주소는 40~50자여야 합니다.\n");
        }

        // 세대 선택 유효성 검사
        if (vo.getGeneration() == null || vo.getGeneration().isEmpty()) {
            isValid = false;
            errorMessage.append("세대를 선택해주세요.\n");
        }

        // 성별 선택 유효성 검사
        if (vo.getGender() == null || vo.getGender().isEmpty()) {
            isValid = false;
            errorMessage.append("성별을 선택해주세요.\n");
        }

        // 유저 사진 업로드 유효성 검사
        if (vo.getProfile() == null || vo.getProfile().isEmpty()) {
            isValid = false;
            errorMessage.append("유저 사진을 업로드해주세요.\n");
        }

        if (!isValid) {
            throw new Exception(errorMessage.toString());
        }

        // 유효성 검사를 모두 통과하면 회원 가입 처리 로직 수행
        // DB에 저장하는 로직 추가
        // 예: memberDao.save(vo);

        return 1; // 성공 시 1 반환 (실제 구현에서는 다른 값을 반환할 수도 있음)
    }
}
