import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginScreen implements ActionListener {

    static JFrame Lframe;
    static JPanel Lpanel;
    static JLabel userLabel, passwordLabel, success;
    static JTextField userField;
    static JPasswordField passwordField;
    NewEntry entry;


    public static void main(String[] args) {
    // create Frame
        Lframe = new JFrame();
        Lframe.setSize(350, 200);
        Lframe.setTitle("Login");
        Lframe.setResizable(false);

    // create Panel
        Lpanel = new JPanel();
        Lpanel.setSize(350, 200);
        Lpanel.setLayout(null);
        Lframe.add(Lpanel);
    
    // create Username
        userLabel = new JLabel();
        userLabel.setText("Username:");
        userLabel.setBounds(10, 20, 80, 25);
        Lpanel.add(userLabel);

        // Username TextField 
        userField = new JTextField();
        userField.setBounds(100, 20, 165, 25);
        Lpanel.add(userField);
  
        // create Password
        passwordLabel = new JLabel();
        passwordLabel.setText("Password: ");
        passwordLabel.setBounds(10, 50, 80, 25);
        Lpanel.add(passwordLabel);

        // Password TextField
        passwordField = new JPasswordField();
        passwordField.setBounds(100, 50, 165, 25);
        Lpanel.add(passwordField);

        // submit Button
        JButton submit = new JButton("Login");
        submit.setBounds(130, 90, 80, 25);
        submit.addActionListener((ActionListener) new LoginScreen());
        Lpanel.add(submit); 

        //success message 
        success = new JLabel(); 
        Lpanel.add(success);
        Lframe.setVisible(true);
        Lpanel.setVisible(true);
}

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userField.getText();
        String password = passwordField.getText();

        if (user.equals("tab") && password.equals("password")) {
            success.setText("Login successful");
            success.setBounds(120, 120, 300, 25);
            entry = new NewEntry();
        }

        else {
            success.setText("Wrong username or password");
            success.setBounds(87, 120, 300, 25);
        }  
    }
}