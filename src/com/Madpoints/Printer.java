package com.Madpoints;

public class Printer {
    private String manufacturer;
    private String model;
    private double tonerLevel = 100;
    private int pagesPrinted;
    private boolean duplexPrinter;

    public Printer(String manufacturer, String model, double tonerLevel, int pagesPrinted, boolean duplexPrinter) {
        this.manufacturer = manufacturer;
        this.model = model;

        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }

        this.pagesPrinted = pagesPrinted;
        this.duplexPrinter = duplexPrinter;
    }

    public void getSpecs() {
        System.out.println("Manufacturer: " + this.manufacturer);
        System.out.println("Model: " + this.model);
        System.out.println("Duplex Printer: " + this.duplexPrinter);
    }

    public void checkLevels() {
        System.out.println("Toner Level: " + this.tonerLevel + "%");
        System.out.println("Total Pages Printed: " + this.pagesPrinted);
    }

    public void addToner(double toner) {
        if (this.tonerLevel + toner > 100) {
            this.tonerLevel = 100;
        } else {
            this.tonerLevel += toner;
        }

        System.out.println("Toner level increased.");
        checkLevels();
    }

    public void print(int pages) {
        if (this.tonerLevel - (pages * .25) < 0) {
            System.out.println("Cannot print. Refill toner.");
            checkLevels();
        } else {
            this.tonerLevel -= (pages * .25);
            this.pagesPrinted += pages;
            System.out.println("Printed " + pages + " pages.");
            checkLevels();
        }

        if (this.tonerLevel < 25) {
            System.out.println("Toner level low");
        }
    }
}
