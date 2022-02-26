package com.company;

public class MegabytesConvertor {
    public void printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes < 0) {
            System.out.printf("Invalid Value");
        } else {
        int remaining = kiloBytes % 1024;
        int megabytes = (int)Math.ceil(kiloBytes / 1024);
        System.out.println(kiloBytes + " KB = " +megabytes +" MB and " + remaining +" KB");
        }
    }
}
