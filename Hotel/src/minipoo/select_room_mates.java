
package minipoo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.*;

class mnc
{
    public static void main(String[] argv)
    {
//        new mate(1,3,2,"dkbp_mate","dkbp_room");
//        new room(1,2,"tom_room");
    }
}

class mate
{
    JFrame f;    JPanel p1;
    JLabel l1,l2,u1,u2,u3,u4,u5,u6;
    JTextField f1,f2,f3,f4,f6;
    JComboBox f5;    JButton b1,b2;
    mate(int i,int m,int r,String mtable,String rtable)
    {
        getsall g = new getsall();
        g.mates_rate();
        
        f = new JFrame();
        f.setTitle("Companions page");
        f.setSize(400,600);
        f.getContentPane().setBackground(Color.YELLOW);       
        
        p1 = new JPanel();
        p1.setBackground(Color.BLACK);        
        p1.setBounds(20, 20, 360, 40);
        
        l1 = new JLabel("ROOM MATE DETAILS");
        l1.setFont(new Font("Bahnschrift",Font.BOLD ,30));
        l1.setForeground(Color.WHITE);
        l1.setBounds(0, 0, 150, 30);
        
        p1.add(l1);
        
        l2 = new JLabel("Companion "+(i));
        l2.setFont(new Font("Bahnschrift",Font.BOLD ,22));
        l2.setForeground(Color.BLACK);
        l2.setBounds(30, 90, 200, 22);
        
        u1 = new JLabel("Name : ");
        u1.setFont(new Font("Bahnschrift",Font.BOLD ,22));
        u1.setForeground(Color.BLACK);
        u1.setBounds(30, 145, 150, 22);
        
        f1 = new JTextField();
        f1.setFont(new Font("Bahnschrift",Font.PLAIN ,18));
        f1.setBackground(Color.BLACK);
        f1.setForeground(Color.WHITE);
        f1.setBounds(180, 144, 170, 25);
        
        u2 = new JLabel("Mobile Number : ");
        u2.setFont(new Font("Bahnschrift",Font.BOLD ,18));
        u2.setForeground(Color.BLACK);
        u2.setBounds(30, 195, 150, 22);
        
        f2 = new JTextField();
        f2.setFont(new Font("Bahnschrift",Font.PLAIN ,18));
        f2.setBackground(Color.BLACK);
        f2.setForeground(Color.WHITE);
        f2.setBounds(180, 194, 170, 25);
        
        u3 = new JLabel("E-Mail : ");
        u3.setFont(new Font("Bahnschrift",Font.BOLD ,22));
        u3.setForeground(Color.BLACK);
        u3.setBounds(30, 245, 150, 22);
        
        f3 = new JTextField();
        f3.setFont(new Font("Bahnschrift",Font.PLAIN ,18));
        f3.setBackground(Color.BLACK);
        f3.setForeground(Color.WHITE);
        f3.setBounds(180, 244, 170, 25);
        
        u4 = new JLabel("Address : ");
        u4.setFont(new Font("Bahnschrift",Font.BOLD ,22));
        u4.setForeground(Color.BLACK);
        u4.setBounds(30, 295, 150, 22);
        
        f4 = new JTextField();
        f4.setFont(new Font("Bahnschrift",Font.PLAIN ,18));
        f4.setBackground(Color.BLACK);
        f4.setForeground(Color.WHITE);
        f4.setBounds(180, 294, 170, 25);

        u5 = new JLabel("Gender : ");
        u5.setFont(new Font("Bahnschrift",Font.BOLD ,22));
        u5.setForeground(Color.BLACK);
        u5.setBounds(30, 345, 150, 22);
                
        String cg[] = {"Male","Female","Trans-Gender","No Mentions"};
        f5 = new JComboBox(cg);
        f5.setFont(new Font("Bahnschrift",Font.PLAIN ,18));
        f5.setBackground(Color.BLACK);
        f5.setForeground(Color.WHITE);
        f5.setBounds(180, 344, 170, 25);
        
        u6 = new JLabel("Age : ");
        u6.setFont(new Font("Bahnschrift",Font.BOLD ,22));
        u6.setForeground(Color.BLACK);
        u6.setBounds(30, 395, 150, 22);
        
        f6 = new JTextField();
        f6.setFont(new Font("Bahnschrift",Font.PLAIN ,18));
        f6.setBackground(Color.BLACK);
        f6.setForeground(Color.WHITE);
        f6.setBounds(180, 394, 170, 25);
        
        b1 = new JButton("Occupy");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Bahnschrift",Font.BOLD ,20));
        b1.setBounds(60, 445, 250, 35);
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try
                {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jbeans", "root", "Passing@5q1");
                    Statement sql = c.createStatement();
                    String inst = "INSERT INTO "+mtable+" (Member,Name,Phone,Email,Address,Gender,Age,Role) VALUES ('"+(i+1)+"','"+f1.getText()+"','"+Integer.parseInt(f2.getText())+"','"+f3.getText()+"','"+f4.getText()+"','"+f5.getSelectedItem()+"','"+Integer.parseInt(f6.getText())+"','Member')";
                    sql.executeUpdate(inst);
                    System.out.print("\tdone");
                    if(i==m)
                    {
                        b1.setEnabled(false);
                        b2.setEnabled(true);
                    }
                    else if(i<m)
                    {                        
                        new mate(i+1,m,r,mtable,rtable);
                        f.setVisible(false);
                    }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(f, "Hey! Fill provided spaces Properly","We are facing Trouble", JOptionPane.WARNING_MESSAGE);
                    System.out.print(e);
                }
            }
        });     
        
        b2 = new JButton("To Room Details");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("Bahnschrift",Font.BOLD ,20));
        b2.setBounds(60, 495, 250, 35);
        b2.setVisible(false);
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try
                {
                    {
                        new room(1,r,rtable);
                        f.setVisible(false);
                    }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(f, "Hey! Fill provided spaces Properly","We are facing Trouble", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        
        if(i==m)
        {
            b2.setVisible(true);
            b2.setEnabled(false);
        }
        
        f.setVisible(true);
        f.setLayout(null);
        f.add(p1);        f.add(l2);        f.add(u1);
        f.add(f1);        f.add(u2);        f.add(f2);
        f.add(u3);        f.add(f3);        f.add(u4);
        f.add(f4);        f.add(u5);        f.add(f5);
        f.add(u6);        f.add(f6);        f.add(b1);
        f.add(b2);        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
}

class room
{
    JFrame f;    JPanel p1;
    JLabel l1,l2,u1,u2,u3,u4,u5,u6;
    JButton b1,b2;
    JComboBox f1,f2,f3,f4,f5,f6;
    room(int i,int r,String rtable)
    {
        getsall g = new getsall();
        g.rooms_rate();
        
        f = new JFrame();
        f.setTitle("Room modification page");
        f.setSize(400,600);
        f.getContentPane().setBackground(Color.YELLOW);
        
        p1 = new JPanel();
        p1.setBackground(Color.BLACK);        
        p1.setBounds(20, 20, 360, 40);
        
        l1 = new JLabel("ROOM MODIFICATION");
        l1.setFont(new Font("Bahnschrift",Font.BOLD ,30));
        l1.setForeground(Color.WHITE);
        l1.setBounds(0, 0, 150, 30);
        
        p1.add(l1);
        
        l2 = new JLabel("Room "+i);
        l2.setFont(new Font("Bahnschrift",Font.BOLD ,22));
        l2.setForeground(Color.BLACK);
        l2.setBounds(30, 90, 200, 22);
        
        String cmn[] = {"Yes","No"};
        
        u1 = new JLabel("Tele-Vision : ");
        u1.setFont(new Font("Bahnschrift",Font.BOLD ,18));
        u1.setForeground(Color.BLACK);
        u1.setBounds(30, 145, 150, 22);
                
        f1 = new JComboBox(cmn);
        f1.setFont(new Font("Bahnschrift",Font.PLAIN ,18));
        f1.setBackground(Color.BLACK);
        f1.setForeground(Color.WHITE);
        f1.setBounds(180, 144, 170, 25);
        
        u2 = new JLabel("Food Services : ");
        u2.setFont(new Font("Bahnschrift",Font.BOLD ,18));
        u2.setForeground(Color.BLACK);
        u2.setBounds(30, 195, 150, 22);
                
        f2 = new JComboBox(cmn);
        f2.setFont(new Font("Bahnschrift",Font.PLAIN ,18));
        f2.setBackground(Color.BLACK);
        f2.setForeground(Color.WHITE);
        f2.setBounds(180, 194, 170, 25);
        
        u3 = new JLabel("Musical Tools : ");
        u3.setFont(new Font("Bahnschrift",Font.BOLD ,18));
        u3.setForeground(Color.BLACK);
        u3.setBounds(30, 245, 150, 22);
                
        f3 = new JComboBox(cmn);
        f3.setFont(new Font("Bahnschrift",Font.PLAIN ,18));
        f3.setBackground(Color.BLACK);
        f3.setForeground(Color.WHITE);
        f3.setBounds(180, 244, 170, 25);
        
        u4 = new JLabel("Video Games : ");
        u4.setFont(new Font("Bahnschrift",Font.BOLD ,18));
        u4.setForeground(Color.BLACK);
        u4.setBounds(30, 295, 150, 22);
                
        f4 = new JComboBox(cmn);
        f4.setFont(new Font("Bahnschrift",Font.PLAIN ,18));
        f4.setBackground(Color.BLACK);
        f4.setForeground(Color.WHITE);
        f4.setBounds(180, 294, 170, 25);
        
        u5 = new JLabel("E-Gadgets : ");
        u5.setFont(new Font("Bahnschrift",Font.BOLD ,18));
        u5.setForeground(Color.BLACK);
        u5.setBounds(30, 345, 150, 22);
                
        f5 = new JComboBox(cmn);
        f5.setFont(new Font("Bahnschrift",Font.PLAIN ,18));
        f5.setBackground(Color.BLACK);
        f5.setForeground(Color.WHITE);
        f5.setBounds(180, 344, 170, 25);
        
        u6 = new JLabel("Library Access : ");
        u6.setFont(new Font("Bahnschrift",Font.BOLD ,18));
        u6.setForeground(Color.BLACK);
        u6.setBounds(30, 395, 150, 22);
                
        f6 = new JComboBox(cmn);
        f6.setFont(new Font("Bahnschrift",Font.PLAIN ,18));
        f6.setBackground(Color.BLACK);
        f6.setForeground(Color.WHITE);
        f6.setBounds(180, 394, 170, 25);
        
        b1 = new JButton("Modify");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Bahnschrift",Font.BOLD ,20));
        b1.setBounds(60, 445, 250, 35);
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try
                {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jbeans", "root", "Passing@5q1");
                    Statement sql = c.createStatement();
                    String inst = "INSERT INTO "+rtable+" (Room,TV,Music,VGames,Library,Food,Gadgets) VALUES ('"+i+"','"+f1.getSelectedItem()+"','"+f2.getSelectedItem()+"','"+f3.getSelectedItem()+"','"+f4.getSelectedItem()+"','"+f5.getSelectedItem()+"','"+f6.getSelectedItem()+"')";
                    sql.executeUpdate(inst);
                    System.out.print("\tdone");
                    if(f1.getSelectedItem().equals("Yes"))
                    {
                        g.mod_rate();
                    }
                    if(f2.getSelectedItem().equals("Yes"))
                    {
                        g.food_rate();
                    }
                    if(f3.getSelectedItem().equals("Yes"))
                    {
                        g.mod_rate();
                    }
                    if(f4.getSelectedItem().equals("Yes"))
                    {
                        g.mod_rate();
                    }
                    if(f5.getSelectedItem().equals("Yes"))
                    {
                        g.mod_rate();
                    }
                    if(f6.getSelectedItem().equals("Yes"))
                    {
                        g.mod_rate();
                    }
                    
                    if(i==r)
                    {
                        b2.setEnabled(true);
                        b1.setEnabled(false);
                    }
                    else if(i<r)
                    {
                        new room(i+1,r,rtable);
                        f.setVisible(false);
                    }                    
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(f, "Hey! Fill provided spaces Properly","We are facing Trouble", JOptionPane.WARNING_MESSAGE);
                }
            }
        });     
        
        b2 = new JButton("Proceed to Calculation");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("Bahnschrift",Font.BOLD ,18));
        b2.setBounds(60, 495, 250, 35);
        b2.setVisible(false);
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try
                {
                        g.send();
                        f.setVisible(false);
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(f, "Hey! Fill provided spaces Properly","We are facing Trouble", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        
        if(i==r)
        {
            b2.setEnabled(false);
            b2.setVisible(true);
        }
        
        f.setVisible(true);
        f.setLayout(null);
        f.add(p1);        f.add(l2);        f.add(b1);
        f.add(b2);        f.add(u1);        f.add(f1);
        f.add(u2);        f.add(f2);        f.add(u3);
        f.add(f3);        f.add(u4);        f.add(f4);
        f.add(u5);        f.add(f5);        f.add(u6);
        f.add(f6);        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
}