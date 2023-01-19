package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import com.toedter.calendar.JDateChooser; 
import java.awt.event.*;

public class SignUp_2 extends JFrame implements ActionListener{
    
    long fNo;
    JTextField Ireligion,Icategory,Iincome,Iaddress,Icity,Istate,Ipin,Iname,Ifname,Iemail;
    JDateChooser Idob;
    JRadioButton male, female,married,unmarried,other;
    JButton next;
    
    SignUp_2(){
    getContentPane().setBackground(Color.WHITE);
    setSize(1280,720);  
    setVisible(true);
    setLocation(100,100);

    setTitle("NEW ACCOUNT APPLICATION FORM PAGE-2");
    
   JLabel add_details = new JLabel("form page 2 : Additional Details");
   add_details.setFont(new Font("Raleway", Font.BOLD, 28));
   add_details.setBounds(600,100,600,40);
   add(add_details);
   
   
   JLabel religion = new JLabel("Religion : ");
   religion.setFont(new Font("Raleway", Font.BOLD, 18));
   religion.setBounds(400,160,400,30);
   add(religion);
   //input name
   String valReligion[]={"Islam","Christianity","Hinduism","Jewish"};
   JComboBox Ireligion = new JComboBox(valReligion);
   Ireligion.setFont(new Font("Raleway",Font.BOLD, 14));
   Ireligion.setBounds(600,160,400,30);
   add(Ireligion);
  
   
     JLabel category = new JLabel("Category : ");
   category.setFont(new Font("Raleway", Font.BOLD, 18));
   category.setBounds(400,210,400,30);
   add(category);
    //input father name
   Icategory = new JTextField();
   Icategory.setFont(new Font("Raleway",Font.BOLD, 14));
   Icategory.setBounds(600,210,400,30);
   add(Icategory);
   
     JLabel income = new JLabel("Income : ");
   income.setFont(new Font("Raleway", Font.BOLD, 18));
   income.setBounds(400,260,400,30);
   add(income);
    //input email
   Iincome = new JTextField();
   Iincome.setFont(new Font("Raleway",Font.BOLD, 14));
   Iincome.setBounds(600,260,400,30);
   add(Iincome);
   
     JLabel education = new JLabel("Education: ");
   education.setFont(new Font("Raleway", Font.BOLD, 18));
   education.setBounds(400,310,400,30);
   add(education);
   //input dob
   Idob = new JDateChooser();
   Idob.setFont(new Font("Raleway",Font.BOLD, 14));
   Idob.setBounds(600,310,400,30);
   add(Idob);
   
     JLabel qualification = new JLabel("Qualification ");
   qualification.setFont(new Font("Raleway", Font.BOLD, 18));
   qualification.setBounds(400,360,400,30);
   add(qualification);
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
   
     JLabel occupation = new JLabel("Occupation : ");
   occupation.setFont(new Font("Raleway", Font.BOLD, 18));
   occupation.setBounds(400,410,400,30);
   add(occupation);
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

   
     JLabel panNo = new JLabel("PAN Number : ");
   panNo.setFont(new Font("Raleway", Font.BOLD, 18));
   panNo.setBounds(400,460,400,30);
   add(panNo);
   //input address
   Iaddress = new JTextField();
   Iaddress.setFont(new Font("Raleway",Font.BOLD, 14));
   Iaddress.setBounds(600,460,400,30);
   add(Iaddress);
   
   
        JLabel cnic = new JLabel("CNIC : ");
   cnic.setFont(new Font("Raleway", Font.BOLD, 18));
   cnic.setBounds(400,510,400,30);
   add(cnic);
    //input city
   Icity = new JTextField();
   Icity.setFont(new Font("Raleway",Font.BOLD, 14));
   Icity.setBounds(600,510,400,30);
   add(Icity);
   
        JLabel seniorCitizen = new JLabel("Senior Citizen : ");
   seniorCitizen.setFont(new Font("Raleway", Font.BOLD, 18));
   seniorCitizen.setBounds(400,560,400,30);
   add(seniorCitizen);
    //input state
   Istate = new JTextField();
   Istate.setFont(new Font("Raleway",Font.BOLD, 14));
   Istate.setBounds(600,560,400,30);
   add(Istate);
   
   JLabel existingAcc = new JLabel("Existing Acctont : ");
   existingAcc.setFont(new Font("Raleway", Font.BOLD, 18));
   existingAcc.setBounds(400,610,400,30);
   add(existingAcc);
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
       }
}catch(Exception e){
    System.out.println(e);
}
    }
    public static void main(String args[]) {
       new SignUp_2 ();
    }

}

