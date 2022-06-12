package com.techelevator;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Item {
    private String name;
    private String id;
    private double price;
    private int itemQty;
    private String type;
    public int numberSold;

    FileReader fileReader = new FileReader();

    VendingMachine vendingMachine = new VendingMachine();

    public Item() {
    }

    File vendingMachineList = new File("vendingmachine.csv");

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public int getNumberSold() {
        return numberSold;
    }

    public void setNumberSold(int numberSold) {
        this.numberSold = numberSold;
    }
}
