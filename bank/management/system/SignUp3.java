
package bank.management.system;
import java.awt.*; //for font related
import javax.swing.*; //for gui
import java.util.*; // for random
import java.awt.event.*; // for actionlister

public class SignUp3 extends JFrame implements ActionListener{
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit, cancel, exit;
    String formno;
    SignUp3(String formno){
     this.formno = formno;
    setLayout(null);
    
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpeg"));
           Image i12 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i13 = new ImageIcon(i12);
        JLabel label = new JLabel(i13);
        label.setBounds(50,10,100,100);
        add(label);
         JLabel bName = new JLabel("Trust Bank");
        bName.setBounds(150,40,400,40);//3d Option for Text Length
        bName.setFont(new Font("Gotham Black", Font.BOLD, 30));
        add(bName);
    
    getContentPane().setBackground(Color.WHITE);
    setSize(1000,1000);
    setVisible(true);
    setLocation(100,100);
    
        JLabel l1 = new JLabel("PAGE 3: ACCOUNT DETAILS");
        l1.setFont(new Font("Raleway", Font.BOLD ,28));
        l1.setBounds(500,40,400,40);
        add(l1);
        
        JLabel type = new JLabel("Account Type :");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(300, 140, 200, 30);
        add(type);
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBounds(550, 140, 200, 30);
        r1.setBackground(Color.WHITE);
        add(r1);
        
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBounds(750, 140, 200, 30);
        r2.setBackground(Color.WHITE);
        add(r2);
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBounds(550, 190, 200, 30);
        r3.setBackground(Color.WHITE);
        add(r3);
        
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBounds(750, 190, 300, 30);
        r4.setBackground(Color.WHITE);
        add(r4);
        
        ButtonGroup groupacc = new ButtonGroup();
        groupacc.add(r1);
                groupacc.add(r2);
                        groupacc.add(r3);
                                groupacc.add(r4);
                                

        JLabel cardNum = new JLabel("Card Number :");
        cardNum.setFont(new Font("Raleway",Font.BOLD,22));
        cardNum.setBounds(300, 240, 200, 30);
        add(cardNum);
        
         JLabel IcardNum= new JLabel("XXXX-XXXX-XXXX-1234");
        IcardNum.setFont(new Font("Raleway",Font.BOLD,16));
        IcardNum.setBounds(550, 240, 250, 30);
        add(IcardNum);
        
         JLabel pin = new JLabel("Pin Code :");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(300, 290, 200, 30);
        add(pin);
        
         JLabel Ipin= new JLabel("XXXX");
        Ipin.setFont(new Font("Raleway",Font.BOLD,16));
        Ipin.setBounds(550, 290, 250, 30);
        add(Ipin);
        
         JLabel pinDetail= new JLabel("Your 4 digit Password");
        pinDetail.setFont(new Font("Raleway",Font.BOLD,12));
        pinDetail.setBounds(300, 310, 250, 30);
        add(pinDetail);
        
         JLabel services = new JLabel("Services Required :");
        services.setFont(new Font(" Raleway",Font.BOLD,22));
        services.setBounds(300, 360, 200, 30);
        add(services);
        
        
        c1 = new JCheckBox("ATM CARD");
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(550, 360, 150, 30);
        c1.setBackground(Color.WHITE);
        add(c1);
        
          c2 = new JCheckBox("Internet Banking");
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(750, 360, 150, 30);
        c2.setBackground(Color.WHITE);
        add(c2);
        
          c3 = new JCheckBox("Mobile Banking");
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(550, 410, 150, 30);
        c3.setBackground(Color.WHITE);
        add(c3);
        
        c4 = new JCheckBox("Email Alerts");
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(750, 410, 150, 30);
        c4.setBackground(Color.WHITE);
        add(c4);
        
        c5 = new JCheckBox("Cheque Book");
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(550, 460, 150, 30);
        c5.setBackground(Color.WHITE);
        add(c5);
         
        c6 = new JCheckBox("E-Statement");
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(750, 460, 150, 30);
        c6.setBackground(Color.WHITE);
        add(c6);
         
        c7 = new JCheckBox("I hearby declare that the above entered details are correct in the best of my Knowledge");
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(550, 550, 750, 30);
        c7.setBackground(Color.WHITE);
        add(c7);
        
        submit = new JButton("Submit");
        submit.setFont(new Font("Raleway",Font.BOLD,22));
        submit.setBounds(550, 600, 120, 30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
         cancel = new JButton("Cancel");
        cancel.setFont(new Font("Raleway",Font.BOLD,22));
        cancel.setBounds(690, 600, 120, 30);
        cancel.setBackground(Color.RED);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        add(cancel);
        
        exit = new JButton("Back");
       exit.setBounds(750, 660, 100, 30);
        exit.setFont(new Font("Raleway",Font.BOLD, 18));
       exit.setBackground(Color.RED);
       exit.setForeground(Color.WHITE);
       exit.addActionListener(this);
       add(exit);
    }
    public void actionPerformed(ActionEvent ae){
       if(ae.getSource()==submit){
             String acctype = null;
           if(r1.isSelected()){
            acctype = "Saving Account";
           }else if(r2.isSelected()){
               acctype = "Fixed Deposit Account";
           }
           else if(r3.isSelected()){
               acctype = "Current Account";
           }else if(r4.isSelected()){
               acctype = "Recurring Deposit Account";
           }
           Random ran = new Random();
       String cardNumber = "" +  Math.abs(ran.nextLong()%90000000L)+50409360L;
       String pinNumber = ""+Math.abs((ran.nextLong() % 90001L));
       System.out.print(cardNumber);

       String facility = "";
       if(c1.isSelected()){
           facility = facility + " ATM Card";
       } else if(c2.isSelected()){
        facility = facility + " Internet Banking";
       }else if(c3.isSelected()){
        facility = facility + " Mobile Banking";
       }else if(c4.isSelected()){
        facility = facility + " Email & SMS Alerts";
       }else if(c5.isSelected()){
        facility = facility + " Cheque Book";
       }else if(c6.isSelected()){
        facility = facility + " E-Statement";
       }
         try{
           if(acctype.equals(null)){
             JOptionPane.showMessageDialog(null,"Account Type is Required");              }
           else if(c7.equals("")){
               JOptionPane.showMessageDialog(null,"You must have to confirm the information");
           }
           else{
               Conn c = new Conn();
               String query1 = "insert into signup3 values('"+formno+"','"+acctype+"','"+cardNumber+"','"+pinNumber+"','"+facility+"')";
             String query2 = "insert into login values('"+formno+"','"+cardNumber+"','"+pinNumber+"')";
             
             JOptionPane.showMessageDialog(null,"Card Number : "+cardNumber+"\n Pin Code : "+pinNumber);  
             c.s.executeUpdate(query1);
             c.s.executeUpdate(query2);


           }
       }catch(Exception e){
           System.out.println(e);
       }
               }
     
       else if(ae.getSource()==cancel){
           
       }
       else if(ae.getSource()==exit){
        setVisible(false);
        new SignUp2(formno).setVisible(true);
       }
    }
    public static void main(String args[]) {
     new SignUp3("");
    }
}
