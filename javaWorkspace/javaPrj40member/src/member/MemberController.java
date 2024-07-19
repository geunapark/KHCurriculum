package member;

import main.Main;

public class MemberController {
	
	public static final MemberVo[] MEMBER_VO_ARRAY = new MemberVo[100];
	public static int cnt = 0;
	

	// 메인 메뉴
	public boolean printMenu() {
		System.out.println("------ 메인 메뉴 ------");
		System.out.println("0. 종료하기");
		System.out.println("1. 회원가입");
		System.out.println("2. 목록조회");
		System.out.println("3. 상세조회");
		System.out.println("4. 로그인");
		System.out.println("메뉴 번호 입력 : ");
		String str = Main.SC.nextLine();
		switch (str) {
		case "0":
			System.out.println("프로그램 종료");
			return true;
		case "1":
			join();
			break;
		case "2":
			printList();
			break;
		case "3":
			printMember();
			break;
		case "4":
			login();
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}// switch
		return false;
		
	}

	// 회원가입
	public void join() {
		System.out.println("------회원가입------");
		System.out.println("아이디 : ");
		String id = Main.SC.nextLine();
		System.out.println("패스워드 : ");
		String pwd = Main.SC.nextLine();
		System.out.println("닉네임 : ");
		String nick = Main.SC.nextLine();

		// 데이터 뭉치기
		MemberVo vo = new MemberVo(id, pwd, nick); // 데이터 양이 많으면 setter로 (안정성이 떨어지지만!) 따로따로 채워주는 방법으로.
													// 빈 깡통

		// 저장
		MEMBER_VO_ARRAY[cnt] = vo;
		cnt++;

		// 안내문구
		System.out.println("회원가입 완료 !");
	}

	// 목록 조회
	public void printList() {
		System.out.println("------ 목록 조회 ------");

		for (int i = 0; i < cnt; ++i) {
			System.out.println(i + "번 : " + MEMBER_VO_ARRAY[i].getId());
		}
		System.out.println("------------------------");
	}

	// 상세조회
	public void printMember() {
		System.out.println("------ 상세조회 ------");
		printList();

		System.out.println("번호 입력 : ");
		int num = Integer.parseInt(Main.SC.nextLine());
		MemberVo vo = MEMBER_VO_ARRAY[num];
		System.out.println("<--------------------------->");
		System.out.println("아이디 : " + vo.getId());
		System.out.println("패스워드 : " + vo.getPwd());
		System.out.println("닉네임 : " + vo.getNick());
		System.out.println("<--------------------------->");
		
		System.out.println("---------- ㅁ ㅔ 뉴 ----------");
		System.out.println("1. 닉네임 변경");
		System.out.println("2. 비밀번호 변경");
		System.out.println("3. 회원 탈퇴");
		String menuNum = Main.SC.nextLine();
		switch (menuNum) {
		case "1":
			editNick(vo);break;
		case "2":
			editPwd(vo);break;
		case "3":
			quit(vo);break;
		default:
			System.out.println("잘못된 입력입니다.");

		}

	}
	
	public void editPwd(MemberVo vo) {
		System.out.println("----------비밀번호 변경 -------");
	}
	public void quit(MemberVo vo) {
		System.out.println("-----------회원 탈퇴 -----------");
	}

	// 회원정보 수정 (닉네임 변경)
	public void editNick(MemberVo vo) {
		System.out.println("------ 회원정보 수정(닉네임 변경) ------");
		System.out.println("변경할 닉네임 : ");
		String nick = Main.SC.nextLine();
		vo.setNick(nick);

	}
	
	// 로그인
	public void login() {
		System.out.println("------ 로그인 ------");
	}

}
