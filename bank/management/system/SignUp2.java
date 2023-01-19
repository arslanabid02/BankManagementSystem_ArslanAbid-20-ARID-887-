/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser; 
import java.awt.event.*;

public class SignUp2 extends JFrame implements ActionListener {
    String formno;
    JRadioButton syes, sno, eno, eyes;
    JComboBox Ireligion, Ioccupation, Iincome, Iedu ;
    JButton next,exit;
    JTextField Icnic, Ipan;
    SignUp2(String formno){
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
    setSize(1280,720);  
    setVisible(true);
    setLocation(100,100);
    
    JLabel add_details = new JLabel("FORM PAGE 2 : Additional Details");
   add_details.setFont(new Font("Raleway", Font.BOLD, 28));
   add_details.setBounds(500,50,600,40);
   add(add_details);
   
   JLabel religion = new JLabel("Religion : ");
   religion.setFont(new Font("Raleway", Font.BOLD, 18));
   religion.setBounds(400,160,400,30);
   add(religion);
   //input religion
   String valReligion[]={"Islam","Christanity","Hinduism","Jewism", "Sikhism"};
   Ireligion = new JComboBox(valReligion);
   Ireligion.setFont(new Font("Raleway",Font.BOLD, 14));
   Ireligion.setBounds(600,160,400,30);
   Ireligion.setBackground(Color.WHITE);
   add(Ireligion);
   
   JLabel income = new JLabel("Income : ");
   income.setFont(new Font("Raleway", Font.BOLD, 18));
   income.setBounds(400,210,400,30);
   add(income);
   
   String valIncome[]={"null","less then or equal to 50,000","less then or equal to 100,000","less then or equal to 200,000","less then or equal to 500,000","less then or equal to 10,00,000","more then 10,00,000"};
   Iincome = new JComboBox(valIncome);
   Iincome.setFont(new Font("Raleway",Font.BOLD,14));
   Iincome.setBounds(600,210,400,30);
   Iincome.setBackground(Color.WHITE);
   add(Iincome);
   
    JLabel education = new JLabel("Education : ");
   education.setFont(new Font("Raleway", Font.BOLD, 18));
   education.setBounds(400,260,400,30);
   add(education);
   
   String valEdu[]={"non-Graduate","Graduate","Post Graduate","PhD","others"};
   Iedu = new JComboBox(valEdu);
   Iedu.setFont(new Font("Raleway",Font.BOLD,14));
   Iedu.setBounds(600,260,400,30);
   Iedu.setBackground(Color.WHITE);
   add(Iedu);
   
    JLabel occupation = new JLabel("Occupation : ");
   occupation.setFont(new Font("Raleway", Font.BOLD, 18));
   occupation.setBounds(400,310,400,30);
   add(occupation);
   
   String valocc[]={"Salaried","Self-Employed","Businessmen","Student","Retired","others"};
   Ioccupation = new JComboBox(valocc);
   Ioccupation.setFont(new Font("Raleway",Font.BOLD,14));
   Ioccupation.setBounds(600,310,400,30);
   Ioccupation.setBackground(Color.WHITE);
   add(Ioccupation);
   
   JLabel panNum = new JLabel("PAN Number : ");
   panNum.setFont(new Font("Raleway", Font.BOLD, 18));
   panNum.setBounds(400,360,400,30);
   add(panNum);
   
   Ipan = new JTextField();
   Ipan.setFont(new Font("Raleway", Font.BOLD, 18));
   Ipan.setBounds(600,360,400,30);
   add(Ipan);
   
   JLabel cnic = new JLabel("CNIC : ");
   cnic.setFont(new Font("Raleway", Font.BOLD, 18));
   cnic.setBounds(400,410,400,30);
   add(cnic);
   
   Icnic = new JTextField();
   Icnic.setFont(new Font("Raleway", Font.BOLD, 18));
   Icnic.setBounds(600,410,400,30);
   add(Icnic);
   
   JLabel seniorCitizen = new JLabel("Senior Citizen : ");
   seniorCitizen.setFont(new Font("Raleway", Font.BOLD, 18));
   seniorCitizen.setBounds(400,460,400,30);
   add(seniorCitizen);
   //input gender
   syes = new JRadioButton("Yes");
   syes.setFont(new Font("Raleway",Font.BOLD, 14));
   syes.setBounds(600,460,100,30);
   syes.setBackground(Color.WHITE);
   add(syes);
   sno = new JRadioButton("No");
   sno.setFont(new Font("Raleway",Font.BOLD, 14));
   sno.setBackground(Color.WHITE);
   sno.setBounds(750,460,100,30);
   add(sno);
   ButtonGroup scGroup = new ButtonGroup();
   scGroup.add(syes);
   scGroup.add(sno);
   
   JLabel existingAcc = new JLabel("Existing Account : ");
   existingAcc.setFont(new Font("Raleway", Font.BOLD, 18));
   existingAcc.setBounds(400,510,400,30);
   add(existingAcc);
   //input gender
   eyes = new JRadioButton("Yes");
   eyes.setFont(new Font("Raleway",Font.BOLD, 14));
   eyes.setBounds(600,510,100,30);
   eyes.setBackground(Color.WHITE);
   add(eyes);
   eno = new JRadioButton("No");
   eno.setFont(new Font("Raleway",Font.BOLD, 14));
   eno.setBackground(Color.WHITE);
   eno.setBounds(750,510,100,30);
   add(eno);
   
   ButtonGroup eA = new ButtonGroup();
   eA.add(eyes);
   eA.add(eno);
   
    next = new JButton("Next");
   next.setBackground(Color.BLACK);
   next.setForeground(Color.WHITE);
   next.setFont(new Font("Raleway",Font.BOLD, 18));
   next.setBounds(600, 660, 100, 30);
   next.addActionListener(this);
   add(next);
   
   exit = new JButton("Back");
       exit.setBounds(750, 660, 100, 30);
        exit.setFont(new Font("Raleway",Font.BOLD, 18));
       exit.setBackground(Color.RED);
       exit.setForeground(Color.WHITE);
       exit.addActionListener(this);
       add(exit);
   
   
    }
    
