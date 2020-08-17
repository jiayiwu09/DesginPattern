package com.DesignPatterns.Momento;

import com.DesignPatterns.Momento.Exercise.Document;
import com.DesignPatterns.Momento.Exercise.DocumentHistory;

public class Main {
    public static void main(String[] args) {
        // write your code here
        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.restore(history.pop());

        System.out.println(editor.getContent());
    }
}
