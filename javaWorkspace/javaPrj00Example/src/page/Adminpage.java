package page;

import member.MemberVo;

public class Adminpage {
	
	
	//관리자 페이지 시작
	public boolean adminSart(MemberVo mv){
		
		showMenu();
		System.out.print("번호를 입력하세요 : ");
		int input= FirstPage.inputScan.scanInt();
		
		switch (input) {
		case 0: {
			System.out.println("로그아웃...");
			return true;
		}
		case 1: {
			mbList();
			break;
		}
		case 2: {
			bdList();
			break;
		}
		default:
			System.err.println("잘못입력하셨습니다. 다시입력해주세요!");
		}
		
		
		return false;
		
	}
	//메뉴보기
	private void showMenu() {
		System.out.println("===== 관리자 =====");
		System.out.println("0. 로그아웃");
		System.out.println("1. 회원정보목록");
		System.out.println("2. 전체글보기");
	}
	
	//회원정보목록
	private void mbList() {
		System.out.println("===== 회원정보 =====");
		for(int i=0;i<FirstPage.cnt;i++) {
			System.out.println((i+1)+". id : "+FirstPage.MEMBER_VO_ARR[i].getId()+
					"	닉네임 : "+FirstPage.MEMBER_VO_ARR[i].getNick());
		}
		System.out.print("조회할 id : ");
		String id=FirstPage.inputScan.scanString();
		for(int i=0;i<FirstPage.cnt;i++) {
			if(FirstPage.MEMBER_VO_ARR[i].getId().equals(id)) {
				FirstPage.SP.myActivitie(FirstPage.MEMBER_VO_ARR[i]);
			}
		}
		
	}
	//전체글보기
	private void bdList() {
		System.out.println("===== 전체글보기 =====");
		for(int i=0;i<SecondPage.b_cnt;i++) {
			System.out.println("글번호 : "+SecondPage.BOARD_VO_ARR[i].getNum()+
					"	글제목 : "+SecondPage.BOARD_VO_ARR[i].getTitle()+
					"	닉네임 : "+SecondPage.BOARD_VO_ARR[i].getM_nick());
		}
	}

}
