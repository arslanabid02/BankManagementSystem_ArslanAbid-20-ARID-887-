
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener{
    JButton login, clear, signup,exit; // making the clear, login and signup GLOBAL
    JTextField cardNumber, pinNumber; // making the input values to be publicly retriveable
    
    Login(){
        setLayout(null);// to make set custom location of the image
        setTitle("Banking System");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpeg"));
        Image i12 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i13 = new ImageIcon(i12);
        JLabel label = new JLabel(i13);
        label.setBounds(450,10,100,100);
        add(label);
        
        getContentPane().setBackground(Color.WHITE);
        
        
        //BANK NAME
        JLabel bName = new JLabel("Trust Bank");
        bName.setBounds(550,40,400,40);//3d Option for Text Length
        bName.setFont(new Font("Raleway", Font.BOLD, 38));
        add(bName);
        
        
        //CARD NUMBER
         JLabel CardNum = new JLabel("Card Number : ");
        CardNum.setBounds(400,150,400,20);
        CardNum.setFont(new Font("Raleway", Font.BOLD, 18));
        add(CardNum);
        // Input for card number
        cardNumber= new JTextField();
        cardNumber.setBounds(600, 150, 220,30);
        cardNumber.setFont(new Font("Raleway", Font.LAYOUT_LEFT_TO_RIGHT, 18 ));
       add(cardNumber);
        //Password
         JLabel pass = new JLabel("Password : ");
        pass.setBounds(400,200,400,20);
        pass.setFont(new Font("Raleway", Font.BOLD, 18));
        add(pass);
        // Input for password
        pinNumber= new JTextField();
        pinNumber.setBounds(600, 200, 220,30);
        pinNumber.setFont(new Font("Osward", Font.LAYOUT_LEFT_TO_RIGHT, 18 ));
       add(pinNumber);
       
       // Button_Login
       login = new JButton("Login");
       login.setBounds(500, 250, 135, 30);
       login.setBackground(Color.BLACK);
       login.setForeground(Color.WHITE);
       login.setFont(new Font("Raleway",Font.BOLD, 18));
       add(login);
       login.addActionListener(this);

        // Button_Clear
       clear = new JButton("Clear");
       clear.setBounds(660, 250, 135, 30);
       clear.setFont(new Font("Raleway",Font.BOLD, 18));
       clear.setBackground(Color.BLACK);
       clear.setForeground(Color.WHITE);
       add(clear);
       clear.addActionListener(this);

       
           // Button_Signup
       signup = new JButton("SignUp");
       signup.setBounds(500, 300, 135, 30);
       signup.setFont(new Font("Raleway",Font.BOLD, 18));
       signup.setBackground(Color.BLACK);
       signup.setForeground(Color.WHITE);
       signup.addActionListener(this);

       add(signup);
       
         exit = new JButton("Exit");
       exit.setBounds(660, 300, 135, 30);
       exit.setFont(new Font("Raleway",Font.BOLD, 18));
       exit.setBackground(Color.RED);
       exit.setForeground(Color.WHITE);
       exit.addActionListener(this);
       add(exit);
        
    setSize(1280,720);    
    setVisible(true);
    setLocation(100,100);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==clear){
            cardNumber.setText("");
            pinNumber.setText("");
        }
        else if(ae.getSource()==login){
            Conn c = new Conn();
            String CardNumber = cardNumber.getText();
            String PinNumber = pinNumber.getText();
            String query = "select * from login where cardNumber = '"+CardNumber+"' and pinNumber = '"+PinNumber+"'";
            try{
                ResultSet rs = c.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                  new Transactions(CardNumber,PinNumber).setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Incorrect Pin or Car Number");
                }
            }catch(Exception e){
                System.out.println(e);
            }
                    }
        else if(ae.getSource()==exit){
        System.exit(0);
    }
        else if(ae.getSource()==signup){
      
           setVisible(false);
           new SignUp("").setVisible(true);
          

        }
        
    }
    public static void main(String args[]) {
     new Login();
    }

}
