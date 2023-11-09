package com.pluralsight;

public class Cash extends AbstractAssets {
    private double mattressCash;

    public Cash(String description, String dateAcquired, double originalCost, double mattressCash) {
        super(description, dateAcquired, originalCost);
        this.mattressCash = mattressCash;
    }

    public double getMattressCash() {
        return mattressCash;
    }

    public void setMattressCash(double mattressCash) {
        this.mattressCash = mattressCash;
    }
    @Override
    public double getValue() {
        return mattressCash;
    }
}
