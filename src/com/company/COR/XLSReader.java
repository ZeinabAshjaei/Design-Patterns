package com.company.COR;

public class XLSReader extends DataReader {

    public XLSReader(DataReader next) {
        super(next);
    }

    @Override
    protected String getExtension() {
        return ".xls";
    }

    @Override
    public void doHandle(String filename) {
        System.out.println("Reading data from an Excel spreadsheet.");
    }
}
