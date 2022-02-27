package com.company;

public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("Tim", 500);
        int totalScore = calculateScore(500);
        System.out.println("Method overloading with 1 parameter" + totalScore);
        System.out.println("New score is " + newScore);
        int zero = calculateScore();
        System.out.println(zero);

        //
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    ;

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    ;

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }
}