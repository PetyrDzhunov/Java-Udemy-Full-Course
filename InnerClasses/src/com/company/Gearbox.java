package com.company;

import java.util.ArrayList;

public class Gearbox {
    // fields of Gearbox class
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    //constructor
    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);

        for(int i=0; i<maxGears; i++) {
            addGear(i, i* 5.3);
        }
    }

    public void operateClitch(boolean in) {
        this.clutchIsIn = in;
    }

    public void addGear(int number, double ratio) {
        if ((number > 0) && (number <= maxGears)) {
            this.gears.add(new Gear(number, ratio));
        }
    }

    public double wheelSpeed(int revs) {
        if (clutchIsIn) {
            System.out.println("Scream!!!");
            return 0.0;
        }
        ;
        return revs * gears.get(currentGear).getRatio();
    }

    public void changeGear(int newGear) {
        if ((newGear >= 0) && (newGear < this.gears.size()) && this.clutchIsIn) {
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected");
        } else {
            System.out.println("Grind!");
            this.currentGear = 0;
        }
    }

    // inner private class of Gearbox,local class
    // this is an encapsulated class that only its outside class knows about
    // you cant access this class anywhere outside. so its encapsulated  and
    // it helps only the main class here
    // local classes are declared inside a block such a method, or if/else statement
    // their scope is restricted completely to that particular block,
    // local classes are used less often and they increase encapsulation
    // in practice we don't use them often
    private class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs) {
            return revs * (this.ratio);
        }

        public double getRatio() {
            return ratio;
        }
    }


}
