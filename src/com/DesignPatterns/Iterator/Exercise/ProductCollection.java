package com.DesignPatterns.Iterator.Exercise;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Iterator createIterator() {
        return new ProductIterator(this);
    }

    public void push(Product product) {
        products.add(product);
    }

    public Product pop() {
        var lastIndex = products.size() - 1;
        var lastProduct = products.get(lastIndex);
        products.remove(lastProduct);
        return lastProduct;
    }

    public class ProductIterator implements Iterator {
        private ProductCollection productCollection;
        private int index;

        public ProductIterator(ProductCollection productCollection) {
            this.productCollection = productCollection;
        }

        @Override
        public boolean hasNext() {
            return index < productCollection.products.size();
        }

        @Override
        public Product current() {
            return productCollection.products.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
