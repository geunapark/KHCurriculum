//class Solution {
//	public int solution(int[] num_list) {
//		int answer = 0;
//
//		// 정수가 담긴 리스트 num_list가 주어짐
//		// num_list의 홀수만 순서대로 이어 붙인 수
//		// 짝수만 순서대로 이어붙인수의 합을 리턴
//
//		// int -> String Integer.toString()
//		// String -> int Integer.parseInt()
//
//		String a = "";
//		String b = "";
//
//		for (int i = 0; i < num_list.length; i++) {
//			if (num_list[i] % 2 == 1) {
//				a += Integer.toString(num_list[i]);
//
//			} else if (num_list[i] % 2 == 0) {
//				b += Integer.toString(num_list[i]);
//			}
//		}
//
//		int c = Integer.parseInt(a);
//		int d = Integer.parseInt(b);
//		answer = c + d;
//
//				class Solution {
//    public int[] solution(int l, int r) {
//        int[] answer = {};
//        
//        
//        System.out.println(l);
//        System.out.println(r);
//        //정수 l과 
//        //l이상 r이하의 정수중 수자 0과 5로만 이루어진 모든 정수
//        //오름차순으로 저장한 배열을 리턴하는 
//        //그러한 정수가 없다면 -1이 담긴 배열을 리턴
//        
//        
//        
//        
//        return answer;
//    }
//}


//		return answer;
//	}
//}
//	String a = "박진동 박근아";
//	String [] b  = a.split(""); // String [] b = new String [7];
//			int[] x = new int [3];
//String [] z = {w,a,d,a,w,s,d,a,s,s,w}; 
//			   0 1 2 3 4 5 6 7 8 9 10
//class Solution {
//    public int solution(int n, String control) {
//        int answer = 0;
//        
//       //정수 n과 문자열 control
//       //control은 w,a,s,d의 4개 문자로 이루어져있음
//       //comtrol의 앞에서부터 순서대로 문자에 따라 n의 값을 바꿔준다
//       
//       w = Integer.parseInt(control);
//        
//        
//        System.out.println(n);
//        System.out.println(control);
//        
//        
//        return answer;
//    }
//}
//			   
//			   // 
//			   

/*
 * 영어 알파벳으로 이루어진 문자열 str
 * 각 알파벳을 대문자는 소문자로 
 * 소문자는 대문자로 변환해서 출력하는 코드
 */


/*
 * 연산 +는 두 정수에 대한 연산으로 두 정수를 붙여 쓴 값을 반환한다
 * 12+3운 123 3+12 312
 * 양의 정수 a와 b
 * a+b와 b+a중 더 큰값을 리턴
 */

//       // int -> String Integer.toString()
//       // String -> int Integer.parseInt()

//class Solution {
//	public int solution(int a, int b) {
//		int answer = 0;
//		
//		int q= 0;
//		int p = 0;
//		String x = Integer.toString(a);
//		String y = Integer.toString(b);
//		q = Integer.parseInt(x+y);
//		p = Integer.parseInt(y+x);
//		 
//		
//		
//		if(q<p) {
//			answer = p;
//		}else if(p<q) {
//			answer = q;
//		}else if(q == p) {
//			answer = q;
//		}
//		
//		return answer;
//		
//		
//		
//	}
//}


/*
 * 1부터 6까지 숫자가 적힌 주사위 3개
 * 주사위를 굴려서 나온 숫자를 각 a,b,c
 * 세 숫자가 모두 다 다르다면 a+b+c
 * 세 숫자중 두개는 같고 하나가 다르다면 (a+b+c) *(a*a +b*b+c*c)
 * 세 숫자가 모두 같다면(a+b+c) * (a*a+b*b+c*c) +(a*a*a+b*b*b+c*c*c)
 * 
 */




