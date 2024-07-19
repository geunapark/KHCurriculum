package com.kh.app.board.vo;

public class BoardVo {

    private String title;
    private String content;
    private String writer;

    public BoardVo(String writer, String content, String title) {
        this.writer = writer;
        this.content = content;
        this.title = title;
    }

    public BoardVo() {
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getWriter() {
        return writer;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    @Override
    public String toString() {
        return "BoardVo{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }


}
