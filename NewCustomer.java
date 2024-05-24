import java.awt.*;
import java.util.Random;
import javax.swing.*;

class NewCustomer extends JFrame {
    JLabel newCustomerLabel, MeterNoLabel, AddressLabel, CityLabel, StateLabel, EmailLabel, PhonNumberLabel;
    JTextField newCustomerTextField, MeterNoTextField, AddressTextField, CityTextField, StateTextField, EmailTextField, PhonNumberTextField;
    JButton CancelButton, NextButton;

    NewCustomer() {
        JPanel newCustomerPanel = new JPanel();
        newCustomerPanel.setBackground(new Color(252, 186, 3));

        JLabel heading1 = new JLabel("New Customer");
        heading1.setBounds(180, 10, 200, 20);
        heading1.setFont(new Font("Times New Roman", Font.BOLD, 24));
        newCustomerPanel.add(heading1);

        newCustomerLabel = new JLabel("Customer Name: ");
        newCustomerLabel.setBounds(50, 80, 120, 20);
        newCustomerPanel.add(newCustomerLabel);

        newCustomerTextField = new JTextField();
        newCustomerTextField.setBounds(180, 80, 150, 20);
        newCustomerPanel.add(newCustomerTextField);

        MeterNoLabel = new JLabel("Meter No: ");
        MeterNoLabel.setBounds(50, 110, 120, 20);
        newCustomerPanel.add(MeterNoLabel);

        MeterNoTextField = new JTextField();
        MeterNoTextField.setBounds(180, 110, 150, 20);
        newCustomerPanel.add(MeterNoTextField);

        Random ran = new Random();
        long number = ran.nextLong() % 1000000;
        MeterNoTextField.setText("" + Math.abs(number));

        AddressLabel = new JLabel("Address: ");
        AddressLabel.setBounds(50, 140, 120, 20);
        newCustomerPanel.add(AddressLabel);

        AddressTextField = new JTextField();
        AddressTextField.setBounds(180, 140, 150, 20);
        newCustomerPanel.add(AddressTextField);

        CityLabel = new JLabel("City: ");
        CityLabel.setBounds(50, 180, 120, 20);
        newCustomerPanel.add(CityLabel);

        CityTextField = new JTextField();
        CityTextField.setBounds(180, 180, 150, 20);
        newCustomerPanel.add(CityTextField);

        StateLabel = new JLabel("State: ");
        StateLabel.setBounds(50, 220, 120, 20);
        newCustomerPanel.add(StateLabel);

        StateTextField = new JTextField();
        StateTextField.setBounds(180, 220, 150, 20);
        newCustomerPanel.add(StateTextField);

        EmailLabel = new JLabel("Email: ");
        EmailLabel.setBounds(50, 260, 120, 20);
        newCustomerPanel.add(EmailLabel);

        EmailTextField = new JTextField();
        EmailTextField.setBounds(180, 260, 150, 20);
        newCustomerPanel.add(EmailTextField);

        PhonNumberLabel = new JLabel("Phone Number: ");
        PhonNumberLabel.setBounds(50, 300, 120, 20);
        newCustomerPanel.add(PhonNumberLabel);

        PhonNumberTextField = new JTextField();
        PhonNumberTextField.setBounds(180, 300, 150, 20);
        newCustomerPanel.add(PhonNumberTextField);

        NextButton = new JButton("Next");
        NextButton.setBounds(120, 340, 100, 30);
        NextButton.addActionListener(e -> {
            // Handle next button action here
            JOptionPane.showMessageDialog(this, "Next button clicked");
        });
        newCustomerPanel.add(NextButton);

        CancelButton = new JButton("Cancel");
        CancelButton.setBounds(240, 340, 100, 30);
        CancelButton.addActionListener(e -> {
            // Handle cancel button action here
            this.dispose();
        });
        newCustomerPanel.add(CancelButton);

        setSize(700, 500);
        setLocation(400, 200);
        setResizable(false);
        
        newCustomerPanel.setLayout(null);
        add(newCustomerPanel, "Center");
        
        ImageIcon NewCustomerIcon = new ImageIcon(ClassLoader.getSystemResource("ImagePariseba/boy.png"));
        Image NewCustomerImg = NewCustomerIcon.getImage().getScaledInstance(230, 200, Image.SCALE_DEFAULT);
        ImageIcon NewCustomerIcon1 = new ImageIcon(NewCustomerImg);
        JLabel newCustomerLabel = new JLabel(NewCustomerIcon1);
        add(newCustomerLabel, "West");
        
        setVisible(true);
    }

    public static void main(String[] args) {
        new NewCustomer();
    }
}
