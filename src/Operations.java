import java.util.UUID;

public class Operations {
    public static double Withdrawal(double balance, int amount){
        balance -= amount;
        return balance;
    }
    public static double Deposit(double balance, int amount){
        balance += amount;
        return balance;
    }
    public static String generateString() {
        String uuid = UUID.randomUUID().toString();
        return uuid;
    }
}
