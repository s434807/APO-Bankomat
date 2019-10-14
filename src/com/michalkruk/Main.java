package com.michalkruk;

public class Main {

    public static void main(String[] args) {
        Account konto1 = new Account("Michal","Kruk","123456789",1234);

        AtmMechanism.transaction(konto1);

    }
}
