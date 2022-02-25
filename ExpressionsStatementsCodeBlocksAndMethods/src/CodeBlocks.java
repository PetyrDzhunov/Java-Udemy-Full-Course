public class CodeBlocks {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompeted = 5;
        int bonus = 100;
        if (score == 5000) {
            System.out.println("Your score is 5000");
        }

        if (score == 5000)
            System.out.println("Your score is again 5000");
        System.out.println("This wont print because if statement without code block defining takes only 1 line below it");

        if(score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        }else if (score<1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }

        if(gameOver) {
            int finalScore = score + (levelCompeted* bonus);
            System.out.println("Your final score was " + finalScore);
        };

        

    }
}
