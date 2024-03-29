package board;

public class CommentVo {
	private int c_Num=0;		//댓글번호
	private String c_Content;	//댓글내용
	private int b_Num;			//게시판번호 = BoardVo -> num
	private String m_nick;		//멤버닉네임 = MemberVo -> nick
	private static int nextC_Num = 1;
	public CommentVo() {
		this.c_Num = nextC_Num++;
	}
	public CommentVo(int c_Num, String c_Content, int b_Num, String m_nick) {
		super();
		this.c_Num = c_Num;
		this.c_Content = c_Content;
		this.b_Num = b_Num;
		this.m_nick = m_nick;
	}
	
	
	public CommentVo(String c_Content,int b_Num,String m_nick) {
		this.c_Content = c_Content;
		this.c_Num = nextC_Num++;
		this.b_Num=b_Num;
		this.m_nick=m_nick;
	}
	
	
	
	public int getC_Num() {
		return c_Num;
	}
	public void setC_Num(int c_Num) {
		this.c_Num = c_Num;
	}
	public String getC_Content() {
		return c_Content;
	}
	public void setC_Content(String c_Content) {
		this.c_Content = c_Content;
	}
	public int getB_Num() {
		return b_Num;
	}
	public void setB_Num(int b_Num) {
		this.b_Num = b_Num;
	}
	public String getM_nick() {
		return m_nick;
	}
	public void setM_nick(String m_nick) {
		this.m_nick = m_nick;
	}
	public String toString() {
		return "CommentVo [c_Num=" + c_Num + ", c_Content=" + c_Content + ", b_Num=" + b_Num + ", m_nick=" + m_nick
				+ "]";
	}
	
	
	

}