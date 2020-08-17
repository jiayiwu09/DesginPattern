package com.DesignPatterns.Template;

public class GenerateReport extends Task {

    @Override
    protected void doExecute() {
        System.out.println("Generate Report");
    }
}
