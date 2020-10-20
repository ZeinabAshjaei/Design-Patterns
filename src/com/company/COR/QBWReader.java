package com.company.COR;

public class QBWReader extends DataReader {

    public QBWReader(DataReader next) {
        super(next);
    }

    @Override
    protected String getExtension() {
        return ".qbw";
    }

    @Override
    public void doHandle(String filename) {
        System.out.println("Reading data from an qbw spreadsheet.");
    }
}
