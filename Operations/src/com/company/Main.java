package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3;

        int prevResult = result;
        System.out.println("Previous result = " + prevResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 =" + result);

        result = result * 10; // 2 * 10 = 20
        System.out.println(result);

        result = result / 5; // 20 / 5 = 4
        System.out.println(result);

        result = result % 3; // the remainder of (4 % 3 ) = 1
        System.out.println(result);

        //result = result + 1
        result++; // 1 + 1 = 2
        System.out.println(result);

        result--; //2 - 1 = 1
        System.out.println(result);

        //result = result + 2;
        result += 2;
        System.out.println(result);

        // result = result * 10;
        result *= 10; // 3 * 10 = 30
        System.out.println(result);

        // result = result / 3
        result /= 3; // 30 / 3 = 10
        System.out.println(result);

        //result = result - 2
        result -= 2; // 10 - 2 = 8
        System.out.println(result);

        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("It is not an alien!");
        }

        int topScore = 101;

        if(topScore > 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if(topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater then second top score and less than 100");
        }

        boolean isCar = false;
        if(!isCar) {
            System.out.println("The car boolean is false");
        };

        //ternary operator
        boolean wasCar = isCar ? true : false;


    }
}