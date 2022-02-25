public class Methods {
    public static void main(String[] args) {

        int score = calculateScore(true, 800, 5, 100);

        int score1 = calculateScore(true, 10000, 8, 200);

        System.out.println(score);
        System.out.println(score1);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;

    }
}
