using System;
using System.Collections.Generic;
using System.Text;

namespace ConsoleApp2
{
    public class Account
    {

        public Account(int id, int pin, int balance)
        {
            this.Id = id;
            this.Pin = pin;
            this.Balance = balance;
        }
        public Account()
        {

        }
        int id;
        int pin;
        int balance;


        public int Id { get => id; set => id = value; }
        public int Pin { get => pin; set => pin = value; }
        public int Balance { get => balance; set => balance = value; }
    }
}

