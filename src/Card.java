public class Card {
    private String cardNumber;
    private String date;
    private String holder;
    private String issuer;
    private int CVV;
    private int PIN;
    private double balance;
    Card(String cardNumber, String date, String holder, String issuer, int CVV, int PIN, double balance){
        this.cardNumber = cardNumber;
        this.date = date;
        this.holder = holder;
        this.issuer = issuer;
        this.CVV = CVV;
        this.PIN = PIN;
        this.balance = balance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getDate() {
        return date;
    }


    public String getHolder() {
        return holder;
    }


    public String getIssuer() {
        return issuer;
    }

    public int getPIN() {
        return PIN;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
