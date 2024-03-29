package main;


//컨트롤+쉬프트+O 한번에 import 가능
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import mamber.controller.MemberController;

public class Main {

	public static void main (String[] args) throws Exception {
		
		
		System.out.println("----- IO -----");
		
		MemberController mc = new MemberController();
		mc.printMenu();
		
	
	
				

		
//		System.out.println("----- IO -----");
//		//파일 객체 준비
//		String filePath = "D\\dev\\abc.txt";
//		File f =  new File(filePath);
//		//파일에 2byte씩 내보내는 통로 준비(메인스트림 + 보조 스트림)
//		FileWriter fw = new FileWriter(f); //메인
//		BufferedWriter bw = new BufferedWriter(fw); //보조
//		
//		//파일에서 2byte씩 읽어들이는 통로준비 (메인스트름 + 보조스트림)
//		FileReader fr = new FileReader(f); // 메인
//		BufferedReader  br = new BufferedReader(fr); //보조
		
	}//Main

}//class
