package com.company;

public class Main {

    public static void main(String[] args) {

        Gearbox mcLaren = new Gearbox(6);
        // instantiate a gear object is only possible with an instance of Gearbox
//        Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
        System.out.println(first.driveSpeed(1000));

//        Gearbox.Gear second = new Gearbox.Gear(2,15.4); // not possible, because not an instance of Gearbox.
//        Gearbox.Gear third  = new mcLaren.Gear(3, 17.8); // also not possible.
    }
}
