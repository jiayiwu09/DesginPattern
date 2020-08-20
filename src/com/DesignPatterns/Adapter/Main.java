package com.DesignPatterns.Adapter;

import com.DesignPatterns.Adapter.AvaFilter.Caramel;

public class Main {
    public static void main(String[] args) {
        var imageView = new ImageView(new Image());
        imageView.apply(new CaramelFilter(new Caramel()));
    }
}
