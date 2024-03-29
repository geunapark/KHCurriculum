package board;

public class BoardVo {
	
	private String no;
	public BoardVo() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getEnroll_date() {
		return enroll_date;
	}
	public void setEnroll_date(String enroll_date) {
		this.enroll_date = enroll_date;
	}
	public BoardVo(String no, String title, String content, String enroll_date) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.enroll_date = enroll_date;
	}
	@Override
	public String toString() {
		return "BoardVo [no=" + no + ", title=" + title + ", content=" + content + ", enroll_date=" + enroll_date + "]";
	}
	private String title;
	private String content;
	private String enroll_date;

}
