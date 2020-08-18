package com.DesignPatterns.Mediator;

public class Buttton extends UIControl{
    private boolean isEnabled;

    public Buttton(DialogBox owner) {
        super(owner);
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
        owner.changed(this);
    }
}
