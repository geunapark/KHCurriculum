package test;

public class AccountInfo {
	private String balance;
	private String name;
	public AccountInfo() {
	}
	public AccountInfo(String balance, String name) {
		super();
		this.balance = balance;
		this.name = name;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "AccountInfo [balance=" + balance + ", name=" + name + "]";
	}
	
	

}
