package member;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;



public class MemberController {
	
	public void join()throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		//입력받기
		System.out.println("아이디 : ");
		String id = sc.nextLine();
		System.out.println("비밀번호 : ");
		String pwd = sc.nextLine();
		System.out.println("닉네임 : ");
		String nick = sc.nextLine();
		
		//검증하기
		
		//데이터뭉치기
		
		//저장하기
		String filepath = "D:\\dev\\abc.txt";
		FileOutputStream fos = new FileOutputStream(filepath);
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		osw.write(id);
		osw.write(pwd);
		osw.write(nick);
		
		osw.flush();
	
		System.out.println("성공 나이스~~~~");
		// \t 탭 \r 앞으로가기
	}//method

}
