package com.company;

public class Main {

    public static void main(String[] args) {


        int myValue = 10000;

        //Integer - Wrapper class
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        //Underflow and Overflow.
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = "+ (myMaxIntValue+1));
        System.out.println("Busted MIN value = " + (myMinIntValue-1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Maximum Value = " + myMaxByteValue);
        System.out.println("Byte Minimum Value = " + myMinByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        System.out.println("Short Minimum Value = " + myMinShortValue);

        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        System.out.println("Long Minimum Value = " + myMinLongValue);

        short bigShortLiteralValue = 32767;
    }
}
