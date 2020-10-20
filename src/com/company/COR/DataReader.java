package com.company.COR;

public abstract class DataReader {
    private DataReader next;

    public DataReader(DataReader next) {
        this.next = next;
    }

    public void handle(String filename){
        if(filename.endsWith(getExtension()))
           this.doHandle(filename);
        if(next != null){
            next.handle(filename);
        }
    }

    protected abstract String getExtension();
    protected abstract void doHandle(String filename);
}
