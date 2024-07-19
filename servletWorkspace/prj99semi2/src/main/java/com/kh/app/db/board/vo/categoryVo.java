package com.kh.app.db.board.vo;

public class categoryVo {

	private String no;
	private String name;
	public categoryVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public categoryVo(String no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	@Override
	public String toString() {
		return "categoryVo [no=" + no + ", name=" + name + "]";
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
	

