package com.DesignPatterns.Proxy.Exercise;

public class Main {
    public static void main(String[] args) {
        var dbContext = new DbContext();
        var product = dbContext.getProduct(1);
        product.setName("Updated Name");
        dbContext.saveChanges();

        product.setName("Another name");
        dbContext.saveChanges();
    }
}
