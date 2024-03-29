package subway;

import util.KhScanner;

public class SubwaySystem {
	
	public static final Subway[] subwayArray=new Subway[100];
	private static int cnt=0;
	
	
	
	//메인메뉴
	public boolean showMenu() {
		System.out.println("0. 종료하기");
		System.out.println("1. 신규등록");
		System.out.println("2. 목록조회");
		System.out.println("3. 상세조회");
		
		int inputNum=KhScanner.scanInt();
		switch (inputNum) {
		case 0: {
			System.out.println("프로그램 종료...");
			return true;
		}
		case 1: {
			enroll();
			break;
		}
		case 2: {
			showList();
			break;
		}
		case 3: {
			showDetail();
			break;
		}
		default:
			System.out.println("잘못 입력 하셨습니다. 다시 입력해 주세요.");
			showMenu();
		}
		return false;
	}
	
	//역 신규 등록
	public void enroll() {
		System.out.println("----- 신규 등록 -----");
		//데이터 입력 받기
		System.out.print("역 이름 : ");
		String name=KhScanner.scanString();
		System.out.print("호선 이름 : ");
		String line=KhScanner.scanString();
		System.out.print("환승여부(true/false) : ");
		boolean isTransfer=KhScanner.scanBoolean();
		System.out.print("내리는 문(R/L) : ");
		char door=KhScanner.scanChar();
		System.out.print("기차 길이 : ");
		int size=KhScanner.scanInt();
		
		//객체 만들기
		Subway subway= new Subway();
		subway.setName(name);
		subway.setLine(line);
		subway.setTransfer(isTransfer);
		subway.setDoor(door);
		subway.setSize(size);
		
		//저장 
		SubwaySystem.subwayArray[SubwaySystem.cnt]=subway;
		SubwaySystem.cnt++;
		
		
		System.out.println("입력된 지하철 정보 : "+subway);
	}
	//역 목록 조회
	public void showList() {
		System.out.println("----- 목록 조회 -----");
		for(int i=0;i<cnt;i++) {
			System.out.println((i+1)+" : "+SubwaySystem.subwayArray[i].getName());
		}
		
	}
	//역 상세 조회
	public void showDetail() {
		System.out.println("----- 상세 조회 -----");
		showList();
		System.out.print("조회할 역 번호 : ");
		int num = KhScanner.scanInt();
		
		System.out.println("역 이름		: "+subwayArray[num-1].getName());
		System.out.println("호선 이름		: "+subwayArray[num-1].getLine());
		System.out.println("사이즈 이름	: "+subwayArray[num-1].getSize());
		System.out.println("내리실문 이름 	: "+subwayArray[num-1].getDoor());
	}

}
