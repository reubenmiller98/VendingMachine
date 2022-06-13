package com.techelevator;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InputOutput {

    VendingMachine vendingMachine = new VendingMachine();
    Money money = new Money();
    MainMenu mainMenu = new MainMenu();
    PurchaseMenu purchaseMenu = new PurchaseMenu();
    Chip chip = new Chip();
    Drink drink = new Drink();
    Gum gum = new Gum();
    Candy candy = new Candy();
    File log = new File("log.txt");

    public void inputOutput() {
        vendingMachine.vendingMapBuilder(vendingMachine);
        Scanner userInput = new Scanner(System.in);
        mainMenu.welcomeMessage();
        mainMenu.mainMenu();
        String mainMenuSelection = userInput.nextLine();
        while (!mainMenuSelection.equals("3")) {
            if (mainMenuSelection.equals("1")) {
                mainMenu.buildItemsList(vendingMachine);
                System.out.println();
                mainMenu.mainMenu();
                mainMenuSelection = userInput.nextLine();
            }
            if (mainMenuSelection.equals("2")) {
                purchaseMenu.purchaseMenu(money);
                String purchaseMenuSelection = userInput.nextLine();
                while (!purchaseMenuSelection.equals("3")) {
                    if (purchaseMenuSelection.equals("1")) {
                        purchaseMenu.feedMoneyMessage();
                        purchaseMenu.billSelection = userInput.nextLine();
                        purchaseMenu.feedMoney(money);
                        purchaseMenu.purchaseMenu(money);
                        purchaseMenuSelection = userInput.nextLine();
                    }
                    if (purchaseMenuSelection.equals("2")) {
                        mainMenu.buildItemsList(vendingMachine);
                        System.out.println("Please enter item ID (e.g. A1): ");
                        purchaseMenu.itemSelection = userInput.nextLine();
                        purchaseMenu.selectProduct(vendingMachine, money, candy, drink, gum, chip);
                        purchaseMenu.purchaseMenu(money);
                        purchaseMenuSelection = userInput.nextLine();
                    }
                }
                if (purchaseMenuSelection.equals("3")) {
                    money.calculateMoneyAsCurrency(money);
                    System.out.print("Your change is: $" + money.currentBalance);
                    if (money.getQuarters(money) > 0) {
                        System.out.print(" (" + money.getQuarters(money) + " quarters");
                        if (money.getDimes(money) > 0) {
                            System.out.print(", " + money.getDimes(money) + " dimes");
                            if (money.getNickels(money) > 0) {
                                System.out.print(", " + money.getNickels(money) + " nickel");
                            }
                        }
                        System.out.print(")");
                    } else if (money.getDimes(money) > 0) {
                        System.out.print(" (" + money.getDimes(money) + " dimes");
                        if (money.getNickels(money) > 0) {
                            System.out.print(", " + money.getNickels(money) + " nickel");
                        }
                        System.out.print(")");
                    } else if (money.getNickels(money) > 0) {
                        System.out.println("(" + money.getNickels(money) + " nickel)");
                    }
                    money.giveChange(money);
                    System.out.println();
                    System.out.println("Returning to Main Menu!");
                    System.out.println();
                    mainMenu.mainMenu();
                    mainMenuSelection = userInput.nextLine();

                }
            }
        }
        if (mainMenuSelection.equals("3")) {
            System.out.println("Thank you for using Wooben Vending International LLC (a subsidiary of Tech Elevator (!NO RIGHTS RESERVED))");
            System.exit(3);
        }
}
}




