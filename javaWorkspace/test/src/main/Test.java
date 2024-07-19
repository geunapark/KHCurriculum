package main;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

	public void output() {
	    FileWriter fw = null;
	    try {
	        fw = new FileWriter("test.txt");
	        fw.write('a'); // 'a'를 파일에 쓰기
	        fw.write('A'); // 'A'를 파일에 쓰기
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (fw != null) {
	                fw.close(); // FileWriter를 닫습니다.
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}
}

