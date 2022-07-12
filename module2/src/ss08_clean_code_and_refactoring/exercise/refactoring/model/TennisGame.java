package ss08_clean_code_and_refactoring.exercise.refactoring.model;

public class TennisGame {

    public static final int LOVE = 0;
    public static final int FIFTEEN = 1;
    public static final int THIRTY = 2;
    public static final int FORTY = 3;

    public static String getScore(String player1Name, String player2Name, int firstPlayerScore, int secondPlayerScore) {
        String nameScore = "";
        if (firstPlayerScore == secondPlayerScore) {
            nameScore = getNameScore(firstPlayerScore);
        }
         else if (firstPlayerScore >= 4 || secondPlayerScore >= 4) {
            nameScore = win(firstPlayerScore, secondPlayerScore);
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) {
                    nameScore += getNameScore(firstPlayerScore);
                } else {
                    nameScore += '-' + getNameScore(secondPlayerScore);
                }
            }
        }
        return nameScore;
    }

    private static String win(int firstPlayerScore, int secondPlayerScore) {
        String nameScore;
        int difference = firstPlayerScore - secondPlayerScore;

        if (difference == 1){
            nameScore = "Advantage player1";
        }
        else if (difference == -1){
            nameScore = "Advantage player2";
        }
        else if (difference >= 2) {
            nameScore = "Win for player1";
        }
        else {
            nameScore = "Win for player2";
        }
        return nameScore;
    }

    private static String getNameScore(int firstPlayerScore) {
        String nameScore;
        switch (firstPlayerScore) {
            case LOVE:
                nameScore = "Love";
                break;
            case FIFTEEN:
                nameScore = "Fifteen";
                break;
            case THIRTY:
                nameScore = "Thirty";
                break;
            case FORTY:
                nameScore = "Forty";
                break;
            default:
                nameScore = "Deuce";
                break;

        }
        return nameScore;
    }

    public static void main(String[] args) {
        System.out.println(getScore("dat", "tu", 1, 2));
    }
}