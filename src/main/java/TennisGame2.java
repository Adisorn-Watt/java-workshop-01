public class TennisGame2 {
    private int player1Point; //No need to set to 0 cuz it default value
    private int player2Point;

    private final String player1Name;
    private final String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getResultInTennisPattern(int point) {
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
        String player1Result;
        String player2Result;
        String score = "";

        boolean isDeuce = player1Point == player2Point && player1Point >= 3;
        if (isDeuce) {
            return  "Deuce";
        }
        boolean equal_but_not_deuce = player1Point == player2Point && player1Point < 3;
        if (equal_but_not_deuce) {
            score = getResultInTennisPattern(player1Point);
            score += "-All";
        }


        if (player1Point > 0 && player2Point ==0) {
            // player1 any point vs player2 0 point
            player1Result = getResultInTennisPattern(player1Point);
            player2Result = "Love";
            score = player1Result + "-" + player2Result;
        }
        if (player2Point > 0 && player1Point ==0) {
            // player1 0 point vs player2 any point
            player2Result = getResultInTennisPattern(player2Point);
            player1Result = "Love";
            score = player1Result + "-" + player2Result;
        }

        if (player1Point > player2Point && player1Point < 4) {
            // player1 > player2 but p1 < 4
            player1Result = getResultInTennisPattern(player1Point);
            player2Result = getResultInTennisPattern(player2Point);
            score = player1Result + "-" + player2Result;
        }
        if (player2Point > player1Point && player2Point < 4) {
            // player1 < player2 but p2 < 4
            player1Result = getResultInTennisPattern(player1Point);
            player2Result = getResultInTennisPattern(player2Point);
            score = player1Result + "-" + player2Result;
        }

        // Make playerName dynamic
        if (player1Point > player2Point && player2Point >= 3) {
            score = "Advantage " + player1Name;
        }

        if (player2Point > player1Point && player1Point >= 3) {
            score = "Advantage " + player2Name;
        }

        if (player1Point >=4 && player2Point >=0 && (player1Point - player2Point)>=2) {
            score = "Win for " + player1Name;
        }
        if (player2Point >=4 && player1Point >=0 && (player2Point - player1Point)>=2) {
            score = "Win for " + player2Name;
        }
        return score;
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
