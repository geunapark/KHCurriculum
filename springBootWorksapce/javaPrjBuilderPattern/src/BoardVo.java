public class BoardVo {

    private String title;
    private String content;

    private BoardVo(){}

    static class BoardVoBuilder{
        private String title;
        private String content;


    public BoardVoBuilder title(String title) {
        this.title = title;
        return this;
        
    }

    public BoardVoBuilder content(String content) {
        this.content = content;
        return this;
    }

        public BoardVo cerateBoardVo(){
            BoardVo vo = new BoardVo();
            vo.title = this.title;
            vo.content = this.content;
            return vo;
        }

    }


}
