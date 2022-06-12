package com.techelevator;

public class PurchaseMenu {
    public PurchaseMenu() {
    }

    Money money = new Money();
    VendingMachine vendingMachine = new VendingMachine();

    public void purchaseMenu() {
        System.out.println("Current Money Provided: $" + money.getCurrentBalance());
        System.out.println();
        System.out.println("(1) Feed Money");
        System.out.println("(2) Select Product");
        System.out.println("(3) Finish Transaction");
    }

    public void feedMoney() {
        System.out.println("Please insert a (1) $1 bill, (5) $5 bill, or (10) $10 bill");
    }

    public void finishTransaction() {

    }

}

