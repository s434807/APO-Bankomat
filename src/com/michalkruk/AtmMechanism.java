package com.michalkruk;

import java.util.Scanner;

public class AtmMechanism {

    private static Scanner in;
    private static int anotherTransaction;

    public static void transaction(Account account){
        int choice;
        System.out.println("Wybierz co chcesz zrobic");
        System.out.println("1. Wyplac srodki");
        System.out.println("2. Wplac srodki");
        System.out.println("3. Aktualny stan konta");
        in = new Scanner(System.in);
        choice = in.nextInt();
        switch(choice){
            case 1:
                double amount;
                System.out.println("Prosze wprowadz kwote jaka chcesz wyplacic: ");
                amount = in.nextFloat();
                if(amount > account.getBallance() || amount == 0){
                    System.out.println("Nie masz wystarczajacych funduszy na koncie\n\n");
                    anotherTransaction(account);
                } else {
                    account.setBallance(account.getBallance()-amount);
                    System.out.println("Wyplaciles "+amount+", nowy balans konta to: "+account.getBallance()+"\n");
                    anotherTransaction(account);
                }
                break;
            case 2:
                float deposit;
                System.out.println("Prosze wprowadz kwote, jaka chcesz zdeponowac: ");
                deposit = in.nextFloat();
                account.setBallance(account.getBallance()+deposit);
                System.out.println("Wplaciles  "+deposit+" nowy stan konta: "+account.getBallance()+"\n");
                anotherTransaction(account);
                break;
            case 3:
                System.out.println("Aktualny stan konta: "+account.getBallance()+"\n");
                anotherTransaction(account);
                break;
            default:
                System.out.println("Zla opcja:\n\n");
                anotherTransaction(account);
                break;
        }
    }


    private static void anotherTransaction(Account account){
        System.out.println("Chcesz zrobic inna akcje?\n\nNacisnij 1 aby kontynuowac\n2 Aby wyjsc");
        anotherTransaction = in.nextInt();
        if(anotherTransaction == 1){
            transaction(account); // call transaction method
        } else if(anotherTransaction == 2){
            System.out.println("Dziekujemy za skorzystanie z uslug naszego banku. Do zobaczenia!");
        } else {
            System.out.println("Zla opcja\n\n");
            anotherTransaction(account);
        }
    }

}
