package com.company;

public class Main {

    public static void main(String[] args) {
//        ITelephone  johnsphone = new ITelephone(); - not valid.
        ITelephone johnsPhone;
        johnsPhone = new DeskPhone(123456);
        johnsPhone.powerOn();
        johnsPhone.callPhone(123456);
        johnsPhone.answer();

        johnsPhone = new MobilePhone(24565);
        johnsPhone.powerOn();
        johnsPhone.callPhone(24565);
        johnsPhone.answer();
        // we can actually define and change a new instance of a different class
        // and this works because they are both implementing the same interface.


    }
}
