package com.Madpoints;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer("HP", "2600", 50, 25, true);

        printer.getSpecs();
        printer.checkLevels();
        printer.print(101);

        printer.print(100);
    }
}
