package com.techelevator;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class PurchaseMenu {

    String billSelection = "";
    String itemSelection = "";
    File log = new File("log.txt");


    public void purchaseMenu(Money money) {
        System.out.println("Current Money Provided: $" + money.getCurrentBalance(money));
        System.out.println();
        System.out.println("(1) Feed Money");
        System.out.println("(2) Select Product");
        System.out.println("(3) Finish Transaction");
    }

    public void feedMoneyMessage() {
        System.out.println("Please insert a (1) $1 bill, (5) $5 bill, or (10) $10 bill");
    }

    public void feedMoney(Money money) {
        try (PrintWriter logWriter = new PrintWriter(new FileWriter(log, true))) {
            Double billSelectionAsDouble = Double.parseDouble(billSelection);
            if (billSelection.equals("1")) {
                money.insert1(money);
                logWriter.println("FEED MONEY: $" + billSelectionAsDouble + " $" + money.currentBalance);
            }
            if (billSelection.equals("5")) {
                money.insert5(money);
                logWriter.println("FEED MONEY: $" + billSelectionAsDouble + " $" + money.currentBalance);
            }
            if (billSelection.equals("10")) {
                money.insert10(money);
                logWriter.println("FEED MONEY: $" + billSelectionAsDouble + " $" + money.currentBalance);
            }
        } catch (Exception e) {
            System.exit(0);
        }
    }

    public void selectProduct(VendingMachine vendingMachine, Money money, Candy candy, Drink drink, Gum gum, Chip chip) {
        System.out.println();
        if (vendingMachine.vendingPriceMap.containsKey(itemSelection)) {
            double itemPrice = vendingMachine.vendingPriceMap.get(itemSelection);
            int itemQty = vendingMachine.vendingItemQtyMap.get(itemSelection);
            if (itemPrice <= money.currentBalance && itemQty > 0) {
                money.currentBalance -= itemPrice;
                vendingMachine.vendingItemQtyMap.put(itemSelection, itemQty -= 1);
                String itemType = vendingMachine.vendingTypeMap.get(itemSelection);
                if (itemType.equals("Chip")) {
                    chip.chipMessage();
                }
                if (itemType.equals("Candy")) {
                    candy.candyMessage();
                }
                if (itemType.equals("Drink")) {
                    drink.drinkMessage();
                }
                if (itemType.equals("Gum")) {
                    gum.gumMessage();
                }

            } else if (itemPrice > money.currentBalance) {
                System.out.println("Insufficient funds!  Please insert more money!");
            } else if (itemQty == 0) {
                System.out.println("Item sold out!  Please select another item!");
            }
        } else {
            System.out.println("Invalid item ID!  Please enter a valid item ID!");
        }
    }

    public void finishTransaction(Money money) {
        money.calculateMoneyAsCurrency(money);
    }
}

