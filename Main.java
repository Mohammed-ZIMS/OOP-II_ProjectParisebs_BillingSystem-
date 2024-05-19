import javax.swing.*;
import java.awt.*;

class Main extends JFrame
{

    Main()
    {
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        ImageIcon EbsIco = new ImageIcon(ClassLoader.getSystemResource("ImagePariseba/ebs0.jpg"));
        Image EbsImg = EbsIco.getImage().getScaledInstance(1500, 830, Image.SCALE_DEFAULT);
        ImageIcon EbsIco1 = new ImageIcon(EbsImg);
        JLabel EbsLabel = new JLabel(EbsIco1);
        add(EbsLabel);

        JMenuBar menuBer = new JMenuBar();
        setJMenuBar(menuBer);

        JMenu menu = new JMenu("Menu");
        menu.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        menuBer.add(menu);

        JMenuItem newCustomer = new JMenuItem("New Customer");
        newCustomer.setFont(new Font("Courier New", Font.PLAIN, 14));
        ImageIcon newCustomIcon = new ImageIcon(ClassLoader.getSystemResource("ImagePariseba/newcustomer.png"));
        Image newCustImg = newCustomIcon.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        newCustomer.setIcon(new ImageIcon(newCustImg));
        menu.add(newCustomer);

        JMenuItem customerdetails = new JMenuItem("Customer Details");
        customerdetails.setFont(new Font("monospaced", Font.PLAIN, 14));
        ImageIcon detailsIcon = new ImageIcon(ClassLoader.getSystemResource("ImagePariseba/customerdetails.png"));
        Image detailsImg = detailsIcon.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        customerdetails.setIcon(new ImageIcon(detailsImg));
        menu.add(customerdetails);

        JMenuItem depositdetails = new JMenuItem("Deposit Details ");
        depositdetails.setFont(new Font("monospaced", Font.PLAIN, 14));
        ImageIcon depositIcon = new ImageIcon(ClassLoader.getSystemResource("ImagePariseba/depositdetails.png"));
        Image depositImg = depositIcon.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        depositdetails.setIcon(new ImageIcon(depositImg));
        menu.add(depositdetails);

        JMenuItem calculatebill = new JMenuItem("Calculate Bill ");
        calculatebill.setFont(new Font("monospaced", Font.PLAIN, 14));
        ImageIcon calculateBillIcon = new ImageIcon(ClassLoader.getSystemResource("ImagePariseba/calculatorbills.png"));
        Image calculateBillImg = calculateBillIcon.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        calculatebill.setIcon(new ImageIcon(calculateBillImg));
        menu.add(calculatebill);

        JMenu info = new JMenu("Infromation");
        info.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        menuBer.add(info);
        
        JMenuItem upInfo = new JMenuItem("Updatet Infromation");
        upInfo.setFont(new Font("Courier New", Font.PLAIN, 14));
        ImageIcon upInfoIcon = new ImageIcon(ClassLoader.getSystemResource("ImagePariseba/refresh.png"));
        Image upInfoImg = upInfoIcon.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        upInfo.setIcon(new ImageIcon(upInfoImg));
        info.add(upInfo);

        JMenuItem viewInfo = new JMenuItem("View Infromation");
        viewInfo.setFont(new Font("Courier New", Font.PLAIN, 14));
        ImageIcon viewInfoIcon = new ImageIcon(ClassLoader.getSystemResource("ImagePariseba/information.png"));
        Image viewInfoImg = viewInfoIcon.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        viewInfo.setIcon(new ImageIcon(viewInfoImg));
        info.add(viewInfo);

        JMenu user = new JMenu("User");
        user.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        menuBer.add(user);

        JMenuItem paybill =new JMenuItem("Pay Bill");
        paybill.setFont(new Font("Courier New",Font.PLAIN,14));
        ImageIcon paybillIcon = new ImageIcon(ClassLoader.getSystemResource("ImagePariseba/pay.png"));
        Image paybillImg = paybillIcon.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        paybill.setIcon(new ImageIcon(paybillImg));
        user.add(paybill);

        JMenuItem billdetails =new JMenuItem("Bill Details");
        billdetails.setFont(new Font("Courier New",Font.PLAIN,14));
        ImageIcon billdetailsImg = new ImageIcon(ClassLoader.getSystemResource("ImagePariseba/detail.png"));
        Image billdetailsImage = billdetailsImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        billdetails.setIcon(new ImageIcon(billdetailsImage));
        user.add(billdetails);

        JMenu bill = new JMenu("Bill");
        bill.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        menuBer.add(bill);

        JMenuItem genBill =new JMenuItem("Generate Bill");
        genBill.setFont(new Font("Courier New",Font.PLAIN,14));
        ImageIcon genBillIcon = new ImageIcon(ClassLoader.getSystemResource("ImagePariseba/bill.png"));
        Image genBillImg = genBillIcon.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        genBill.setIcon(new ImageIcon(genBillImg));
        bill.add(genBill);

        JMenu utility = new JMenu("Utility");
        utility.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        menuBer.add(utility);

        JMenuItem calculator =new JMenuItem("Calculator");
        calculator.setFont(new Font("Courier New",Font.PLAIN,14));
        ImageIcon calculatorIcon = new ImageIcon(ClassLoader.getSystemResource("ImagePariseba/calculator.png"));
        Image calculatorImg = calculatorIcon.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        calculator.setIcon(new ImageIcon(calculatorImg));
        utility.add(calculator);

        setLayout(new FlowLayout());
        setTitle("Pariseba");
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        new Main();
    }    
}
