package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class Money {
    private double quarters = 0;
    private double dimes = 0;
    private double nickels = 0;
    private double moneyAsCurrency;
    public double currentBalance = 0.0;

    public Money() {
        currentBalance = this.currentBalance;
    }

    public double insert1() {
        currentBalance++;
        return currentBalance;
    }

    public double insert5() {
        currentBalance += 5;
        return currentBalance;
    }

    public double insert10() {
        currentBalance += 10;
        return currentBalance;
    }

    public double getQuarters() {
        return quarters;
    }

    public double getDimes() {
        return dimes;
    }

    public double getNickels() {
        return nickels;
    }

    public double getMoneyAsCurrency() {
        return moneyAsCurrency;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public Map<String, Double> getChangeMap() {
        return changeMap;
    }



    Map <String, Double> changeMap = new HashMap<>();

    Map <String, Double> calculateMoneyAsCurrency() {
        moneyAsCurrency = currentBalance;
        for (double i = moneyAsCurrency; i >= 0.25; quarters++) {
            moneyAsCurrency -= 0.25;
        }
        changeMap.put("Quarters: ", quarters);
        for (double i = moneyAsCurrency; i >= 0.10; dimes++) {
            moneyAsCurrency -= 0.10;
        }
        changeMap.put("Dimes: ", dimes);
        for (double i = moneyAsCurrency; i >= 0.05; nickels++) {
            moneyAsCurrency -= 0.05;
        }
        changeMap.put("Nickels: ", nickels);
        return changeMap;
    }

    Map <String, Double> giveChange() {
        moneyAsCurrency = currentBalance;
        for (double i = moneyAsCurrency; i >= 0.25; quarters--) {
            moneyAsCurrency -= 0.25;
        }
        changeMap.put("Quarters: ", quarters);
        for (double i = moneyAsCurrency; i >= 0.10; dimes--) {
            moneyAsCurrency -= 0.10;
        }
        changeMap.put("Dimes: ", dimes);
        for (double i = moneyAsCurrency; i >= 0.05; nickels--) {
            moneyAsCurrency -= 0.05;
        }
        changeMap.put("Nickels: ", nickels);
        currentBalance = 0.0;
        return changeMap;
    }

}
