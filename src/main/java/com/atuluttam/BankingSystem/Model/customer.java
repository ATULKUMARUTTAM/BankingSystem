package com.atuluttam.BankingSystem.Model;


import org.springframework.stereotype.Component;

@Component
public class customer {
   private  int accno;
   private String name;
   private int balance;

    public customer() {
    }

    public customer(int accno, String name, int balance) {
        this.accno = accno;
        this.name = name;
        this.balance = balance;
    }

    public int getAccno() {
        return accno;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "customer{" +
                "accno=" + accno +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
