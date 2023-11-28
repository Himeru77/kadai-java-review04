package baseball;

public class Review03 {

    public static void main(String[] args) {
        BaseBallTeam A = new BaseBallTeam ("東京ヤクルトスワローズ",80,59,4);
        BaseBallTeam B = new BaseBallTeam ("横浜DeNAベイスターズ",73,68,2);
        BaseBallTeam C = new BaseBallTeam ("阪神タイガーズ",68,71,4);
        BaseBallTeam D = new BaseBallTeam ("読売ジャイアンツ",68,72,3);
        BaseBallTeam E = new BaseBallTeam ("広島東洋カープ",66,74,3);
        BaseBallTeam F = new BaseBallTeam ("中日ドラゴンズ",66,75,2);

        A.report();
        B.report();
        C.report();
        D.report();
        E.report();
        F.report();
}}


