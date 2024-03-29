package bank;



public class AccountInfo {
	private String name;		//예금주
	private String number;		//계좌번호
	private String pwd;			//비밀번호
	private String balance;		//잔액
	
	//overloading - 생성자 overloading 메소드 overloading 
	//같은 AccountInfo()생성자혹은 매소드라도
	//AccountInfo(String name, String number, String pwd, String balance)
	//다르게 생각 (매개변수)
	//메소드 이름은 같으나
	//파라미터를 다르게 하여
	//동일한 이름의 메소드를 여러개 작성
	
	//생성자 : 객체생성을 목적으로 함
	//		 객체가 생성될 때 수행될 내용을 작성할 수 있음
	//		 내부적으로 객체 생성 및 리턴을 자동으로 해줌
	//		 ※주의사항 : 클래스명과 일치해야함
	
	//메소드 : 명령어 모아둔 것
	//		 여러 명령을 모아두어 재사용을 용이하게 함.
	//		 반복되는 작업, 중복되는 작업 제거에 좋음
	//		 문법은 ~~~.
	//		 메소드 이름은 내용을 알기 쉽게 작성하는게 좋음 camelCase로 작성
	//		 리턴값에 맞춰 리턴타입을 작성해야 함
	
	//캡슐화 : 데이터를 외부로 못쓰게함
	//-private
	//-getter/setter
	//-생성자 2개
	//-toString
	
	public AccountInfo() {
	}
	public AccountInfo(String name, String number, String pwd, String balance) {
		super();
		this.name = name;
		this.number = number;
		this.pwd = pwd;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String toString() {
		return "AccountInfo [name=" + name + ", number=" + number + ", pwd=" + pwd + ", balance=" + balance + "]";
	}
	
	

}
