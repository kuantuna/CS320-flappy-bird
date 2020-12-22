package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register extends JPanel {

    private JLabel usernameLabel, passwordLabel, passwordLabelAgain;
    private JTextField usernameField;
    private JPasswordField passwordField, passwordFieldAgain;
    private JButton registerButton;

    public Register(){
        setLayout(null);

        // Username label and username text field
        usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(10, 20, 80, 25);
        add(usernameLabel);
        usernameField = new JTextField(20);
        usernameField.setBounds(130, 20, 165, 25);
        add(usernameField);

        // Password label and password password field
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        add(passwordLabel);
        passwordField = new JPasswordField(20);
        passwordField.setBounds(130,50,165,25);
        add(passwordField);

        // Password label and password password field "again"
        passwordLabelAgain = new JLabel("Password (Again)");
        passwordLabelAgain.setBounds(10, 80, 100, 25);
        add(passwordLabelAgain);
        passwordFieldAgain = new JPasswordField(20);
        passwordFieldAgain.setBounds(130,80,165,25);
        add(passwordFieldAgain);

        registerButton = new JButton("Register");
        registerButton.setBounds(10, 110,90,25);
        add(registerButton);
        class RegisterButtonActionListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                // If username exists -> option pane
                // If not -> save to the db
            }
        }
        registerButton.addActionListener(new RegisterButtonActionListener());
    }
}
