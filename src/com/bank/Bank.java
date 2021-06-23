package com.bank;

import java.util.*;

public class Bank {
    static int AccountNo = 1000;
    public HashMap<Integer, Account> AccounList = new HashMap<Integer, Account>();;

    public void AccountOpen()
    {
        System.out.println("Please! provide following details enter details one by one");
        System.out.println("Name, Address, Aadhar, Deposite");

        Scanner sc= new Scanner(System.in);

        String Name= sc.nextLine();
        String Address= sc.nextLine();
        String AadharTemp= sc.nextLine();
        int Aadhar = Integer.parseInt(AadharTemp);
        String BalanceTemp= sc.nextLine();
        double Balance = Double.parseDouble(BalanceTemp);

        Account account = new Account(Name,Address,Aadhar, Balance);
        AccounList.put(AccountNo++, account);
        System.out.println(account.getName()+" "+account.getAddress()+" "+account.getAadhar()+" "+account.getBalance()+" "+account.isStatus());
        System.out.println("Account added");
    }

    public void AccountClose()
    {
        System.out.println("Please! provide following account no");

        Scanner sc= new Scanner(System.in);
        String TempAccountNo= sc.nextLine();
        int AccountNo = Integer.parseInt(TempAccountNo);

        AccounList.remove(AccountNo);
        System.out.println("Account deleted");
    }

    public void AllCustomers()
    {
        for(Map.Entry<Integer, Account> entry:this.AccounList.entrySet()){
            int key=entry.getKey();
            Account b=entry.getValue();
            System.out.println(key+" Details:");
            System.out.println(b.getName()+" "+b.getAddress()+" "+b.getAadhar()+" "+b.getBalance()+" "+b.isStatus());
        }
    }

}
