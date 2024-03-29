package board;

import main.Main;

public class BoardController {
	public static final BoardVo [] BOARD_VO_ARR=new BoardVo[100];
	private static int cnt=0;
	
	//게시판 메뉴
	public boolean printMenu() {
		System.out.println("===== 게시판 메뉴 =====");
		System.out.println("0. 종료하기");
		System.out.println("1. 게시글 작성");
		System.out.println("2. 게시글 목록 조회");
//		System.out.println("3. 게시글 상세 조회");
		System.out.print("메뉴 번호 : ");
		String num=Main.SC.nextLine();
		
		switch (num) {
		case "0": {
			System.out.println("프로그램 종료");
			return true;
		}
		case "1": {
			insertBoard();
			break;
		}
		case "2": {
			selectBoard();
			break;
		}
//		case "3": {
//			selectBoardDetail();
//			break;
//		}
		default:
			System.out.println("잘못 입력 하셨습니다 !");
		}
		return false;
		
	}
	//게시글 작성
	private void insertBoard() {
		System.out.println("----- 게시글 작성 -----");
		System.out.print("제목	: ");
		String title=Main.SC.nextLine();
		System.out.print("내용	: ");
		String content=Main.SC.nextLine();
		System.out.print("작성자	: ");
		String writerNick=Main.SC.nextLine();
		
		BoardVo vo=new BoardVo();
		vo.setTitle(title);
		vo.setContent(content);
		vo.setWriterNick(writerNick);
		
		BOARD_VO_ARR[cnt++]=vo;
		System.out.println("작성 완료!!!");
		
		
	}
	
	//게시글 목록 조회
	private void selectBoard() {
		System.out.println("----- 게시글 목록 조회 -----");
		for(int i=0;i<cnt;i++) {
			System.out.println((i+1)+". "+BOARD_VO_ARR[i].getTitle());
		}
		System.out.println("-----------------------");
		System.out.println("0. 돌아가기");
		System.out.println("1. 상세조회");
//		System.out.println("2. 수정하기");
//		System.out.println("3. 삭제하기");
		System.out.print("메뉴 번호 : ");
		String num = Main.SC.nextLine();
		
		switch (num) {
		case "0": {
			System.out.println("이전 메뉴로 돌아가기...");
			return;
		}
		case "1": {
			selectBoardDetail();
			break;
		}
//		case "2": {
//			editBoard();
//			break;
//		}
//		case "3": {
//			deleteBoard();
//			break;
//		}
		default:
			System.out.println("잘못 입력 하셨습니다 !");
		}
		
		
		
		
	}
	
	
	private void editBoard(BoardVo vo) {
		System.out.println("----- edit Board -----");
		System.out.print("내용 수정 : ");
		String content=Main.SC.nextLine();
		vo.setContent(content);
		System.out.println("수정 완료 !!!!");
		
	}
//	private void deleteBoard() {
//		System.out.println("----- delete Board -----");
//	}
	
	
	//게시글 상세 조회
	private void selectBoardDetail() {
		
		System.out.print("상세 조회할 번호 입력 : ");
		int num=Integer.parseInt(Main.SC.nextLine());
		BoardVo vo=BOARD_VO_ARR[num-1];
		System.out.println("-----------------------");
		System.out.println("제목	: "+vo.getTitle());
		System.out.println("내용	: "+vo.getContent());
		System.out.println("작성자	: "+vo.getWriterNick());
		System.out.println("-----------------------");
		System.out.print("수정 할거니 ?(yes/no) : ");
		String str=Main.SC.nextLine();
		if(str.equals("yes")) {
			editBoard(vo);
		}
		
		
	}
	
}

