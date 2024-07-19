package subway;

import util.KhScanner;

public class SubwaySystem {
	
	public static Subway[] subwayArray = new Subway[100];
	public static int cnt = 0; //저장된 역 갯수

	// 메인 메뉴
	public boolean showMenu() {
		System.out.println("0. 종료하기");
		System.out.println("1. 신규등록");
		System.out.println("2. 목록조회");
		System.out.println("3. 상세조회");

		int inputNum = KhScanner.scanInt(); // 객체 생성 없애고 [class.메소드]로 하기
											// (khscanner에 있는 메소드를 static으로
											// 만들었기 때문에 가능함.)
		switch (inputNum) {
		case 0:
			System.out.println("프로그램 종료");
			return true;
		case 1:
			enroll(); // this(현재객체).enroll 없어도 됨.
			break;
		case 2:
			showList();
			break;
		case 3:
			showDetail();
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
		return false;

	}

	// 역 신규 등록
	public void enroll() {
		System.out.println("----- 신규 등록 -----");
		
		//입력받기
		
		System.out.println("역 이름 : ");
		String name = KhScanner.scanString();
		System.out.println("호선 : ");
		String line = KhScanner.scanString();
		System.out.println("환승여부(true/false) : ");
		boolean isTransfer = KhScanner.scanBoolean();
		System.out.println("내리는 문 (R/L) : ");
		char door =  KhScanner.scanChar();
		System.out.println("사이즈 : ");
		int size =  KhScanner.scanInt();
		
		//객체 만들기
		Subway subway =new Subway();
		subway.setName(name);
		subway.setLine(line);
		subway.setTransfer(isTransfer);
		subway.setDoor(door);
		subway.setSize(size);
		
		// 저장???
		subwayArray[SubwaySystem.cnt] = subway;
		SubwaySystem.cnt++; //클래스 변수니까 ~~~.cnt 는 같은 클래스라 안 써도 되는데 공부 차원에서 씀.
		
		System.out.println("입력된 지하철 정보 : " + subway);
		
		

	}

	// 역 목록 조회
	public void showList() {
		System.out.println("----- 목록 조회 -----");
		
		for(int i =0;i<SubwaySystem.cnt;i++) {
			System.out.println(i +"번  : "+subwayArray[i].getName());
		}//for
	}//method

	// 역 상세 조회 
	/*
	 * 1.a목록보여주기
	 * 2. 번호받기
	 * 3.상세조회
	 */
	public void showDetail() {
		System.out.println("----- 상세 조회 -----");
		
		showList();
		System.out.println("조회할 역 번호 : ");
		int num = KhScanner.scanInt();
		
		System.out.println("역 이름 : "+subwayArray[num].getName());
		System.out.println("호선 : "+subwayArray[num].getLine());
		System.out.println("사이즈 : "+subwayArray[num].getSize());
		System.out.println("내리실 문 : "+subwayArray[num].getDoor());
		
		
	}

}
