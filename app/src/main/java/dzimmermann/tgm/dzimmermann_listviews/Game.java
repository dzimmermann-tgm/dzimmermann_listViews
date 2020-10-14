package dzimmermann.tgm.dzimmermann_listviews;

public class Game {

    private String player1;
    private String player2;
    private String player1_score;
    private String player2_score;
    private String status;

    public Game(String player1, String player1_score, String player2, String player2_score, String status) {
        this.player1 = player1;
        this.player2 = player2;
        this.player1_score = player1_score;
        this.player2_score = player2_score;
        this.status = status;
    }

    public String getPlayer1() {
        return player1;
    }

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }

    public String getPlayer1_score() {
        return player1_score;
    }

    public void setPlayer1_score(String player1_score) {
        this.player1_score = player1_score;
    }

    public String getPlayer2_score() {
        return player2_score;
    }

    public void setPlayer2_score(String player2_score) {
        this.player2_score = player2_score;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString()  {
        return player1 + " " + player1_score + " - " + player2_score + " " + player2 + " " + "(" + status + ")";
    }
}
