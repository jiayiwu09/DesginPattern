package com.DesignPatterns.Iterator;

public class Main {
    public static void main(String[] args){
        var history = new BrowserHistory();

        for (int i = 0; i < 10; i++) {
            char c = (char)(65 + i);
            history.push(Character.toString(c));
        }

        var iterator = history.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
