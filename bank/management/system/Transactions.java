
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Transactions extends JFrame implements ActionListener {
    JButton exit,deposit,withdraw,fastcash,ministatement,pinchange,balanceinquiry;
    String PinNumber,CardNumber;
Transactions( String CardNumber,String PinNumber){
    this.PinNumber = PinNumber;
    this.CardNumber = CardNumber;
getContentPane().setBackground(Color.WHITE);
//
//ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpeg"));
//Image i2 = i1.getImage().getScaledInstance(1280,720,Image.SCALE_DEFAULT);
//ImageIcon i3 = new ImageIcon(i2);
//JLabel image = new JLabel(i3);
//image.setBounds(0,0,1280,720);
//add(image);

JLabel topText = new JLabel("PLEASE SELECT YOUR TRANSACTION");
topText.setFont(new Font("Courier",Font.BOLD,35));
topText.setBounds(500,40,500,50);
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

 deposit = new JButton("Deposit");
deposit.setBounds(355,155,200,40);
deposit.setBackground(Color.BLACK);
deposit.setForeground(Color.WHITE);
deposit.setFont(new Font("ariel",Font.BOLD,20));
deposit.addActionListener(this);
add(deposit);

 withdraw = new JButton("Withdraw");
withdraw.setBounds(655,155,200,40);
withdraw.setBackground(Color.BLACK);
withdraw.setForeground(Color.WHITE);
withdraw.setFont(new Font("ariel",Font.BOLD,20));
withdraw.addActionListener(this);

add(withdraw);

 fastcash = new JButton("Fast Cash");
fastcash.setBounds(355,215,200,40);
fastcash.setBackground(Color.BLACK);
fastcash.setForeground(Color.WHITE);
fastcash.setFont(new Font("ariel",Font.BOLD,20));
fastcash.addActionListener(this);

add(fastcash);

 ministatement = new JButton("Mini Statement");
ministatement.setBounds(655,215,200,40);
ministatement.setBackground(Color.BLACK);
ministatement.setForeground(Color.WHITE);
ministatement.setFont(new Font("ariel",Font.BOLD,20));
add(ministatement);

 pinchange = new JButton("Pin Change");
pinchange.setBounds(355,275,200,40);
pinchange.setBackground(Color.BLACK);
pinchange.setForeground(Color.WHITE);
pinchange.setFont(new Font("ariel",Font.BOLD,20));
add(pinchange);

 balanceinquiry = new JButton("Balance inquiry");
balanceinquiry.setBounds(655,275,200,40);
balanceinquiry.setBackground(Color.BLACK);
balanceinquiry.setForeground(Color.WHITE);
balanceinquiry.setFont(new Font("ariel",Font.BOLD,20));
add(balanceinquiry);

 exit = new JButton("Exit");
exit.setBounds(355,335,200,40);
exit.setBackground(Color.BLACK);
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
    else if(ae.getSource()==deposit){
        setVisible(false);
        new deposit(CardNumber).setVisible(true);
    }
    else if(ae.getSource()==fastcash){
        setVisible(false);
        new fastcash(CardNumber,PinNumber).setVisible(true);
    }
      else if(ae.getSource()==withdraw){
        setVisible(false);
        new withdraw(CardNumber).setVisible(true);
    }
   
}  
    public static void main(String args[]) {
 new Transactions("","");
    }
}
