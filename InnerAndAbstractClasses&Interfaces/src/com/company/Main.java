package com.company;

public class Main {

    public static void main(String[] args) {
//        ITelephone  johnsphone = new ITelephone(); - not valid.
	ITelephone johnsPhone;
    johnsPhone = new DeskPhone(123456);
    johnsPhone.powerOn();
    johnsPhone.callPhone(123456);
    johnsPhone.answer();
    }   
}
