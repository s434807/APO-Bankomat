package com.michalkruk;

public class Account {

    private String name;
    private String forname;
    private String cardNumber;
    private int pin;
    private double ballance =0;

    public Account(String name, String forname, String cardNumber, int pin) {
        this.name = name;
        this.forname = forname;
        this.cardNumber = cardNumber;
        this.pin = pin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getForname() {
        return forname;
    }

    public void setForname(String forname) {
        this.forname = forname;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getBallance() {
        return ballance;
    }

    public void setBallance(double ballance) {
        this.ballance = ballance;
    }
}
