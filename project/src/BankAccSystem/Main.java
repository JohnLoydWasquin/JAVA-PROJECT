package project.src.BankAccSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


@SuppressWarnings("unused")
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BANKING SYSTEM");
        
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        JLabel labelaccountNumber = new JLabel("Enter your number: ");
        JTextField textaccountNumber = new JTextField(15);

        JLabel labelAccountHolderName = new JLabel("Enter account holder name: ");
        JTextField textAccountHolderName = new JTextField(15);
        
        JLabel labelBalance = new JLabel("Enter initial balance: ");
        JTextField textBalance = new JTextField(15);
        
        JButton submitButton = new JButton("Submit");

        frame.add(labelaccountNumber);
        frame.add(textaccountNumber);
        frame.add(labelAccountHolderName);
        frame.add(textAccountHolderName);
        frame.add(labelBalance);
        frame.add(textBalance);

        frame.add(new JLabel());
        frame.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String accountNumber = textaccountNumber.getText();
                String accountHolderName = textAccountHolderName.getText();
                String balance = textBalance.getText();

                BankAccount info = new BankAccount(accountNumber, accountHolderName, balance);

                JOptionPane.showMessageDialog(frame, 
                    "Account Created!\nAccount Number: " + info.getNumber() + 
                    "\nHolder Name: " + info.getholderName() + 
                    "\nBalance: $" + info.getBalance());
            }
        });

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
     }

}
