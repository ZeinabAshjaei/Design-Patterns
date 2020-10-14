package com.company;
import com.company.iterator.Iterator;
import com.company.iterator.Product;
import com.company.iterator.ProductCollection;

public class Main {

    public static void main(String[] args) {
        ProductCollection collection = new ProductCollection();
        collection.add(new Product(1, "a"));
        collection.add(new Product(2, "b"));
        collection.add(new Product(3, "c"));

        Iterator iterator = collection.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
