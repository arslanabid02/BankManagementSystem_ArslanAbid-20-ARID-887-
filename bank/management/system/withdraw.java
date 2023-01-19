
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;
import java.time.LocalDate;
public class withdraw extends JFrame implements ActionListener {
    JButton exit,withdraw,back;
    String CardNumber, PinNumber;
    JTextField withdrawAmount;
    
withdraw( String CardNumber){
    this.CardNumber = CardNumber;
getContentPane().setBackground(Color.WHITE);
//
//ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpeg"));
//Image i2 = i1.getImage().getScaledInstance(1280,720,Image.SCALE_DEFAULT);
//ImageIcon i3 = new ImageIcon(i2);
//JLabel image = new JLabel(i3);
//image.setBounds(0,0,1280,720);
//add(image);

JLabel topText = new JLabel("Enter the Amount to Withdraw");
topText.setFont(new Font("Courier",Font.BOLD,35));
topText.setBounds(500,60,500,50);
topText.setForeground(Color.BLACK);
add(topText);


ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpeg"));
        Image i12 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i13 = new ImageIcon(i12);
        JLabel label = new JLabel(i13);
        label.setBounds(50,10,100,100);
        add(label);
        
         JLabel bName = new JLabel("Trust Bank");
        bName.setBounds(150,40,400,40);//3d Option for Text Length
        bName.setFont(new Font("GothamBlack", Font.BOLD, 30));
        add(bName);

withdrawAmount= new JTextField();
withdrawAmount.setBounds(400,155,600,40);
withdrawAmount.setBackground(Color.WHITE);
withdrawAmount.setForeground(Color.BLACK);
withdrawAmount.setFont(new Font("ariel",Font.BOLD,20));
add(withdrawAmount);
        
 withdraw = new JButton("withdraw");
withdraw.setBounds(470,250,200,40);
withdraw.setBackground(Color.BLACK);
withdraw.setForeground(Color.WHITE);
withdraw.setFont(new Font("ariel",Font.BOLD,20));
withdraw.addActionListener(this);
add(withdraw);

 

back = new JButton("Back");
back.setBounds(680,250,200,40);
back.setBackground(Color.BLACK);
back.setForeground(Color.WHITE);
back.setFont(new Font("ariel",Font.BOLD,20));
back.addActionListener(this);
add(back);

 
 exit = new JButton("Exit");
exit.setBounds(580,300,200,40);
exit.setBackground(Color.RED);
exit.setForeground(Color.WHITE);
exit.setFont(new Font("ariel",Font.BOLD,20));
add(exit);
exit.addActionListener(this);

    setLayout(null);
    setSize(900,750);
    setLocation(250,0);
    setVisible(true);
    

}
   public void actionPerformed(ActionEvent ae){
     
    if(ae.getSource()==exit){
        System.exit(0);
    }
        else if(ae.getSource()==back){
       setVisible(false);
       new Transactions(CardNumber, PinNumber).setVisible(true);
    }
    else if(ae.getSource()==withdraw){
        String amount = withdrawAmount.getText();
           java.util.Date date = new java.util.Date();    
        if(amount.equals("")){
            JOptionPane.showMessageDialog(null, "Please Enter the withdraw Amount First");
        }
        else{
            try{
            Conn c = new Conn();
                    ResultSet rs = c.s.executeQuery("select * from bank where CardNumber = '"+CardNumber+"' ");
   int balance = 0;
   while(rs.next()){
       if(rs.getString("type").equals("Deposit")){
           balance += Integer.parseInt(rs.getString("amount"));
       }
       else{
           balance-=Integer.parseInt(rs.getString("amount"));
       }
   }
   if(ae.getSource()!=back && balance<Integer.parseInt(amount)){
       JOptionPane.showMessageDialog(null,"Insufficient Balance");
    return;   
   }
            String query = "insert into bank values ('"+CardNumber+"','"+date+"','withdraw','"+amount+"')";
            c.s.executeUpdate(query);
          JOptionPane.showMessageDialog(null, "Amount of Rs "+amount+" is withdrawed to " + CardNumber + " Successfully!");
            }
            catch(Exception e){
                System.out.print(e);
            }
        }
    }
}  
    public static void main(String args[]) {
 new withdraw("");
    }
}
