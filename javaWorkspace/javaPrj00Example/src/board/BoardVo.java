package board;

public class BoardVo {
	private String m_nick;	//멤버닉네임 = MemberVo -> nick
	private int num;		//글번호
	private String title;	//제목
	private String content;	//내용
	private int hits;		//조회수
	private int rec;		//추천
	private static int nextNum = 1;
	public BoardVo() {
		this.num = nextNum++;
	}
	public BoardVo(String m_nick, int num, String title, String content, int hits, int rec) {
		super();
		this.m_nick = m_nick;
		this.num = num;
		this.title = title;
		this.content = content;
		this.hits = hits;
		this.rec = rec;
	}
	
	
	
	
	public BoardVo(String nick,String title, String content) {
		this.m_nick=nick;
		this.title = title;
		this.content = content;
		this.num = nextNum++;
		this.hits=0;
		this.rec=0;
		
	}
	
	
	public String getM_nick() {
		return m_nick;
	}
	public void setM_nick(String m_nick) {
		this.m_nick = m_nick;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
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
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	public int getRec() {
		return rec;
	}
	public void setRec(int rec) {
		this.rec = rec;
	}
	public String toString() {
		return "BoardVo [m_nick=" + m_nick + ", num=" + num + ", title=" + title + ", content=" + content + ", hits="
				+ hits + ", rec=" + rec + "]";
	}
	
	

}
