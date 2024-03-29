package board;

public class BoardVo {
	
	private String no;
	private String title;
	private String conrent;
	private String enrollDate;
	
	@Override
	public String toString() {
		return "BoardVo [no=" + no + ", title=" + title + ", conrent=" + conrent + ", enrollDate=" + enrollDate + "]";
	}
	public BoardVo(String no, String title, String conrent, String enrollDate) {
		super();
		this.no = no;
		this.title = title;
		this.conrent = conrent;
		this.enrollDate = enrollDate;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getConrent() {
		return conrent;
	}
	public void setConrent(String conrent) {
		this.conrent = conrent;
	}
	public String getEnrollDate() {
		return enrollDate;
	}
	public void setEnrollDate(String enrollDate) {
		this.enrollDate = enrollDate;
	}
	public BoardVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
