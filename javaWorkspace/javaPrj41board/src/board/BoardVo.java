package board;

public class BoardVo {
	private String title;
	private String content;
	private String writerNick;
	private String enrollDate;
	private int hit;
	public BoardVo(String title, String content, String writerNick, String enrollDate, int hit) {
		super();
		this.title = title;
		this.content = content;
		this.writerNick = writerNick;
		this.enrollDate = enrollDate;
		this.hit = hit;
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
	public String getWriterNick() {
		return writerNick;
	}
	public void setWriterNick(String writerNick) {
		this.writerNick = writerNick;
	}
	public String getEnrollDate() {
		return enrollDate;
	}
	public void setEnrollDate(String enrollDate) {
		this.enrollDate = enrollDate;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	@Override
	public String toString() {
		return "BoardVo [title=" + title + ", content=" + content + ", writerNick=" + writerNick + ", enrollDate="
				+ enrollDate + ", hit=" + hit + "]";
	}
	
	
	
	
}
