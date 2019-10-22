using System;
using ConsoleApp2;
class program
{
    public static void Main()
    {
        int amount = 2034, deposit, withdraw;
        int choice, pin = 0;
        Console.WriteLine("Enter Your 4 Digit Pin ");
        pin = int.Parse(Console.ReadLine());
        Account test = new Account(1,/*id*/ pin, amount);
        if (pin <= 999 && pin> 9999)
        {
            Console.WriteLine(pin);
            Console.WriteLine("Invalid Pin entered");
            Environment.Exit(0);
        }
        else
        {

            while (true)
            {
                Console.WriteLine("");
                Console.WriteLine("WELCOME TO YES BANK ATM SERVICE\n");
                Console.WriteLine("1. Current Balance\n");
                Console.WriteLine("2. Withdraw \n");
                Console.WriteLine("3. Deposit \n");
                Console.WriteLine("4. Cancel \n");
                Console.WriteLine("***************\n\n");
                Console.WriteLine("ENTER YOUR CHOICE : ");
                choice = int.Parse(Console.ReadLine());
                Console.Clear();
                switch (choice)
                {
                    case 1:
                        Console.WriteLine("YOUR CURRENT BALANCE IS Rs : {0} ", test.Balance);
                        Console.WriteLine("\n***************\n\n");
                        break;
                    case 2:
                        Console.WriteLine("ENTER THE WITHDRAW AMOUNT : ");
                        withdraw = int.Parse(Console.ReadLine());
                        if (withdraw % 10 != 0)
                        {
                            Console.WriteLine("PLEASE ENTER THE AMOUNT DEVIDABLE BY 10");
                            Console.WriteLine("\n***************\n\n");
                        }
                        else if (withdraw > test.Balance)
                        {
                            Console.WriteLine("SORRY! INSUFFICENT BALANCE");
                            Console.WriteLine("\n***************\n\n");
                        }
                        else
                        {
                            test.Balance = test.Balance - withdraw;
                            Console.WriteLine("");
                            Console.WriteLine("PLEASE COLLECT YOUR CASH");
                            Console.WriteLine("CURRENT BALANCE IS Rs : {0}", test.Balance);
                        }
                        break;
                    case 3:
                        Console.WriteLine("ENTER THE DEPOSIT AMOUNT");
                        deposit = int.Parse(Console.ReadLine());
                        test.Balance = test.Balance + deposit;
                        Console.WriteLine("");
                        Console.WriteLine("YOUR AMOUNT HAS BEEN DEPOSITED SUCCESSFULLY..");
                        Console.WriteLine("YOUR TOTAL BALANCE IS Rs : {0}", test.Balance);
                        break;
                    case 4:
                        Console.WriteLine("THANKS FOR USING YES ATM SERVICE");
                        Console.WriteLine("\n***************\n\n");
                        Console.ReadLine();
                        Environment.Exit(0);
                        break;
                }
            }
        }
    }
}
