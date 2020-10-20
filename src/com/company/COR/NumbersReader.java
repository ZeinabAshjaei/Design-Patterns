package com.company.COR;

public class NumbersReader extends DataReader {

    public NumbersReader(DataReader next) {
        super(next);
    }

    @Override
    protected String getExtension() {
        return ".numbers";
    }

    @Override
    public void doHandle(String filename) {
        System.out.println("Reading data from an numbers spreadsheet.");
    }
}
