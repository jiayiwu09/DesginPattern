package com.DesignPatterns.Template.Exercise;

public class Window {
    public void close() {
        beforeClose();

        System.out.println("Closing the window");

        afterClose();
    }

    protected void beforeClose() {};
    protected void afterClose() {};
}
