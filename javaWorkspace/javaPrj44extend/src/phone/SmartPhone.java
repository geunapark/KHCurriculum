package phone;

public class SmartPhone {
	public String os;//OS
	public String model;//모델
	public int price;//가격
	public String cpu;//CPU
	public String ram;//램
	public int pixel;//해상도
	
	
	//전화하기
	public void call(){
		System.out.println("call~");
	}	
	//사진찍기
	public void photo() {
		System.out.println("photo~");
	}
	//문자하기
	public void sms() {
		System.out.println("sms~");
	}
	//전원켜기
	public void powerOn() {
		System.out.println("powerOn~");
	}
	//전원종료
	public void powerOff() {
		System.out.println("powerOff~");
	}

}
