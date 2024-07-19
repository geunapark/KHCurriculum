package main;

public class ResponseVo {

    private BodyVo body;

    public HeaderVo getHeader() {
        return header;
    }

    public void setHeader(HeaderVo header) {
        this.header = header;
    }

    public BodyVo getBody() {
        return body;
    }

    public void setBody(BodyVo body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "ResponseVo{" +
                "body=" + body +
                ", header=" + header +
                '}';
    }

    private HeaderVo header;
}
