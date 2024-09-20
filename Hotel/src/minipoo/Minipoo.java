
package minipoo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Minipoo
{
    public static void main(String[] argv)
    {
        new fnt("o","p");
//        new reg();
    }
}

class fnt
{
    JFrame f;    JTextField f1;
    JLabel t1,t2,t3,u1,u2,w1,shw;
    JPasswordField f2;    JButton l1,r1;
    fnt(String user,String pass)
    {
        f = new JFrame();
        f.setTitle("Login page");
        f.setSize(400,600);
        f.getContentPane().setBackground(Color.YELLOW);
        
        t1 = new JLabel(" D E K S H ");
        t1.setFont(new Font("Coalition",Font.BOLD ,35));
        t1.setForeground(Color.BLACK);//Bahnschrift Digital tech  Forte
        t1.setBounds(50, 60, 300, 35);
        
        shw = new JLabel("The One place to find the STAR");
        shw.setFont(new Font("Bahnschrift",Font.BOLD ,15));
        shw.setForeground(Color.BLACK);
        shw.setBounds(75, 90, 300, 22);
        
        u1 = new JLabel("Username : ");
        u1.setFont(new Font("Bahnschrift",Font.BOLD ,22));
        u1.setForeground(Color.BLACK);
        u1.setBounds(30, 200, 150, 22);
        
        f1 = new JTextField();
        f1.setFont(new Font("Bahnschrift",Font.PLAIN ,20));
        f1.setBackground(Color.BLACK);
        f1.setForeground(Color.WHITE);
        f1.setBounds(180, 199, 170, 25);
        
        u2 = new JLabel("Password : ");
        u2.setFont(new Font("Bahnschrift",Font.BOLD ,20));
        u2.setForeground(Color.BLACK);
        u2.setBounds(30, 250, 150, 20);
        
        f2 = new JPasswordField();
        f2.setFont(new Font("Bahnschrift",Font.PLAIN ,20));
        f2.setBackground(Color.BLACK);
        f2.setForeground(Color.WHITE);
        f2.setBounds(180, 249, 170, 25);
        
        l1 = new JButton("Login Now");
        l1.setBackground(Color.BLACK);
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Bahnschrift",Font.BOLD ,20));
        l1.setBounds(50, 300, 250, 35);
        l1.addActionListener(new ActionListener()
                {
                    @Override
                    public void actionPerformed(ActionEvent e)
                    {      
                            String p1 = f1.getText();
                            String p2 = f2.getText();
                            if(f2.getText().equals(pass) && f1.getText().equals(user))
                            {
                                System.out.print(p1+p2);
                                w1.setVisible(false);
                                new soth();
                                f.setVisible(false);
                            }
                            else
                                w1.setVisible(true);
                    }
                });        
        w1 = new JLabel("Either the Password or Username is Incorrect");
        w1.setFont(new Font("Bahnschrift",Font.BOLD ,10));
        w1.setForeground(Color.RED);//Bahnschrift Digital tech  Forte
        w1.setBounds(60, 335, 300, 20);
        w1.setVisible(false);
        
        t3 = new JLabel("Don't have a Accout? Create your Accout");
        t3.setFont(new Font("Bahnschrift",Font.BOLD ,15));
        t3.setForeground(Color.BLACK);//Bahnschrift Digital tech  Forte
        t3.setBounds(30, 375, 300, 20);
        
        r1 = new JButton("Register Now");
        r1.setBackground(Color.BLACK);
        r1.setForeground(Color.WHITE);
        r1.setFont(new Font("Bahnschrift",Font.BOLD ,20));
        r1.setBounds(50, 400, 250, 35);
        r1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                new reg();
                f.setVisible(false);
            }
        });              
        f.setVisible(true);
        f.setLayout(null);
        f.add(t1);        f.add(u1);        f.add(u2);
        f.add(r1);        f.add(l1);        f.add(t3);
        f.add(w1);        f.add(f2);        f.add(f1);
        f.add(shw);        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
}

