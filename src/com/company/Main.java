package com.company;

import com.company.COR.DataReaderFactory;
import com.company.COR.DataReader;

public class Main {

    public static void main(String[] args) {
        DataReader reader = DataReaderFactory.getDataReaderChain();
        reader.handle("data.numbers");
        reader.handle("data.xls");

        reader.handle("data.qbw");
        reader.handle("data.jpg");
    }
}
