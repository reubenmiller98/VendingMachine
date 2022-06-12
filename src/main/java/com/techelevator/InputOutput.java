package com.techelevator;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
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

    public InputOutput() {
        Scanner userInput = new Scanner(System.in);
        String mainMenuSelection = userInput.nextLine();
        FileReader fileReader = new FileReader();
        Integer i;
        for (i = Integer.parseInt(mainMenuSelection); i == 1; mainMenuSelection = userInput.nextLine()) {
            if (i == 1) {
                mainMenu.displayVendingMachineItems();
                mainMenu.mainMenu();
            }
            if (i == 2) {
                mainMenu.goToPurchaseMenu();
                String purchaseMenuSelection = userInput.nextLine();
                Integer ix;
                for (ix = Integer.parseInt(purchaseMenuSelection); ix != 3; purchaseMenuSelection = userInput.nextLine()) {
                    if (ix == 1) {
                        purchaseMenu.feedMoney();
                        try (PrintWriter logWriter = new PrintWriter(new FileWriter(log, true))) {
                            String billSelection = userInput.nextLine();
                            Double billSelectionAsDouble = Double.parseDouble(billSelection);
                            if (billSelection.equals("1")) {
                                money.insert1();
                                logWriter.println("FEED MONEY: $" + billSelectionAsDouble + " $" + money.currentBalance);
                                purchaseMenu.purchaseMenu();
                            }
                            if (billSelection.equals("5")) {
                                money.insert5();
                                logWriter.println("FEED MONEY: $" + billSelectionAsDouble + " $" + money.currentBalance);
                                purchaseMenu.purchaseMenu();
                            }
                            if (billSelection.equals("10")) {
                                money.insert10();
                                logWriter.println("FEED MONEY: $" + billSelectionAsDouble + " $" + money.currentBalance);
                                purchaseMenu.purchaseMenu();
                            }
                        } catch (Exception e) {
                            System.exit(0);
                        }
                    }
                    if (ix == 2) {
                        mainMenu.displayVendingMachineItems();
                        System.out.println();
                        System.out.println("Please enter item ID (e.g. A1): ");
                        String itemSelection = userInput.nextLine();
                        if (vendingMachine.vendingPriceMap.containsKey(itemSelection)) {
                            if (money.getCurrentBalance() >= vendingMachine.vendingPriceMap.get(itemSelection) && vendingMachine.vendingItemQtyMap.get(itemSelection) > 0) {
                                double itemPrice = vendingMachine.vendingPriceMap.get(itemSelection);
                                money.currentBalance -= itemPrice;
                                int itemQty = vendingMachine.vendingItemQtyMap.get(itemSelection);
                                vendingMachine.vendingItemQtyMap.put(itemSelection, itemQty -= 1);
                                String itemName = vendingMachine.vendingNameMap.get(itemSelection);
                                if (vendingMachine.vendingTypeMap.get(itemSelection).equals("Chip")) {
                                    chip.chipMessage();
                                    purchaseMenu.purchaseMenu();
                                }
                                if (vendingMachine.vendingTypeMap.get(itemSelection).equals("Candy")) {
                                    candy.candyMessage();
                                    purchaseMenu.purchaseMenu();
                                }
                                if (vendingMachine.vendingTypeMap.get(itemSelection).equals("Drink")) {
                                    drink.drinkMessage();
                                    purchaseMenu.purchaseMenu();
                                }
                                if (vendingMachine.vendingTypeMap.get(itemSelection).equals("Gum")) {
                                    gum.gumMessage();
                                    purchaseMenu.purchaseMenu();
                                }

                            } else if (money.currentBalance < vendingMachine.vendingPriceMap.get(itemSelection)) {
                                System.out.println();
                                System.out.println("Insufficient funds, please insert more money");
                                System.out.println();
                                purchaseMenu.purchaseMenu();
                            } else if (vendingMachine.vendingItemQtyMap.get(itemSelection) == 0) {
                                System.out.println();
                                System.out.println("Product sold out, please select another item");
                                System.out.println();
                                purchaseMenu.purchaseMenu();
                            }


                        }
                        System.out.println("Please enter a valid item ID");
                        System.out.println();
                        purchaseMenu.purchaseMenu();

                    }
                    if (ix == 3) {

                    }
                }
            }
        }

    }


}


