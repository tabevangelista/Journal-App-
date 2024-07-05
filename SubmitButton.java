import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class SubmitButton implements ActionListener {

    LoginScreen login;
    JButton submit;
    String user;
    String password;
    JLabel success;

    public void submitButton(LoginScreen login) {
        
    }

    public void actionPerformed(ActionEvent e) {
        if (user.equals("tab") && password.equals("password")) {
            NewEntry entry = new NewEntry(); 
            login.Lframe.dispose();
        }
        else {
            login.success = new JLabel();
            login.success.setText("Wrong username or password");
            login.success.setBounds(87, 130, 300, 25);
            login.Lpanel.add(login.success);
        }  
    }
}