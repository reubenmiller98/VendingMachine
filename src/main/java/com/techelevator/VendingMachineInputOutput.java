package com.techelevator;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.*;

public class VendingMachineInputOutput {
    Scanner userInput = new Scanner(System.in);
    Item item = new Item();
    Money money = new Money();



    //public File log = new File("log.txt");
    //
    //public void displayItems() {
    //        while (itemsListScanner.hasNextLine()) {
    //            String itemsListLine = itemsListScanner.nextLine();
    //
    //
    //        }
    //    } catch (Exception e) {
    //        System.exit(0);
    //    }
    //}
    //
    //public void purchaseMenu() {
    //     {
    //        String purchaseSelection = userInput.nextLine();
    //        if (purchaseSelection.equals("1")) {
    //
    //            String billSelection = userInput.nextLine();
    //
    //            if (billSelection.equals("1")) {
    //                currentBalance++;
    //
    //                purchaseMenu();
    //            }
    //            if (billSelection.equals("5")) {
    //                currentBalance += 5;
    //
    //                purchaseMenu();
    //            }
    //            if (billSelection.equals("10")) {
    //                currentBalance += 10;
    //                logWriter.println("FEED MONEY: $" + billSelectionAsDouble + " $" + currentBalance);
    //                purchaseMenu();
    //            }
    //            System.out.println("Invalid bill please try again");
    //            purchaseMenu();
    //        }
    //        if (purchaseSelection.equals("2")) {
    //            displayItems();
    //            logWriter.println(itemName + " " + itemSelection + " $" + itemPrice + " $" + currentBalance);
    //
    //                    }
    //
    //                    }
    //
    //
    //                }
    //                if (currentBalance < item.vendingPriceMap.get(itemSelection)) {
    //                    System.out.println("Please insert additional money");
    //                    purchaseMenu();
    //                }
    //                if (item.vendingItemQtyMap.get(itemSelection) < 1) {
    //                    System.out.println("Item sold out! Please select another item");
    //                    purchaseMenu();
    //                }
    //            }
    //            System.out.println("Please enter a valid item ID");
    //            purchaseMenu();
    //
    //        }
    //        if (purchaseSelection.equals("3")) {
    //            double moneyAsCurrency = currentBalance;
    //            money.calculateMoneyAsCurrency();
    //            for (double i = moneyAsCurrency; i >= 0.25; money.quarters--) {
    //                moneyAsCurrency -= 0.25;
    //            }
    //            money.changeMap.put("Quarters: ", money.quarters);
    //            for (double i = moneyAsCurrency; i >= 0.10; money.dimes--) {
    //                moneyAsCurrency -= 0.10;
    //            }
    //            money.changeMap.put("Dimes: ", money.dimes);
    //            for (double i = moneyAsCurrency; i >= 0.05; money.nickels--) {
    //                moneyAsCurrency -= 0.05;
    //            }
    //            money.changeMap.put("Nickels: ", money.nickels);
    //            logWriter.println("GIVE CHANGE: $" + currentBalance + " $" + moneyAsCurrency);
    //            currentBalance = 0.0;
    //            mainMenu();
    //        }
    //        System.out.println("Please enter a valid menu option");
    //        purchaseMenu();
    //    } catch (Exception e) {
    //        System.exit(0);
    //    }
    //}
    //
    //public void mainMenu() {
    //    System.out.println("(1) Display Vending Machine Items");
    //    System.out.println("(2) Purchase");
    //    System.out.println("(3) Exit");
    //    String mainMenuSelection = userInput.nextLine();
    //    if (mainMenuSelection.equals("1")) {
    //        displayItems();
    //        System.out.println();
    //        mainMenu();
    //    }
    //    if (mainMenuSelection.equals("2")) {
    //        purchaseMenu();
    //    }
    //    if (mainMenuSelection.equals("3")) {
    //        System.exit(0);
    //    }
    //    System.out.println("Please enter a valid menu option");
    //    System.out.println();
    //    mainMenu();
    //}
    //
    //
    //public Double getCurrentBalance() {
    //    return currentBalance;
    //}
    //
}   //





