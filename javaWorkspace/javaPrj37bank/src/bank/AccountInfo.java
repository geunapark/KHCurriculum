package bank;

public class AccountInfo {
	
	public AccountInfo() {
		
		
	}
	
	public AccountInfo(String name, String number, String pwd, String balance) {
		
		this.name = name;
		this.number = number;
		this.pwd = pwd;
		this.balance = balance;
	}
	
	private String name; 	// 예금주
	private String number; //계좌 번호
	private String pwd;		//비밀번호
	private String balance;//잔액
	
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
