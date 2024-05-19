import javax.swing.*;
import java.awt.*;

class Login extends JFrame
{
    JTextField userText, passwordText;
    Choice loginChoice;

    JButton loginButton, closeButton, sinupButton;
    
    Login()
    {
        super("Login");
        getContentPane().setBackground(new Color(245, 245, 245));

        JLabel userName = new JLabel("User Name");
        userName.setBounds(300, 60, 100, 20);
        add(userName);

        userText = new JTextField();
        userText.setBounds(400,60,150,20);
        add(userText);
        
        JLabel password = new JLabel("Password");
        password.setBounds(300, 100, 100, 20);
        add(password);

        passwordText = new JTextField();
        passwordText.setBounds(400,100,150,20);
        add(passwordText);

        JLabel loginAs = new JLabel("Login As");
        loginAs.setBounds(300, 140, 100, 20);
        add(loginAs);

        loginChoice = new Choice();
        loginChoice.add("Customer");
        loginChoice.add("Admin");
        loginChoice.setBounds(400, 140, 150, 20);
        add(loginChoice);

        loginButton = new JButton("Login");
        loginButton.setBounds(330, 180, 100, 20);
        add(loginButton);

        closeButton = new JButton("Close");
        closeButton.setBounds(460, 180, 100, 20);
        add(closeButton);

        sinupButton = new JButton("Signup");
        sinupButton.setBounds(400, 210, 100, 20);
        add(sinupButton);

        ImageIcon profile1 = new ImageIcon(ClassLoader.getSystemResource("ImagePariseba/profile.png"));
        Image profile2 = profile1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon fProflie = new ImageIcon(profile2);
        JLabel profliLabel = new JLabel(fProflie);
        profliLabel.setBounds(10, 10, 250, 250);
        profliLabel.setBackground(Color.WHITE);
        add(profliLabel);

        setSize(640, 300);
        setLocation(400, 200);
        setTitle("Pariseba");
        setResizable(false);
        setLayout(null);
        setVisible(true);
    }
    
    public static void main(String[] args)
    {
        new Login();
    }
}