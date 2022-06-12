package com.techelevator;

public class MainMenu {

    public MainMenu() {
    }

    VendingMachine vendingMachine = new VendingMachine();


    public void mainMenu() {
        System.out.println("(1) Display Vending Machine Items");
        System.out.println("(2) Purchase");
        System.out.println("(3) Exit");
    }
    public void displayVendingMachineItems() {
        FileReader fileReader = new FileReader();
        fileReader.buildItemsList();
        System.out.println();
    }
    public void goToPurchaseMenu() {
        PurchaseMenu purchaseMenu = new PurchaseMenu();
        purchaseMenu.purchaseMenu();
    }
}
