package com.techelevator;

import java.io.File;
import java.util.Map;
import java.util.Scanner;

public class FileReader {

    public FileReader() {
    }

    MainMenu mainMenu = new MainMenu();
    VendingMachine vendingMachine = new VendingMachine();

    public Map<String, Double> vendingMapBuilder() {
        File vendingMachineList = new File("vendingmachine.csv");
        try (Scanner itemsListScanner = new Scanner(vendingMachineList)) {
            while (itemsListScanner.hasNextLine()) {
                String itemsListLine = itemsListScanner.nextLine();
                String[] itemDelimiter = itemsListLine.split("\\|");
                String id = itemDelimiter[0];
                String name = itemDelimiter[1];
                Double price = Double.parseDouble(itemDelimiter[2]);
                String type = itemDelimiter[3];
                int qty = 5;
                vendingMachine.vendingPriceMap.put(id, price);
                vendingMachine.vendingItemQtyMap.put(id, qty);
                vendingMachine.vendingTypeMap.put(id, type);
                vendingMachine.vendingNameMap.put(id, name);
            }
        } catch (Exception e) {
            System.exit(0);
        }
        return vendingMachine.vendingPriceMap;
    }



    public void buildItemsList() {
        File vendingMachineList = new File("vendingmachine.csv");
        try (Scanner itemsListScanner = new Scanner(vendingMachineList)) {
            while (itemsListScanner.hasNextLine()) {
                String itemLine = itemsListScanner.nextLine();
                String[] itemLineArray = itemLine.split("\\|");
                String id = itemLineArray[0];
                int itemQty = vendingMachine.vendingItemQtyMap.get(id);
                if (itemQty > 0) {
                    System.out.println(itemLine + "|" + itemQty);
                } else {
                    System.out.println(itemLine + "|SOLD OUT");
                }
            }
        } catch (Exception e) {
            System.exit(0);
        }
    }
}
