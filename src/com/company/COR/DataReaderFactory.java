package com.company.COR;

public class DataReaderFactory {
    public static DataReader getDataReaderChain() {


        QBWReader quickBooksReader = new QBWReader(null);
        NumbersReader numbersReader = new NumbersReader(quickBooksReader);
        XLSReader excelReader = new XLSReader(numbersReader);

        return excelReader;
    }
}
