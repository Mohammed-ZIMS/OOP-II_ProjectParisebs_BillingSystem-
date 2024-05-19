import javax.swing.*;
import java.awt.*;

class SignUp extends JFrame {
    JLabel CreateAs, MeterNumber, UserName, Name, Password;
    Choice loginAsChoice;
    JTextField MeterTextField, UserNameTextField, NameTextField, PasswordTextField;
    JButton create, back;

    SignUp() 
    {
        super("Signup");

        CreateAs = new JLabel("Create As: ");
        CreateAs.setBounds(30, 140, 125, 20);
        add(CreateAs);

        loginAsChoice = new Choice();
        loginAsChoice.add("Customer");
        loginAsChoice.add("Admin");
        loginAsChoice.setBounds(170, 140, 150, 20);
        add(loginAsChoice);

        UserName = new JLabel("User Name: ");
        UserName.setBounds(30, 180, 125, 20);
        add(UserName);

        UserNameTextField = new JTextField();
        UserNameTextField.setBounds(170, 180, 150, 20);
        add(UserNameTextField);

        Name = new JLabel("Name: ");
        Name.setBounds(30, 220, 125, 20);
        add(Name);

        NameTextField = new JTextField();
        NameTextField.setBounds(170, 220, 150, 20);
        add(NameTextField);

        MeterNumber = new JLabel("Meter Number: ");
        MeterNumber.setBounds(30, 260, 125, 20);
        add(MeterNumber);

        MeterTextField = new JTextField();
        MeterTextField.setBounds(170, 260, 150, 20);
        add(MeterTextField);

        Password = new JLabel("Password: ");
        Password.setBounds(30, 300, 125, 20);
        add(Password);

        PasswordTextField = new JTextField();
        PasswordTextField.setBounds(170, 300, 150, 20);
        add(PasswordTextField);

        create = new JButton("Create");
        create.setBounds(30, 350, 100, 30);
        add(create);

        back = new JButton("Back");
        back.setBounds(150, 350, 100, 30);
        add(back);

        setSize(400, 500);
        setResizable(false);
        setLocation(500, 180);
        setTitle("Sign Up");
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new SignUp();
    }
}
