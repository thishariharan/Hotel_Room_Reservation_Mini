
package minipoo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

class mn
{
    public static void main(String[] argv)
    {
//        new soth();
//        new head(1,1);
    }
}

class soth
{
    JFrame f;    JPanel p1;    JButton b1;
    JTextField f1,f2,f3;
    JLabel l1,u1,u2,u3;
    soth()
    {
        f = new JFrame();
        f.setTitle("Selection page");
        f.setSize(400,600);
        f.getContentPane().setBackground(Color.YELLOW);
        
        p1 = new JPanel();
        p1.setBackground(Color.BLACK);        
        p1.setBounds(25, 20, 350, 40);
        
        l1 = new JLabel("SELECTION DETAILS");
        l1.setFont(new Font("Bahnschrift",Font.BOLD ,30));
        l1.setForeground(Color.WHITE);
        l1.setBounds(0, 0, 150, 30);
        
        p1.add(l1);
        
        u1 = new JLabel("No. of Rooms : ");
        u1.setFont(new Font("Bahnschrift",Font.BOLD ,22));
        u1.setForeground(Color.BLACK);
        u1.setBounds(30, 130, 200, 22);
        
        f1 = new JTextField();
        f1.setFont(new Font("Bahnschrift",Font.PLAIN ,18));
        f1.setBackground(Color.BLACK);
        f1.setForeground(Color.WHITE);
        f1.setBounds(250, 129, 100, 25);
        
        u2 = new JLabel("No. of Companions : ");
        u2.setFont(new Font("Bahnschrift",Font.BOLD ,22));
        u2.setForeground(Color.BLACK);
        u2.setBounds(30, 200, 230, 22);
        
        f2 = new JTextField();
        f2.setFont(new Font("Bahnschrift",Font.PLAIN ,18));
        f2.setBackground(Color.BLACK);
        f2.setForeground(Color.WHITE);
        f2.setBounds(250, 199, 100, 25);
        
        b1 = new JButton("To Coordinator Details");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Bahnschrift",Font.BOLD ,20));
        b1.setBounds(60, 300, 250, 35);
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    int r = Integer.parseInt(f1.getText()),m = Integer.parseInt(f2.getText());
                    if(r>0 && m>0)
                    {
                        new head(m-1,r);
                        f.setVisible(false);                        
                    }
                }
                catch(Exception ae)
                {
                    JOptionPane.showMessageDialog(f, "Hey! Fill the provided spaces Properly","Can't Proceed at the Moment", JOptionPane.WARNING_MESSAGE);
                }
                
            }
        });        
        f.setVisible(true);        
        f.setLayout(null);
        f.add(p1);        f.add(u1);        f.add(f1);
        f.add(u2);        f.add(f2);        f.add(b1);        
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
}

