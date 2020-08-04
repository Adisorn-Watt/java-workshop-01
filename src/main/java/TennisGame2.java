public class TennisGame2 {
    private int player1Point; //No need to set to 0 cuz it default value
    private int player2Point;

    private final String player1Name;
    private final String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String textScores(int point) {
        switch (point) {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
        }
        return "Forty";
    }

    public String getScore() {
        boolean isDeuce = player1Point == player2Point && player1Point >= 3;
        if (isDeuce) {
            return  "Deuce";
        }
        boolean equal_but_not_deuce = player1Point == player2Point && player1Point < 3;
        if (equal_but_not_deuce) {
            return textScores(player1Point) + "-All";
        }

        // Win
        boolean player1Win = player1Point >= 4 && player2Point >= 0 && (player1Point - player2Point) >= 2;
        if (player1Win) {
            return  "Win for " + player1Name;
        }
        boolean player2Win = player2Point >= 4 && player1Point >= 0 && (player2Point - player1Point) >= 2;
        if (player2Win) {
            return  "Win for " + player2Name;
        }

        // Advantage
        boolean player1Advantage = player1Point > player2Point && player2Point >= 3 && (player1Point - player2Point) == 1;
        if (player1Advantage) {
            return  "Advantage " + player1Name;
        }
        boolean player2Advantage = player2Point > player1Point && player1Point >= 3 && (player2Point - player1Point) == 1;
        if (player2Advantage) {
            return  "Advantage " + player2Name;
        }
        return textScores(player1Point) + "-" + textScores(player2Point);
    }

    public void player1Score() {
        player1Point++;
    }

    public void player2Score() {
        player2Point++;
    }

    public void wonPoint(String player) {
        // if (player.equals("player1")) // 1  => NullPointerException (NPE) => There's a change to access Null
        if ("player1".equals(player)) { // 2 (Suggestion) => Null Safety => There's no change to access Null
            player1Score();
        }else {
            player2Score();
        }
    }
}
