package com.DesignPatterns.Iterator.Exercise;

public class Main {
    public static void main(String[] args) {
        ProductCollection products = new ProductCollection();
        products.add(new Product(1, "PS5"));
        products.add(new Product(2, "Xbox One Series X"));
        products.add(new Product(3, "Dota2"));
        products.add(new Product(4, "CS:GO"));
        products.add(new Product(5, "Odessay"));

        var iterator = products.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
