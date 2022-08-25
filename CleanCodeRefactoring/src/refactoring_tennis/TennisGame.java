package refactoring_tennis;

public class TennisGame {
    private static final int SCORE_IS_0 = 0;
    private static final int SCORE_IS_1 = 1;
    private static final int SCORE_IS_2 = 2;
    private static final int SCORE_IS_3 = 3;
    public static final String LOVE_ALL = "Love-All";
    public static final String FIFTEEN_ALL = "Fifteen-All";
    public static final String THIRTY_ALL = "Thirty-All";
    public static final String FORTY_ALL = "Forty-All";
    public static final String DEUCE = "Deuce";
    public static final String ADVANTAGE_PLAYER_1 = "Advantage player1";
    public static final String ADVANTAGE_PLAYER_2 = "Advantage player2";
    public static final String WIN_FOR_PLAYER_1 = "Win for player1";
    public static final String WIN_FOR_PLAYER_2 = "Win for player2";
    public static final String LOVE = "Love";
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";

    public static String getScore(int player1Score, int player2Score) {
        String score = "";
        boolean equalScore = (player1Score == player2Score);
        boolean scorePlayer1Greater4 = (player1Score >= 4);
        boolean scorePlayer2Greater4 = (player2Score >= 4);
        if (equalScore) {
            return deuce(player1Score);
        }
        if (scorePlayer1Greater4 || scorePlayer2Greater4) {
            int minusResult = player1Score - player2Score;
            return checkMinusResult(minusResult);
        }
        return String.format("%s-%s", zeroToThree(player1Score, score), zeroToThree(player2Score, score));
    }

    public static String checkMinusResult(int minusResult) {
        String score;
        switch (minusResult) {
            case 1:
                score = ADVANTAGE_PLAYER_1;
                break;
            case -1:
                score = ADVANTAGE_PLAYER_2;
                break;
            default:
                score = minusResult >= 2 ? WIN_FOR_PLAYER_1 : WIN_FOR_PLAYER_2;
                break;
        }
        return score;
    }

    public static String deuce(int score) {
        String result;
        switch (score) {
            case SCORE_IS_0:
                result = LOVE_ALL;
                break;
            case SCORE_IS_1:
                result = FIFTEEN_ALL;
                break;
            case SCORE_IS_2:
                result = THIRTY_ALL;
                break;
            case SCORE_IS_3:
                result = FORTY_ALL;
                break;
            default:
                result = DEUCE;
                break;
        }
        return result;
    }

    public static String zeroToThree(int tempScore, String score) {
        switch (tempScore) {
            case SCORE_IS_0:
                score += LOVE;
                break;
            case SCORE_IS_1:
                score += FIFTEEN;
                break;
            case SCORE_IS_2:
                score += THIRTY;
                break;
            case SCORE_IS_3:
                score += FORTY;
                break;
        }
        return score;
    }
}
