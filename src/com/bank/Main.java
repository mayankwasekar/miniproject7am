package com.bank;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
	    while(true)
	    {
            System.out.println("Input option");
            System.out.println("1. Open Account");
            System.out.println("2. Close Account");
            System.out.println("3. Deposite");
            System.out.println("4. Withdrawn");
            System.out.println("5. Transfer");
            System.out.println("6. Balance Check");
            System.out.println("7. Statement");
            System.out.println("8. All customers");
            System.out.println("9. Active customers");
            System.out.println("0. Exit");

            switch(Integer.parseInt(str))
            {
                case 1:
                    bank.AccountOpen();
                    break;
                case 2:
                    bank.AccountClose();
                    break;
                case 8:
                    bank.AllCustomers();
                    break;
                case 0:
                    exit(0);
                    break;
                default:
                    System.out.println("Invalid entry");
            }
        }
    }
}
