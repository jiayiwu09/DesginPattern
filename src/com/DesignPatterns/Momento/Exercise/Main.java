package com.DesignPatterns.Momento.Exercise;

public class Main {
    public static void main(String[] args) {
        var document = new Document();
        var history = new DocumentHistory();

        document.setContent("Hello");
        history.push(document.createState());

        document.setFontName("Font 1");
        history.push(document.createState());

        document.setFontSize(10);

        System.out.println(document);

        document.restore(history.pop());
        System.out.println(document);

        document.restore(history.pop());
        System.out.println(document);
    }
}
