package page;

import member.MemberVo;
import util.InputScan;

public class FirstPage {
	public static final InputScan inputScan = new InputScan();
	public static final SecondPage SP=new SecondPage();
	public static final MemberVo[] MEMBER_VO_ARR=new MemberVo[100];
	public static final Adminpage AD=new Adminpage();
	public static int cnt=1;
	//시작
	public boolean start() {
		admin();	//시작하자마자 MEMBER_VO_ARR[0][0]에 admin계정 생성
		showMenu();
		System.out.print("번호를 입력해주세요 : ");
		int userInput=inputScan.scanInt();
		
		switch (userInput) {
		case 0: {
			System.out.println("프로그램 종료...");
			return true;
		}
		case 1: {
			login();
			break;
		}
		case 2: {
			join();
			break;
		}
		default:
			System.err.println("잘못입력하셨습니다. 다시입력해주세요!");
		}
		return false;
	}
	//admin생성!
	private void admin() {
		MemberVo mv=new MemberVo("admin","1234","admin");

		MEMBER_VO_ARR[0]=mv;
	}
	
	//메뉴
	private void showMenu() {
		System.out.println("===== 게시판 =====");
		System.out.println("0. 종료하기");
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("----------------");
	}
	
	//로그인
	private void login() {
		System.out.println("===== 로그인 =====");
		System.out.print("id	: ");
		String id=inputScan.scanString();
		System.out.print("pwd	: ");
		String pwd=inputScan.scanString();
		
		boolean isLoggedIn = false; // 로그인 여부를 나타내는 변수

	    for (int i = 0; i < cnt; i++) {
	        if (MEMBER_VO_ARR[i].getId().equals(id) && MEMBER_VO_ARR[i].getPwd().equals(pwd)) {
	            isLoggedIn = true; // 로그인 성공
	            if (MEMBER_VO_ARR[i].getId().equals("admin")) {
	                System.out.println("관리자 페이지에 오신걸 환영합니다.");
	                Boolean isFinish=false;
	                while(!isFinish) {
	                	isFinish = AD.adminSart(MEMBER_VO_ARR[i]);
	                }
	            } else {
	                System.out.println(MEMBER_VO_ARR[i].getId() + "님 환영합니다.");
	                Boolean isFinish=false;
	                while(!isFinish) {
	                	isFinish = SP.secStart(MEMBER_VO_ARR[i]);
	                }
	                
	            }
	            break; // 로그인이 성공했으므로 반복문 종료
	        }
	    }

	    if (!isLoggedIn) { // 로그인 실패
	        System.out.println("아이디 혹은 비밀번호가 다릅니다.");
	    }
		
		
	}
	
	//회원가입
	private void join() {
		System.out.println("===== 회원가입 =====");
		System.out.print("id	: ");
		String id=inputScan.scanString();
		System.out.print("pwd	: ");
		String pwd=inputScan.scanString();
		System.out.print("nick	: ");
		String nick=inputScan.scanString();
		
		MemberVo mv=new MemberVo();
		mv.setId(id);
		mv.setPwd(pwd);
		mv.setNick(nick);
		MEMBER_VO_ARR[cnt++]=mv;
		System.out.println("회원가입 완료!");
		
		
		
	}

}
