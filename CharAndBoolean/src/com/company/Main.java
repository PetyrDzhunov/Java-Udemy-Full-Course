package com.company;

public class Main {

    public static void main(String[] args) {

	    char myChar = 'D'; // 2 bytes (16 bits) cause of Unicode.
        char myUnicodeChar = '\u0044';
        System.out.println(myChar == myUnicodeChar);

        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;

    }
}
