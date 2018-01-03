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

    private String getManufacturer() {
        return manufacturer;
    }

    private String getModel() {
        return model;
    }

    private double getTonerLevel() {
        return tonerLevel;
    }

    private int getPagesPrinted() {
        return pagesPrinted;
    }

    private boolean isDuplexPrinter() {
        return duplexPrinter;
    }
}
