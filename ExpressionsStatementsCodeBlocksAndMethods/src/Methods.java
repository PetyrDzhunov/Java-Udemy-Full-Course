public class Methods {
    public static void main(String[] args) {

        int score = calculateScore(true, 800, 5, 100);

        int score1 = calculateScore(true, 10000, 8, 200);

        System.out.println(score);
        System.out.println(score1);

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Peter", position);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;

    }
}

