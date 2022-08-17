package refactoring_tennis;

public class TennisGame {
    private static final int scoreIs0 = 0;
    private static final int scoreIs1 = 1;
    private static final int scoreIs2 = 2;
    private static final int maxScore = 3;

    public static String getScore(int player1Score, int player2Score) {
        String score = "";
        int tempScore;
        boolean equalScore = (player1Score == player2Score);
        boolean scorePlayer1Greater4 = (player1Score >= 4);
        boolean scorePlayer2Greater4 = (player2Score >= 4);
        if (equalScore) {
            score = checkScore(player1Score);
        } else if (scorePlayer1Greater4 || scorePlayer2Greater4) {
            int minusResult = player1Score - player2Score;
            score = checkMinusResult(minusResult);
        } else {
            for (int i = scoreIs1; i < maxScore; i++) {
                if (i == scoreIs1) {
                    tempScore = player1Score;
                } else {
                    score += "-";
                    tempScore = player2Score;
                }
                score = checkTempScore(tempScore, score);
            }
        }
        return score;
    }

    public static String checkMinusResult(int minusResult) {
        String score;
        if (minusResult == 1) {
            score = "Advantage player1";
        } else if (minusResult == -1) {
            score = "Advantage player2";
        } else if (minusResult >= 2) {
            score = "Win for player1";
        } else score = "Win for player2";
        return score;
    }

    public static String checkScore(int mScore) {
        String score;
        switch (mScore) {
            case scoreIs0:
                score = "Love-All";
                break;
            case scoreIs1:
                score = "Fifteen-All";
                break;
            case scoreIs2:
                score = "Thirty-All";
                break;
            case maxScore:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;
        }
        return score;
    }

    public static String checkTempScore(int tempScore, String score) {
        switch (tempScore) {
            case scoreIs0:
                score += "Love";
                break;
            case scoreIs1:
                score += "Fifteen";
                break;
            case scoreIs2:
                score += "Thirty";
                break;
            case maxScore:
                score += "Forty";
                break;
        }
        return score;
    }
}
