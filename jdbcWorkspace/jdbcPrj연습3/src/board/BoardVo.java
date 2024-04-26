package board;

public class BoardVo {
	
	private String title;
	private String content;
	private String enroll_date;
	@Override
	public String toString() {
		return "BoardVo [title=" + title + ", content=" + content + ", enroll_date=" + enroll_date + "]";
	}
	public BoardVo() {
		super();
		// TODO Auto-generated constructor stub
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
	public BoardVo(String title, String content, String enroll_date) {
		super();
		this.title = title;
		this.content = content;
		this.enroll_date = enroll_date;
	}

}
