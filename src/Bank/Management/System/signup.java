package Bank.Management.System;


import com.toedter.calendar.JDateChooser;

import javax.print.attribute.standard.JobMessageFromOperator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signup extends JFrame implements ActionListener {
    JRadioButton r1,r2,m1,m2,m3;
    JButton next;
    JTextField textName,textfName,textEmail,textms,textadd,textcity,textpin,textst;
    JDateChooser datechooser;
    Random ran=new Random();
    long first4 =(ran.nextLong()%9000L)+1000l;
    String first=" " + Math.abs(first4);
    signup(){

        super("APPLICATION FORM");

        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image =new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);


        JLabel label1=new JLabel("APPLICATION FORM NO."+first);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        label1.setBounds(160,20,600,40);
        add(label1);

        JLabel label2=new JLabel("Page 1");
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3=new JLabel("Personal details");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(290,90,600,30);
        add(label3);

        JLabel labelName = new JLabel("Name:");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textName=new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);

        JLabel labelfName=new JLabel("Father Name:");
        labelfName.setFont(new Font("Raleway",Font.BOLD,20));
        labelfName.setBounds(100,240,200,30);
        add(labelfName);

        textfName =new JTextField();
        textfName.setFont(new Font("Raleway",Font.BOLD,14));
        textfName.setBounds(300,240,400,30);
        add(textfName);

        JLabel DOB=new JLabel("Date of Birth:");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(100,300,200,30);
        add(DOB);

        datechooser =new JDateChooser();
        datechooser.setForeground(new Color(105,105,105));
        datechooser.setBounds(300,300,400,30);
        add(datechooser);

        JLabel labelg=new JLabel("Gender:");
        labelg.setFont(new Font("Raleway",Font.BOLD,20));
        labelg.setBounds(100,360,200,30);
        add(labelg);

        r1=new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBounds(300,360,90,30);
        add(r1);

        r2=new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBounds(450,360,90,30);
        add(r2);

        ButtonGroup buttongroup=new ButtonGroup();
        buttongroup.add(r1);
        buttongroup.add(r2);

        JLabel labelemail=new JLabel("Email Address:");
        labelemail.setFont(new Font("Raleway",Font.BOLD,20));
        labelemail.setBounds(100,400,200,30);
        add(labelemail);

        textEmail =new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(300,400,400,30);
        add(textEmail);

        JLabel labelms=new JLabel("Marital Status:");
        labelms.setFont(new Font("Raleway",Font.BOLD,20));
        labelms.setBounds(100,440,200,30);
        add(labelms);

        m1=new JRadioButton("Married");
        m1.setBounds(300,440,100,30);
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        add(m1);

        m2=new JRadioButton("UnMarried");
        m2.setBounds(420,440,100,30);
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        add(m2);

        m3=new JRadioButton("Other");
        m3.setBounds(540,440,100,30);
        m3.setFont(new Font("Raleway",Font.BOLD,14));
        add(m3);

        ButtonGroup buttonGroup1=new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);

        JLabel labeladd=new JLabel("Address:");
        labeladd.setFont(new Font("Raleway",Font.BOLD,20));
        labeladd.setBounds(100,480,200,30);
        add(labeladd);

        textadd =new JTextField();
        textadd.setFont(new Font("Raleway",Font.BOLD,14));
        textadd.setBounds(300,480,400,30);
        add(textadd);

        JLabel labelcity=new JLabel("City:");
        labelcity.setFont(new Font("Raleway",Font.BOLD,20));
        labelcity.setBounds(100,520,200,30);
        add(labelcity);

        textcity =new JTextField();
        textcity.setFont(new Font("Raleway",Font.BOLD,14));
        textcity.setBounds(300,520,400,30);
        add(textcity);

        JLabel labelpin=new JLabel("Pin Code:");
        labelpin.setFont(new Font("Raleway",Font.BOLD,20));
        labelpin.setBounds(100,560,200,30);
        add(labelpin);

        textpin =new JTextField();
        textpin.setFont(new Font("Raleway",Font.BOLD,14));
        textpin.setBounds(300,560,400,30);
        add(textpin);

        JLabel labelstate=new JLabel("State:");
        labelstate.setFont(new Font("Raleway",Font.BOLD,20));
        labelstate.setBounds(100,600,200,30);
        add(labelstate);

        textst =new JTextField();
        textst.setFont(new Font("Raleway",Font.BOLD,14));
        textst.setBounds(300,600,400,30);
        add(textst);

        next=new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(450,640,80,30);
        next.addActionListener(this);
        add(next);












        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno=first;
        String name=textfName.getText();
        String fname=textfName.getText();
        String dob=((JTextField)datechooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(r1.isSelected()){
            gender="Male";
        }else if(r2.isSelected()){
            gender="Female";
        }
        String email=textEmail.getText();
        String marital=null;
        if(m1.isSelected()){
            marital="Married";
        }else if(m2.isSelected()){
            marital="Unmarried";
        }else if(m3.isSelected()){
            marital="Other";
        }
        String address=textadd.getText();
        String city=textcity.getText();
        String pincode=textpin.getText();
        String state=textst.getText();

        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else{
                Con con1=new Con();
                String q="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new signup2(formno);
                setVisible(false);
            }

        }catch(Exception E){
            E.printStackTrace();


        }
    }

    public static void main(String[] args) {
        new signup();

    }







}
