package member;

public class MemberVo {
	
	private String no;
	private String id;
	public MemberVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MemberVo [no=" + no + ", id=" + id + ", pwd=" + pwd + ", nick=" + nick + ", enroll=" + enroll
				+ ", modify=" + modify + ", quit=" + quit + "]";
	}
	public MemberVo(String no, String id, String pwd, String nick, String enroll, String modify, String quit) {
		super();
		this.no = no;
		this.id = id;
		this.pwd = pwd;
		this.nick = nick;
		this.enroll = enroll;
		this.modify = modify;
		this.quit = quit;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
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
	public String getEnroll() {
		return enroll;
	}
	public void setEnroll(String enroll) {
		this.enroll = enroll;
	}
	public String getModify() {
		return modify;
	}
	public void setModify(String modify) {
		this.modify = modify;
	}
	public String getQuit() {
		return quit;
	}
	public void setQuit(String quit) {
		this.quit = quit;
	}
	private String pwd;
	private String nick;
	private String enroll;
	private String modify;
	private String quit;

}
