package test;

public class AccountInfo {

	
	
	public AccountInfo() {
		
		
	}
	
	public AccountInfo(boolean balance, String name) {
		super();
		this.balance = balance;
		this.name = name;
	}

	private boolean balance;
	private String name;
	
	public boolean isBalance() {
		return balance;
	}
	public void setBalance(boolean balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "AccountInfo [balance=" + balance + ", name=" + name + "]";
	}
	
	
	
	
}
