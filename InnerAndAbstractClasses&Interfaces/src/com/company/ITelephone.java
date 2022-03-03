package com.company;

public interface ITelephone {
    void powerOn();

    void dial(int phoneNumber);

    void answer();

    boolean callPhone(int phoneNumber);

    boolean isRinging();
}

// defining the methods that a class that implements this interface should have.
// unncessary to write an access modifiers because the class will implement the interface

