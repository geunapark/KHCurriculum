package member;

public class MemberVo {
	
	public MemberVo() {
		
	}
	
	public MemberVo(String id, String pwd, String nick) {
		this.id = id;
		this.pwd = pwd;
		this.nick = nick;
	}
	
	private String id;
	private String pwd;
	private String nick;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	
	
	public String toString() {
		return "MemberNo [id=" + id + ", pwd=" + pwd + ", nick=" + nick + "]";
	}
	
	
	
	
	
	
}
