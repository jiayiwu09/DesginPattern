package com.DesignPatterns.Mediator.Exercise;

public class SignupDialogBox {
    private TextBox userNameTextBox = new TextBox();
    private TextBox passwordTextBox = new TextBox();
    private CheckBox termsAndConditionCheckBox = new CheckBox();
    private Button signupButton = new Button();

    public SignupDialogBox() {
        userNameTextBox.addEventHandler(this::uicontrolchange);
        passwordTextBox.addEventHandler(this::uicontrolchange);
        termsAndConditionCheckBox.addEventHandler(this::uicontrolchange);
    }

    private void uicontrolchange() {
        signupButton.setEnabled(isFormValid());
    }

    private boolean isFormValid() {
        return !userNameTextBox.isEmpty() && !passwordTextBox.isEmpty() && termsAndConditionCheckBox.isChecked();
    }

    public void simulateUserInteraction() {
        // Initially the button should be disabled
        System.out.println("Initially: " + signupButton.isEnabled());

        // The user enters their username, the button is still disabled
        userNameTextBox.setContent("username");
        System.out.println("After setting the username: " + signupButton.isEnabled());

        // The user enters their password, the button is still disabled
        passwordTextBox.setContent("password");
        System.out.println("After setting the password: " + signupButton.isEnabled());

        // The agrees to the terms, the button becomes enabled
        termsAndConditionCheckBox.setChecked(true);
        System.out.println("After agreeing to terms: " + signupButton.isEnabled());

        // The user removes the password, the button becomes disabled
        passwordTextBox.setContent("");
        System.out.println("After removing the password: " + signupButton.isEnabled());

        // The user enters the password again, the button becomes enabled
        passwordTextBox.setContent("password");
        System.out.println("After re-setting the password: " + signupButton.isEnabled());
    }
}
