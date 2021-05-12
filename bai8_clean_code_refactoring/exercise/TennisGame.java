package bai8_clean_code_refactoring.exercise;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int m_score1, int m_score2) {
        StringBuilder score = new StringBuilder();
        int tempScore = 0;
        boolean isScoreEqual = m_score1 == m_score2;
        if (isScoreEqual) {
            switch (m_score1) {
                case 0:
                    score = new StringBuilder("Love-All");
                    break;
                case 1:
                    score = new StringBuilder("Fifteen-All");
                    break;
                case 2:
                    score = new StringBuilder("Thirty-All");
                    break;
                case 3:
                    score = new StringBuilder("Forty-All");
                    break;
                default:
                    score = new StringBuilder("Deuce");
                    break;

            }
        } else {
            boolean isScore1Great4 = m_score1 >= 4;
            boolean isScore2Great4 = m_score2 >= 4;
            if (isScore1Great4 || isScore2Great4) {
                score = getStringBuilder(m_score1, m_score2);
            } else {
                displayScore(m_score1, m_score2, score);
            }
        }
        return score.toString();
    }

    public static StringBuilder getStringBuilder(int m_score1, int m_score2) {
        StringBuilder score;
        int minusResult = m_score1 - m_score2;
        boolean isMinusResult = minusResult == 1;
        if (isMinusResult) score = new StringBuilder("Advantage player1");
        else {
            boolean isMinusResultEqual = minusResult == -1;
            if (isMinusResultEqual) score = new StringBuilder("Advantage player2");
            else {
                boolean isMinusResultGreat2 = minusResult >= 2;
                if (isMinusResultGreat2) score = new StringBuilder("Win for player1");
                else score = new StringBuilder("Win for player2");
            }
        }
        return score;
    }

    public static void displayScore(int m_score1, int m_score2, StringBuilder score) {
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = m_score1;
            else {
                score.append("-");
                tempScore = m_score2;
            }
            switch (tempScore) {
                case 0:
                    score.append("Love");
                    break;
                case 1:
                    score.append("Fifteen");
                    break;
                case 2:
                    score.append("Thirty");
                    break;
                case 3:
                    score.append("Forty");
                    break;
            }
        }
    }
}