class reg
{
    JFrame f;    JPanel p1;    int varify = 28496;
    JLabel l1,u1,u2,u3,u4,u5,u6;
    JLabel w1,w2,i1;    JButton b1,b2,b3;
    JTextField f1,f2,f3,f6;
    JPasswordField f4,f5;
    String user="",pass="";
    reg()
    {
        f = new JFrame();
        f.setTitle("Register page");
        f.setSize(400,600);
        f.getContentPane().setBackground(Color.YELLOW);
        
        p1 = new JPanel();
        p1.setBackground(Color.BLACK);        
        p1.setBounds(50, 20, 300, 40);
        
        l1 = new JLabel("REGISTRATION");
        l1.setFont(new Font("Bahnschrift",Font.BOLD ,30));
        l1.setForeground(Color.WHITE);
        l1.setBounds(0, 0, 150, 30);
        
        p1.add(l1);
        
        u1 = new JLabel("Firstname : ");
        u1.setFont(new Font("Bahnschrift",Font.BOLD ,22));
        u1.setForeground(Color.BLACK);
        u1.setBounds(30, 95, 150, 22);
        
        f1 = new JTextField();
        f1.setFont(new Font("Bahnschrift",Font.PLAIN ,18));
        f1.setBackground(Color.BLACK);
        f1.setForeground(Color.WHITE);
        f1.setBounds(180, 94, 170, 25);
        
        u2 = new JLabel("Lastname : ");
        u2.setFont(new Font("Bahnschrift",Font.BOLD ,22));
        u2.setForeground(Color.BLACK);
        u2.setBounds(30, 145, 150, 22);
        
        f2 = new JTextField();
        f2.setFont(new Font("Bahnschrift",Font.PLAIN ,18));
        f2.setBackground(Color.BLACK);
        f2.setForeground(Color.WHITE);
        f2.setBounds(180, 144, 170, 25);
        
        u3 = new JLabel("E-Mail : ");
        u3.setFont(new Font("Bahnschrift",Font.BOLD ,22));
        u3.setForeground(Color.BLACK);
        u3.setBounds(30, 195, 150, 22);
        
        f3 = new JTextField();
        f3.setFont(new Font("Bahnschrift",Font.PLAIN ,18));
        f3.setBackground(Color.BLACK);
        f3.setForeground(Color.WHITE);
        f3.setBounds(180, 194, 170, 25);
        
        u4 = new JLabel("Password : ");
        u4.setFont(new Font("Bahnschrift",Font.BOLD ,22));
        u4.setForeground(Color.BLACK);
        u4.setBounds(30, 245, 150, 22);
        
        f4 = new JPasswordField();
        f4.setFont(new Font("Bahnschrift",Font.PLAIN ,18));
        f4.setBackground(Color.BLACK);
        f4.setForeground(Color.WHITE);
        f4.setBounds(180, 244, 170, 25);
        
        u5 = new JLabel("Re-Enter Password : ");
        u5.setFont(new Font("Bahnschrift",Font.BOLD ,16));
        u5.setForeground(Color.BLACK);
        u5.setBounds(15, 295, 170, 22);
        
        f5 = new JPasswordField();
        f5.setFont(new Font("Bahnschrift",Font.PLAIN ,18));
        f5.setBackground(Color.BLACK);
        f5.setForeground(Color.WHITE);
        f5.setBounds(180, 294, 170, 25);
        
        b1 = new JButton("Register");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Bahnschrift",Font.BOLD ,20));
        b1.setBounds(50, 345, 250, 35);
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try
                {                    
                    if(f4.getText().equals(f5.getText()))
                    {
                        user = f1.getText()+"_"+f2.getText();
                        pass = f4.getText();
                        JOptionPane.showMessageDialog(f, "Generated Username = "+user+"\nAnd the Verification code = "+varify,"Now you can Move on!", JOptionPane.INFORMATION_MESSAGE);
                        b2.setEnabled(true);
                        b1.setEnabled(false);
                    }
                    else
                        JOptionPane.showMessageDialog(f, "Hey! Fill provided spaces Properly","We are facing Trouble", JOptionPane.WARNING_MESSAGE);
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(f, "Hey! Fill provided spaces Properly","We are facing Trouble", JOptionPane.WARNING_MESSAGE);
                }
            }
        });        
        u6 = new JLabel("Verification Code : ");
        u6.setFont(new Font("Bahnschrift",Font.BOLD ,18));
        u6.setForeground(Color.BLACK);
        u6.setBounds(15, 410, 170, 22);
        
        f6 = new JTextField();
        f6.setFont(new Font("Bahnschrift",Font.PLAIN ,18));
        f6.setBackground(Color.BLACK);
        f6.setForeground(Color.WHITE);
        f6.setBounds(180, 409, 170, 25);
        
        b2 = new JButton("Verify");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("Bahnschrift",Font.BOLD ,20));
        b2.setBounds(50, 460, 250, 35);
        b2.setEnabled(false);
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try
                {
                    if(Integer.parseInt(f6.getText()) == varify)
                    {
                        b3.setEnabled(true);
                        b2.setEnabled(false);         
                        JOptionPane.showMessageDialog(f, "You have been verified!","Just move on", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(f, "Please! Enter the provided Verification code","Cant't Proceed", JOptionPane.ERROR_MESSAGE);
                }
            }
        });        
        b3 = new JButton("Login now");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setFont(new Font("Bahnschrift",Font.BOLD ,20));
        b3.setBounds(50, 510, 250, 35);
        b3.setEnabled(false);
        b3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
//                new fnt(user,pass);
                new fnt(user,pass);
                f.setVisible(false);
            }
        });        
        f.setVisible(true);
        f.setLayout(null);
        f.add(u1);        f.add(f1);        f.add(u2);
        f.add(f2);        f.add(u3);        f.add(f3);
        f.add(u4);        f.add(f4);        f.add(u6);
        f.add(f6);        f.add(u5);        f.add(b2);
        f.add(b3);        f.add(b1);        f.add(f5);
        f.add(p1);        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
}