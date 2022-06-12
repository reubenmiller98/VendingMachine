package com.techelevator;
import java.io.File;
import java.util.List;
import java.util.Scanner;
public class Application {

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        FileReader fileReader = new FileReader();
        fileReader.vendingMapBuilder();
        MainMenu mainmenu = new MainMenu();
        System.out.println("Welcome to the Wooben Vending Machine!");
        System.out.println("Please select an option below:");
        System.out.println();
        mainmenu.mainMenu();
        InputOutput inputOutput = new InputOutput();








    }
}
