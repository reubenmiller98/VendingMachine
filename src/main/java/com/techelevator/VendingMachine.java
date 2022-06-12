package com.techelevator;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    Map<String, Double> vendingPriceMap;
    Map<String, Integer> vendingItemQtyMap;
    Map<String, String> vendingTypeMap;
    Map<String, String> vendingNameMap;

    public VendingMachine() {
        vendingPriceMap = new HashMap<>();
        vendingItemQtyMap = new HashMap<>();
        vendingTypeMap = new HashMap<>();
        vendingNameMap = new HashMap<>();
    }

}


