package member;

public class MemberVo {

	private String id ="";
	public MemberVo(String id, String pwd, String nick) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.nick = nick;
	}
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
	public MemberVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MemberVo [id=" + id + ", pwd=" + pwd + ", nick=" + nick + "]";
	}
	private String pwd ="";
	private String nick ="";
	
}
