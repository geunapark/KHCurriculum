package main;

public class ApiVo {

    private ResponseVo response;

    public ResponseVo getResponse() {
        return response;
    }

    public void setResponse(ResponseVo response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "ApiVo{" +
                "response='" + response + '\'' +
                '}';
    }
}