class head
{
    JFrame f;    JPanel p1;    JComboBox f5;
    JLabel l1,u1,u2,u3,u4,u5,u6,u7;
    JTextField f1,f2,f3,f4,f6,f7;
    JButton b1,b2;    String mtable,rtable,ptable;
    head(int m,int r)
    {
        getsall g = new getsall();
        g.make();
        g.mates_rate();
        
        f = new JFrame();
        f.setTitle("Coordinator Details");
        f.setSize(400,600);
        f.getContentPane().setBackground(Color.YELLOW);
        
        p1 = new JPanel();
        p1.setBackground(Color.BLACK);        
        p1.setBounds(25, 20, 350, 40);
        
        l1 = new JLabel("COORDINATOR DETAILS");
        l1.setFont(new Font("Bahnschrift",Font.BOLD ,30));
        l1.setForeground(Color.WHITE);
        l1.setBounds(0, 0, 150, 30);
        
        p1.add(l1);
        
        u1 = new JLabel("Name : ");
        u1.setFont(new Font("Bahnschrift",Font.BOLD ,22));
        u1.setForeground(Color.BLACK);
        u1.setBounds(30, 95, 150, 22);
        
        f1 = new JTextField();
        f1.setFont(new Font("Bahnschrift",Font.PLAIN ,18));
        f1.setBackground(Color.BLACK);
        f1.setForeground(Color.WHITE);
        f1.setBounds(180, 94, 170, 25);
        
        u2 = new JLabel("Mobile Number : ");
        u2.setFont(new Font("Bahnschrift",Font.BOLD ,18));
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
        
        u4 = new JLabel("Address : ");
        u4.setFont(new Font("Bahnschrift",Font.BOLD ,18));
        u4.setForeground(Color.BLACK);
        u4.setBounds(30, 245, 150, 22);
        
        f4 = new JTextField();
        f4.setFont(new Font("Bahnschrift",Font.PLAIN ,18));
        f4.setBackground(Color.BLACK);
        f4.setForeground(Color.WHITE);
        f4.setBounds(180, 244, 170, 25);
        
        u5 = new JLabel("Gender : ");
        u5.setFont(new Font("Bahnschrift",Font.BOLD ,22));
        u5.setForeground(Color.BLACK);
        u5.setBounds(30, 295, 150, 22);
                
        String cg[] = {"Male","Female","Trans-Gender","No Mentions"};
        f5 = new JComboBox(cg);
        f5.setFont(new Font("Bahnschrift",Font.PLAIN ,18));
        f5.setBackground(Color.BLACK);
        f5.setForeground(Color.WHITE);
        f5.setBounds(180, 294, 170, 25);
        
        u6 = new JLabel("Age : ");
        u6.setFont(new Font("Bahnschrift",Font.BOLD ,22));
        u6.setForeground(Color.BLACK);
        u6.setBounds(30, 345, 150, 22);
        
        f6 = new JTextField();
        f6.setFont(new Font("Bahnschrift",Font.PLAIN ,18));
        f6.setBackground(Color.BLACK);
        f6.setForeground(Color.WHITE);
        f6.setBounds(180, 344, 170, 25);
        
        u7 = new JLabel("Squad Name : ");
        u7.setFont(new Font("Bahnschrift",Font.BOLD ,18));
        u7.setForeground(Color.BLACK);
        u7.setBounds(30, 395, 160, 22);
                
        f7 = new JTextField();
        f7.setFont(new Font("Bahnschrift",Font.PLAIN ,18));
        f7.setBackground(Color.BLACK);
        f7.setForeground(Color.WHITE);
        f7.setBounds(180, 394, 170, 25);
        
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
                    mtable = f7.getText()+"_mate";                    rtable = f7.getText()+"_room";
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/jbeans", "root", "Passing@5q1");
                    if (c != null) {
                        System.out.println("Connected to the database successfully!");
                    
                    String mtab = "CREATE TABLE "+mtable+" (Member int, Name varchar(50), Phone int, Email varchar(55), Address varchar(100),Gender varchar(20), Age int,Role varchar(10))";
                    String rtab = "CREATE TABLE "+rtable+" (Room int, TV varchar(5), Music varchar(5),VGames varchar(5), Library varchar(5),Food varchar(5), Gadgets varchar(5))";
                    Statement sql = c.createStatement();
                    sql.executeUpdate(mtab);                    sql.executeUpdate(rtab);
//                    String inst = "INSERT INTO "+mtable+" (Member,Name,Phone,Email,Address,Gender,Age,Role) VALUES ('1','"+f1.getText()+"','"+Integer.parseInt(f2.getText())+"','"+f3.getText()+"','"+f4.getText()+"','"+f5.getSelectedItem()+"','"+Integer.parseInt(f6.getText())+"','Head')";
                    String inst = "INSERT INTO "+mtable+" VALUES ('1','"+f1.getText()+"','"+Integer.parseInt(f2.getText())+"','"+f3.getText()+"','"+f4.getText()+"','"+f5.getSelectedItem()+"','"+Integer.parseInt(f6.getText())+"','Head')";
                    sql.executeUpdate(inst);
                    System.out.print("done");
                    b2.setEnabled(true);
                    b1.setEnabled(false);
                    }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(f, "Hey! Fill provided spaces Properly","We are facing Trouble", JOptionPane.WARNING_MESSAGE);
                    
                    System.out.println("\n"+e);
                }
                
            }
        });         
        b2 = new JButton("To Other Mates");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("Bahnschrift",Font.BOLD ,20));
        b2.setBounds(60, 495, 250, 35);
        b2.setEnabled(false);
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                try
                {
                          new mate(1,m,r,mtable,rtable);
                          f.setVisible(false);
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(f, "Hey! Fill provided spaces Properly","We are facing Trouble", JOptionPane.WARNING_MESSAGE);
                }
            }
        });          
        f.setVisible(true);
        f.setLayout(null);
        f.add(p1);        f.add(u1);        f.add(f1);
        f.add(u2);        f.add(f2);        f.add(u3);
        f.add(f3);        f.add(u4);        f.add(f4);
        f.add(u5);        f.add(f5);        f.add(u6);
        f.add(f6);        f.add(u7);        f.add(f7);
        f.add(b1);        f.add(b2);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
}