import java.util.Scanner;

public class Main extends Validation{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Prosze wlozyc karte...");
        //wstepnie podawanie danych do karty, pozniej zczytywanie z bazy danych
        Card jk = new Card("343393450805275", "07/22", "Jakub", "American Express", 375, 1234, 112414.2D);
        System.out.println("Trwa sprawdzanie karty");
        Thread.sleep(1000);
        System.out.println("Trwa walidacja karty " + jk.getIssuer());
        if(!Luhnvalidate(jk.getCardNumber())){
            System.out.println("Karta ma niepoprawny format...");
            System.exit(1);
        }
        Thread.sleep(1000);
        System.out.println("Trwa sprawdzanie ważności karty");
        if(isExpired(jk.getDate())){
            System.out.println("Karta jest nieważna");
            System.exit(1);
        }
        Thread.sleep(1000);
        int fails = 0;
        while(fails <= 3) {
            if(fails == 3){
                System.out.println("Dostęp zablokowany, proszę skontaktować się z bankiem w celu odblokowania karty.");
                System.exit(1);
            }
            System.out.println("Prosze podać pin:");
            Scanner sc = new Scanner(System.in);
            int inputPIN = sc.nextInt();
            if (inputPIN == jk.getPIN()) {
                System.out.println("Witaj ponownie, " + jk.getHolder());
                break;
            }
            else {
                System.out.println("Niepoprawny pin.");
            }
            fails++;
        }


        while(true){
            System.out.println("Nacisnij\n" +
                    "1. zeby wybrac pieniadze \n" +
                    "2. zeby wplacic pieniadze\n" +
                    "3. zeby sprawdzic stan konta\n" +
                    "4. zeby kupic pre-paid do telefonu\n" +
                    "5. zeby wysunac karte...");
            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Podaj ilość, którą chcesz wypłacić(Wartość musi być większa od 20 i musi być podzielna przez 10)");
                    int withdraw = scan.nextInt();
                    jk.setBalance(Withdrawal(jk.getBalance(), withdraw));
                    System.out.println("Aktualny stan konta to: " + jk.getBalance());
                    break;
                case 2:
                    System.out.println("Podaj ilość, którą chcesz wpłacić(Wartość musi być podzielna przez 10)");
                    int deposit = scan.nextInt();
                    jk.setBalance(Deposit(jk.getBalance() , deposit));
                    System.out.println("Aktualny stan konta to: " + jk.getBalance());
                    break;
                case 3:
                    System.out.println("Aktualny stan konta: " + jk.getBalance());
                    break;
                case 4:
                    System.out.println("Podaj kwotę doładowania");
                    int prepaid = scan.nextInt();
                    System.out.println("Twoj kod prepaid to:" + generateString());
                    break;
                case 5:
                    System.out.println("Do widzenia");
                    System.exit(1);
            }
        }
    }
}
