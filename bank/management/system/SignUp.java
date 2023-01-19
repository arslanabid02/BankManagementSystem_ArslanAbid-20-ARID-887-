package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser; 
import java.awt.event.*;

public class SignUp extends JFrame implements ActionListener{
    
    long fNo;
    JTextField Iname,Ifname,Iemail,Iaddress,Icity,Istate,Ipin;
    JDateChooser Idob;
    JRadioButton male, female,married,unmarried,other;
    JButton next,exit;
   String formno;
    
SignUp(String formno){
            setLayout(null);
formno = this.formno;
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
        
        this.formno = formno;
    getContentPane().setBackground(Color.WHITE);
    setSize(1280,720);  
    setVisible(true);
    setLocation(0,0);
    
    Random ran = new Random();
    fNo = Math.abs(ran.nextLong()%900L)+1000L; // nextLong gives 18 Digit long integer, %9000L divides that long integer into 3 digit integer, as we want 4 digit integer so we write 1000L with it, to always get 4 digit integer, where Math.abs gives us the absolute positive value, if the complier prive negative in any case.
    JLabel Formno = new JLabel("Application Form no "+fNo );
    Formno.setFont(new Font("Raleway" , Font.BOLD ,38 ));
    Formno.setBounds(400,40,800,40);
    add(Formno);
    
   JLabel pageNo = new JLabel("form page 1 : Personal Details");
   pageNo.setFont(new Font("Raleway", Font.BOLD, 28));
   pageNo.setBounds(600,100,600,40);
   add(pageNo);
   
   
   JLabel name = new JLabel("Name : ");
   name.setFont(new Font("Raleway", Font.BOLD, 18));
   name.setBounds(400,160,400,30);
   add(name);
   //input name
   Iname = new JTextField();
   Iname.setFont(new Font("Raleway",Font.BOLD, 14));
   Iname.setBounds(600,160,400,30);
   add(Iname);
   
     JLabel fname = new JLabel("Fathers Name : ");
   fname.setFont(new Font("Raleway", Font.BOLD, 18));
   fname.setBounds(400,210,400,30);
   add(fname);
    //input father name
   Ifname = new JTextField();
   Ifname.setFont(new Font("Raleway",Font.BOLD, 14));
   Ifname.setBounds(600,210,400,30);
   add(Ifname);
   
     JLabel email = new JLabel("Email : ");
   email.setFont(new Font("Raleway", Font.BOLD, 18));
   email.setBounds(400,260,400,30);
   add(email);
    //input email
   Iemail = new JTextField();
   Iemail.setFont(new Font("Raleway",Font.BOLD, 14));
   Iemail.setBounds(600,260,400,30);
   add(Iemail);
   
     JLabel dob = new JLabel("Date of Birth : ");
   dob.setFont(new Font("Raleway", Font.BOLD, 18));
   dob.setBounds(400,310,400,30);
   add(dob);
   //input dob
   Idob = new JDateChooser();
   Idob.setFont(new Font("Raleway",Font.BOLD, 14));
   Idob.setBounds(600,310,400,30);
   add(Idob);
   
     JLabel gender = new JLabel("Gender : ");
   gender.setFont(new Font("Raleway", Font.BOLD, 18));
   gender.setBounds(400,360,400,30);
   add(gender);
   //input gender
   male = new JRadioButton("Male");
   male.setFont(new Font("Raleway",Font.BOLD, 14));
   male.setBounds(600,360,100,30);
   male.setBackground(Color.WHITE);
   add(male);
   female = new JRadioButton("Female");
   female.setFont(new Font("Raleway",Font.BOLD, 14));
   female.setBackground(Color.WHITE);

   female.setBounds(750,360,100,30);
   add(female);
   ButtonGroup genderGroup = new ButtonGroup();
   genderGroup.add(male);
   genderGroup.add(female);
   
     JLabel martial = new JLabel("Martial Status : ");
   martial.setFont(new Font("Raleway", Font.BOLD, 18));
   martial.setBounds(400,410,400,30);
   add(martial);
   //input martial staus
   married = new JRadioButton("Married");
   married.setFont(new Font("Raleway",Font.BOLD, 14));
   married.setBounds(600,410,100,30);
   married.setBackground(Color.WHITE);
   add(married);
   unmarried = new JRadioButton("Unmarried");
   unmarried.setFont(new Font("Raleway",Font.BOLD, 14));
   unmarried.setBackground(Color.WHITE);
   unmarried.setBounds(750,410,100,30);
   add(unmarried);
   other = new JRadioButton("Other");
   other.setFont(new Font("Raleway",Font.BOLD, 14));
   other.setBackground(Color.WHITE);
   other.setBounds(900,410,100,30);
   add(other);
   ButtonGroup martialGroup = new ButtonGroup();
   martialGroup.add(married);
   martialGroup.add(unmarried);
   martialGroup.add(other);

   
     JLabel address = new JLabel("Address : ");
   address.setFont(new Font("Raleway", Font.BOLD, 18));
   address.setBounds(400,460,400,30);
   add(address);
   //input address
   Iaddress = new JTextField();
   Iaddress.setFont(new Font("Raleway",Font.BOLD, 14));
   Iaddress.setBounds(600,460,400,30);
   add(Iaddress);
   
   
        JLabel city = new JLabel("City : ");
   city.setFont(new Font("Raleway", Font.BOLD, 18));
   city.setBounds(400,510,400,30);
   add(city);
    //input city
   Icity = new JTextField();
   Icity.setFont(new Font("Raleway",Font.BOLD, 14));
   Icity.setBounds(600,510,400,30);
   add(Icity);
   
        JLabel state = new JLabel("State : ");
   state.setFont(new Font("Raleway", Font.BOLD, 18));
   state.setBounds(400,560,400,30);
   add(state);
    //input state
   Istate = new JTextField();
   Istate.setFont(new Font("Raleway",Font.BOLD, 14));
   Istate.setBounds(600,560,400,30);
   add(Istate);
   
   JLabel pin = new JLabel("pin : ");
   pin.setFont(new Font("Raleway", Font.BOLD, 18));
   pin.setBounds(400,610,400,30);
   add(pin);
   //input pin
   Ipin = new JTextField();
   Ipin.setFont(new Font("Raleway",Font.BOLD, 14));
   Ipin.setBounds(600,610,400,30);
   add(Ipin);
   
   next = new JButton("Next");
   next.setBackground(Color.BLACK);
   next.setForeground(Color.WHITE);
   next.setFont(new Font("Raleway",Font.BOLD, 18));
   next.setBounds(600, 660, 100, 30);
   next.addActionListener(this);
   add(next);
   
      exit = new JButton("Exit");
       exit.setBounds(750, 660, 100, 30);
        exit.setFont(new Font("Raleway",Font.BOLD, 18));
       exit.setBackground(Color.RED);
       exit.setForeground(Color.WHITE);
       exit.addActionListener(this);
       add(exit);
    }

  

 
    @Override
    public void actionPerformed(ActionEvent ae){
        String formno = "" + fNo;//long
        String name = Iname.getText();
        String fatherName = Ifname.getText();
        String email = Iemail.getText();
        String dob = ((JTextField) Idob.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "male";
        }
        else if(female.isSelected()){
            gender = "female";
        }
        String martial = null;
        if(married.isSelected()){
            martial = "married";
        }
        else if(unmarried.isSelected()){
            martial = "unmarried";
        }
        else if(other.isSelected()){
            martial = "other";
        }
        String address = Iaddress.getText();
        String city = Icity.getText();
        String state = Istate.getText();
        String pin = Ipin.getText();
    

    try{
        if(ae.getSource()==next){
            
        
                if(name.equals("")){
        JOptionPane.showMessageDialog(null,"Name is Required");
    }
    else if(fatherName.equals("")){
        JOptionPane.showMessageDialog(null,"Father Name is Required");
    }
    else if(email.equals("")){
        JOptionPane.showMessageDialog(null,"Email is Required");
    }
    else if(dob.equals("")){
        JOptionPane.showMessageDialog(null,"Date of Birth is Required");
    }
    else if(address.equals("")){
        JOptionPane.showMessageDialog(null,"address is Required");
    }
    else if(city.equals("")){
        JOptionPane.showMessageDialog(null,"city is Required");
    }
        else if(state.equals("")){
        JOptionPane.showMessageDialog(null,"state is Required");
    }
       else if(pin.equals("")){
        JOptionPane.showMessageDialog(null,"pin is Required");
    }
       else{
           Conn c = new Conn();
           String query = "insert into signup values('"+formno+"','"+name+"','"+fatherName+"','"+email+"','"+dob+"','"+gender+"','"+martial+"','"+address+"','"+city+"','"+state+"','"+pin+"')";
           c.s.executeUpdate(query);
           setVisible(false);
           new SignUp2(formno).setVisible(true);
       }
               }
        else if(ae.getSource()==exit){
            System.exit(0);
        }
}catch(Exception e){
    System.out.println(e);
}
    }
    public static void main(String args[]) {
       new SignUp ("");
    }
    
    

}
