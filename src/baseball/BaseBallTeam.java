package baseball;

public class BaseBallTeam {
    //フィールド
    private String name;   // チーム名
    private int win;       //勝ち数
    private int lose;      //負け数
    private int draw;      //引分


    // 引数なしのコンストラクタ
    public BaseBallTeam() {

}
   // 引数があるコンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
     this.name = name;
     this.win = win;
     this.lose = lose;
     this.draw = draw;
    }

    public double getRate() {
        double getRate =   (double)win / ( win + lose );
        return (double) getRate;
    }

    public void report() {
        double syouritsu = getRate();
        System.out.println( name + "の2022年の成績は" + win + "勝" + lose + "敗" + draw +"分、勝率は" + syouritsu + "です。");
    }}

