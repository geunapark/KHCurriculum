package member;

public class MemberVo {

	
	private String no;
	private String id;
	private String pwd;
	public MemberVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNo() {
		return no;
	}
	public MemberVo(String no, String id, String pwd, String nick, String enrollDate, String modifyDate, String delYn) {
		super();
		this.no = no;
		this.id = id;
		this.pwd = pwd;
		this.nick = nick;
		this.enrollDate = enrollDate;
		this.modifyDate = modifyDate;
		this.delYn = delYn;
	}
	public void setNo(String no) {
		this.no = no;
	}
	@Override
	public String toString() {
		return "MemberVo [no=" + no + ", id=" + id + ", pwd=" + pwd + ", nick=" + nick + ", enrollDate=" + enrollDate
				+ ", modifyDate=" + modifyDate + ", delYn=" + delYn + "]";
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
	public String getEnrollDate() {
		return enrollDate;
	}
	public void setEnrollDate(String enrollDate) {
		this.enrollDate = enrollDate;
	}
	public String getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}
	public String getDelYn() {
		return delYn;
	}
	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}
	private String nick;
	private String enrollDate;
	private String modifyDate;
	private String delYn;
	
}