     @Override
    public void actionPerformed(ActionEvent ae){
   
        
        String religion =(String) Ireligion.getSelectedItem();
        String income =(String) Iincome.getSelectedItem();
       String education =(String) Iedu.getSelectedItem();
       String occupation =(String) Ioccupation.getSelectedItem();
       String seniorCitizen = null;
       if(syes.isSelected()){
           seniorCitizen = "Yes";
       }
       else if(sno.isSelected()){
           seniorCitizen = "No";
       }
    String existingAccount = null;
       if(eyes.isSelected()){
           existingAccount = "Yes";
       }
       else if(eno.isSelected()){
           existingAccount = "No";
       }
       String pan = Ipan.getText();
       String cnic = Icnic.getText();
    
  try{
      if(ae.getSource()==next){
    if(pan.equals("")){
        JOptionPane.showMessageDialog(null,"PAN Number is Required");
    }
    else if(cnic.equals("")){
        JOptionPane.showMessageDialog(null,"CNIC is Required");
    }
    else{
        Conn c = new Conn();
        String query = "insert into SignUp2 values('"+formno+"','"+religion+"','"+income+"','"+education+"','"+occupation+"','"+seniorCitizen+"','"+existingAccount+"','"+pan+"','"+cnic+"')";
       c.s.executeUpdate(query);
    setVisible(false);
    new SignUp3(formno).setVisible(true);
    }
  }
      else if(ae.getSource()==exit){
          setVisible(false);
        new SignUp(formno).setVisible(true);
      }
  }
  catch(Exception e){
        System.out.print(e);
          }
    
    }
    

    public static void main(String args[]) {
        new SignUp2("");
    }
}
