package com.kh.app.board.vo;

public class BoardVo {

	private String content; 
	private String title;
	private String writer;
	public BoardVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BoardVo(String content, String title, String writer) {
		super();
		this.content = content;
		this.title = title;
		this.writer = writer;
	}
	@Override
	public String toString() {
		return "BoardVo [content=" + content + ", title=" + title + ", writer=" + writer + "]";
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	} 
}
