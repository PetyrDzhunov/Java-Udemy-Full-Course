package com.company;

public class SpeedConvertor {
    public static void main(String[] args) {
    long first = toMilesPerHour(150);
    long second = toMilesPerHour(10.25);
        System.out.println(((Object)first).getClass().getSimpleName()); // Long
        System.out.println(second);

    }
    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            return -1;
        };

        return Math.round(kilometersPerHour * 0.621371d);
    }
}
