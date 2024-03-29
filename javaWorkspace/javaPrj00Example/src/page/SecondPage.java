package page;

import board.BoardVo;
import board.CommentVo;
import member.MemberVo;

public class SecondPage {
	public static final BoardVo[] BOARD_VO_ARR=new BoardVo[100];
	public static int b_cnt=0;
	public static final CommentVo[] COMMENT_VO_ARR=new CommentVo[10];
	public static int c_cnt=0;
	
	
	public boolean secStart(MemberVo mv) {
		showMenu();
		int userInput=FirstPage.inputScan.scanInt();
		switch (userInput) {
		case 0: {
			System.out.println("로그아웃...");
			return true;
		}
		case 1: {
			write(mv);
			break;
		}
		case 2: {
			view(mv);
			break;
		}
		case 3: {
			myActivitie(mv);
			break;
		}
		
		default:
			System.err.println("잘못입력하셨습니다. 다시입력해주세요!");
		}
		return false;
	}
	private void showMenu() {
		System.out.println("===== 게시판 메뉴 =====");
		System.out.println("0. 로그아웃");
		System.out.println("1. 글쓰기");
		System.out.println("2. 글목록보기");
		System.out.println("3. 나의 활동");
		System.out.println("--------------------");
	}
	
	//글쓰기
	private void write(MemberVo mv) {
		System.out.println("===== 글쓰기 =====");
		System.out.print("제목	: ");
		String title=FirstPage.inputScan.scanString();
		System.out.print("내용	: ");
		String content=FirstPage.inputScan.scanString();
		
		BoardVo bv=new BoardVo(mv.getNick(),title,content);
		BOARD_VO_ARR[b_cnt++]=bv;
		System.out.println("작성 완료!");
	}
	
	//글목록보기
	private void view(MemberVo mv) {
		System.out.println("===== 글목록보기 =====");
		for(int i=0;i<b_cnt;i++) {
			System.out.println("글번호 : "+BOARD_VO_ARR[i].getNum()+
					"	글제목 : "+BOARD_VO_ARR[i].getTitle()+
					"	닉네임 : "+BOARD_VO_ARR[i].getM_nick());
		}
		System.out.println("-------------------------------------------");
		System.out.print("상세 조회 하시겠습니까?(y/n)");
		String userChoice=FirstPage.inputScan.scanString();
		if(userChoice.equals("y")) {
			System.out.print("글번호를 입력해 주세요 : ");
			int b_num=FirstPage.inputScan.scanInt();
			viewDetail(b_num,mv);
		}
		
	}
	
	//나의활동
	public void myActivitie(MemberVo mv) {
		System.out.println("===== 작성한 글 =====");
		for(int i=0;i<b_cnt;i++) {
			if(mv.getNick().equals(BOARD_VO_ARR[i].getM_nick())) {
				System.out.println("글번호 : "+BOARD_VO_ARR[i].getNum()+
						"	글제목 : "+BOARD_VO_ARR[i].getTitle()+
						"	닉네임 : "+BOARD_VO_ARR[i].getM_nick());
			}
		}
		System.out.println("===== 작성한 답글 =====");
		for(int i=0;i<c_cnt;i++) {
			if(mv.getNick().equals(COMMENT_VO_ARR[i].getM_nick())) {
				System.out.println("댓글번호 : "+COMMENT_VO_ARR[i].getC_Num()+
						"	댓글내용 : "+COMMENT_VO_ARR[i].getC_Content()+
						"	닉네임 : "+COMMENT_VO_ARR[i].getM_nick());
			}
		}
		
	}
	
	//상세조회
	private void viewDetail(int b_num,MemberVo mv) {
		System.out.println("===== 상세조회 =====");
		for(int i=0;i<b_cnt;i++) {
			if(BOARD_VO_ARR[i].getNum()==b_num) {
				BOARD_VO_ARR[i].setHits(BOARD_VO_ARR[i].getHits()+1);
				System.out.println("글번호 : "+BOARD_VO_ARR[i].getNum()+
						"	글제목 : "+BOARD_VO_ARR[i].getTitle()+
						"	닉네임 : "+BOARD_VO_ARR[i].getM_nick());
				System.out.println("조회수 : "+BOARD_VO_ARR[i].getHits()+
						"	추천수 : "+BOARD_VO_ARR[i].getRec());
				System.out.println("내용");
				System.out.println(BOARD_VO_ARR[i].getContent());
				
				viewDetailMenu();
				System.out.print("번호를 입력해주세요 : ");
				int userInput=FirstPage.inputScan.scanInt();
				switch (userInput) {
				case 0: {
					System.out.println("돌아가는중...");
					return;
				}
				case 1: {
					b_rec(b_num);
					break;
				}
				case 2: {
					b_comment(b_num,mv);
					break;
				}
				case 3: {
					b_commentView(b_num);
					break;
				}
				default:
					System.err.println("잘못입력하셨습니다. 다시입력해주세요!");
				}
				
				
				
				break;
			}else {
				System.out.println("조회할수 없습니다...");
			}
		}
	}
	
	//상세조회 메뉴
	private void viewDetailMenu() {
		System.out.println("===== 상세조회메뉴 =====");
		System.out.println("0. 돌아가기");
		System.out.println("1. 추천하기");
		System.out.println("2. 댓글달기");
		System.out.println("3. 댓글보기");
	}
	//추천하기
	private void b_rec(int b_num) {
		for(int i=0;i<FirstPage.cnt;i++) {
			if(BOARD_VO_ARR[i].getNum()==b_num) {
				BOARD_VO_ARR[i].setRec(BOARD_VO_ARR[i].getRec()+1);
				System.out.println("추천 완료!");
				break;
			}
		}
		
		
	}
	//댓글달기
	private void b_comment(int b_num,MemberVo mv) {
		System.out.println("===== 댓글달기 =====");
		System.out.print("댓글 내용 : ");
		String c_content=FirstPage.inputScan.scanString();
		CommentVo cv=new CommentVo(c_content,b_num,mv.getNick());
		COMMENT_VO_ARR[c_cnt++]=cv;
		System.out.println("작성완료!");
		
	}
	//댓글보기
	private void b_commentView(int b_num) {
		for(int i=0;i<c_cnt;i++) {
			if(COMMENT_VO_ARR[i].getB_Num()==b_num) {
				System.out.println("댓글번호 : "+COMMENT_VO_ARR[i].getC_Num()+
						"	댓글내용 : "+COMMENT_VO_ARR[i].getC_Content()+
						"	닉네임 : "+COMMENT_VO_ARR[i].getM_nick());
			}
		}
		
	}

}
