package member;

import java.util.Scanner;

public class MemberController {
	
	public static final Scanner SC=new Scanner(System.in);
	public static final MemberVo []MEMBER_ARRAY=new MemberVo[100];
	private static int cnt=0;
	
	//메인메뉴
	public boolean printMenu() {
		System.out.println("0. 종료하기");
		System.out.println("1. 회원가입");
		System.out.println("2. 목록조회");
		System.out.println("3. 상세조회");
		System.out.println("5. 로그인");
		System.out.print("번호를 입력하세요 : ");
		int userInput=Integer.parseInt(SC.nextLine());
		
		switch (userInput) {
		case 0: {
			System.out.println("0을 입력하셨습니다. 프로그램을 종료합니다.");
			return true;
		}
		case 1: {
			join();
			break;
		}
		case 2: {
			printList();
			break;
		}
		case 3: {
			printMember();
			break;
		}
		
		case 5: {
			login();
			break;
		}
		
		default:
			System.err.println("잘못 입력하셨습니다! 다시 입력해주세요.");
		}
		return false;
	}
	
	//회원가입
	private void join() {
		System.out.println("----- 회원가입 -----");
		System.out.print("id : ");
		String id=SC.nextLine();
		System.out.print("pwd : ");
		String pwd=SC.nextLine();
		System.out.print("nick : ");
		String nick=SC.nextLine();
		
		MemberVo mv=new MemberVo();
		mv.setId(id);
		mv.setPwd(pwd);
		mv.setNick(nick);
		MEMBER_ARRAY[cnt++]=mv;
		System.out.println("저장 완료 !!!");
		
	}
	
	//목록조회
	private void printList() {
		System.out.println("----- 목록조회 -----");
		for(int i=0;i<cnt;i++) {
			System.out.println((i+1)+". "+MEMBER_ARRAY[i].getId());
		}
	}
	
	//상세조회
	private void printMember() {
		System.out.println("----- 상세조회 -----");
		printList();
		
		System.out.print("상세 조회 할 번호 입력 : ");
		int num=Integer.parseInt(SC.nextLine());
		
		
//		MemberVo vo=MEMBER_ARRAY[num-1];
		
		System.out.println("id : "+MEMBER_ARRAY[num-1].getId()+
				"\nnick : "+MEMBER_ARRAY[num-1].getNick()+
				"\npwd : "+MEMBER_ARRAY[num-1].getPwd());
		
		System.out.println("----- 메뉴 -----");
		System.out.println("1. 닉네임 변경");
		System.out.println("2. 비밀번호 변경");
		System.out.println("3. 회원 탈퇴");
		int numMenu=Integer.parseInt(SC.nextLine());
		switch (numMenu) {
		case 1: {
			editNick(MEMBER_ARRAY[num-1]);
			break;
		}
		case 2: {
			editPwd(MEMBER_ARRAY[num-1]);
			break;
		}
		case 3: {
			quit(MEMBER_ARRAY[num-1]);
			break;
		}
		default:
			System.out.println("잘못된 입력입니다.");
		}
		
		
	}
	private void editPwd(MemberVo vo) {
		System.out.println("----- 비밀번호 수정 -----");
		System.out.print("변경할 pwd : ");
		String pwd=SC.nextLine();
		vo.setPwd(pwd);
		System.out.println("변경 완료 !!!");
	}
	
	private void quit(MemberVo vo) {
		System.out.println("----- 탈퇴하기 -----");
		MemberVo m=new MemberVo();
		for(int i=0;i<cnt;i++) {
			if(MEMBER_ARRAY[i].getId().equals(vo.getId())) {
				MEMBER_ARRAY[i]=m;
				break;
			}
		}
		
	}
	
	//회원정보수정 (닉네임 변경)
	private void editNick(MemberVo vo) {
		System.out.println("----- 닉네임 수정 -----");
		System.out.print("변경할 nick : ");
		String nick=SC.nextLine();
		vo.setNick(nick);
		System.out.println("변경 완료 !!!");
		
	}
	
	//로그인
	private void login() {
		System.out.println("----- 로그인 -----");
		
	}
}
