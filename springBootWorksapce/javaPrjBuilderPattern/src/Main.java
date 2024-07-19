public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        BoardVo.BoardVoBuilder x = new BoardVo.BoardVoBuilder();
        x.setContent("냥농냥뇽");
        x.setTitle("개빡칭단 냥농냉농");
        BoardVo vo = x.cerateBoardVo();

    }
}