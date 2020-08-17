package com.DesignPatterns.Template.Exercise;

public class FileWindow extends Window{
    @Override
    protected void afterClose() {
        System.out.println("File transferred");
    }
}
