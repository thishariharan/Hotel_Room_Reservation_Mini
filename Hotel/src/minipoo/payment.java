
package minipoo;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.*;

class mnp
{
    public static void main(String[] argv)
    {
//          new banks(500);
          }
}

class getsall
{
    int mates, rooms, mods, food; 
    void make()
    {
        mates=0;
        rooms=0;
        mods=0;
        food=0;
    }
    void mates_rate()
    {
        mates = mates + 1;        
    }
    void rooms_rate()
    {
        rooms = rooms + 1;
    }
    void mod_rate()
    {
        mods = mods + 1;
    }
    void food_rate()
    {
        food = food + 1;
    }
    void send()
    {
        new details(mods, rooms, mods, food);
    }
}

class details
{
    JFrame f;
    JPanel p1;
    JLabel l1,u1,u2,u3,u4,u5,u6,u7,u8,l2;
    JTextField f1,f2,f3,f4,f5,f6,f7,f8;
    JButton b1;
    float mate2,room2,mods2,food2;
    int doi;
    details(int mate,int room,int mods,int food)
    {
        f = new JFrame();
        f.setTitle("Estimation page");
        f.setSize(400,600);
        f.getContentPane().setBackground(Color.YELLOW);
        
        p1 = new JPanel();
        p1.setBackground(Color.BLACK);        
        p1.setBounds(20, 20, 360, 40);
        
        l1 = new JLabel("TOTAL EXPENCES");
        l1.setFont(new Font("Bahnschrift",Font.BOLD ,30));
        l1.setForeground(Color.WHITE);
        l1.setBounds(0, 0, 150, 30);
        
        p1.add(l1);
        
        l2 = new JLabel("Amount");
        l2.setFont(new Font("Bahnschrift",Font.BOLD ,15));
        l2.setForeground(Color.BLACK);
        l2.setBounds(245, 90, 150, 30);
        
        u1 = new JLabel("Rooms occupied "+room);
        u1.setFont(new Font("Bahnschrift",Font.BOLD ,18));
        u1.setForeground(Color.BLACK);
        u1.setBounds(20, 120, 200, 22);
         room2 = room*3000;
        f1 = new JTextField("   "+room2);
        f1.setFont(new Font("Bahnschrift",Font.PLAIN ,18));
        f1.setBackground(Color.BLACK);
        f1.setForeground(Color.WHITE);
        f1.setEnabled(false);
        f1.setBounds(200, 119, 150, 25);
        
        u2 = new JLabel("Companions joint "+mate);
        u2.setFont(new Font("Bahnschrift",Font.BOLD ,18));
        u2.setForeground(Color.BLACK);
        u2.setBounds(20, 170, 200, 22);
         mate2 = mate*1000;
        f2 = new JTextField("   "+mate2);
        f2.setFont(new Font("Bahnschrift",Font.PLAIN ,18));
        f2.setBackground(Color.BLACK);
        f2.setForeground(Color.WHITE);
        f2.setEnabled(false);
        f2.setBounds(200, 169, 150, 25);
        
        u3 = new JLabel("Modified "+mods);
        u3.setFont(new Font("Bahnschrift",Font.BOLD ,18));
        u3.setForeground(Color.BLACK);
        u3.setBounds(20, 220, 200, 22);
         mods2 = mods*500;
        f3 = new JTextField("   "+mods2);
        f3.setFont(new Font("Bahnschrift",Font.PLAIN ,18));
        f3.setBackground(Color.BLACK);
        f3.setForeground(Color.WHITE);
        f3.setEnabled(false);
        f3.setBounds(200, 219, 150, 25);
        
        u4 = new JLabel("Food Supplied "+food);
        u4.setFont(new Font("Bahnschrift",Font.BOLD ,18));
        u4.setForeground(Color.BLACK);
        u4.setBounds(20, 270, 200, 22);
         food2 = food*800;
        f4 = new JTextField("   "+food2);
        f4.setFont(new Font("Bahnschrift",Font.PLAIN ,18));
        f4.setBackground(Color.BLACK);
        f4.setForeground(Color.WHITE);
        f4.setEnabled(false);
        f4.setBounds(200, 269, 150, 25);   
        
        u5 = new JLabel("SGST - 18%");
        u5.setFont(new Font("Bahnschrift",Font.BOLD ,18));
        u5.setForeground(Color.BLACK);
        u5.setBounds(20, 320, 200, 22);
        float tot = mate2 + food2 + room2 + mods2;
        float st = tot/100;
        float gst = st*18;
        f5 = new JTextField("   "+gst);
        f5.setFont(new Font("Bahnschrift",Font.PLAIN ,18));
        f5.setBackground(Color.BLACK);
        f5.setForeground(Color.WHITE);
        f5.setEnabled(false);
        f5.setBounds(200, 319, 150, 25);
        
        u6 = new JLabel("CGST - 18%");
        u6.setFont(new Font("Bahnschrift",Font.BOLD ,18));
        u6.setForeground(Color.BLACK);
        u6.setBounds(20, 370, 200, 22);
        
        f6 = new JTextField("   "+gst);
        f6.setFont(new Font("Bahnschrift",Font.PLAIN ,18));
        f6.setBackground(Color.BLACK);
        f6.setForeground(Color.WHITE);
        f6.setEnabled(false);
        f6.setBounds(200, 369, 150, 25);
        
        u7 = new JLabel("Total Calculated");
        u7.setFont(new Font("Bahnschrift",Font.BOLD ,18));
        u7.setForeground(Color.BLACK);
        u7.setBounds(20, 420, 200, 22);
        float total = tot + gst + gst;
        f7 = new JTextField("   "+total);
        f7.setFont(new Font("Bahnschrift",Font.PLAIN ,18));
        f7.setBackground(Color.BLACK);
        f7.setForeground(Color.WHITE);
        f7.setEnabled(false);
        f7.setBounds(200, 419, 150, 25);
        
        u8 = new JLabel("Donate to our Trust");
        u8.setFont(new Font("Bahnschrift",Font.BOLD ,18));
        u8.setForeground(Color.BLACK);
        u8.setBounds(20, 470, 200, 22);
        
        f8 = new JTextField();
        f8.setFont(new Font("Bahnschrift",Font.PLAIN ,18));
        f8.setBackground(Color.BLACK);
        f8.setForeground(Color.WHITE);
        f8.setBounds(200, 469, 150, 25);
        
        b1 = new JButton("Pay");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Bahnschrift",Font.BOLD ,20));
        b1.setBounds(50, 520, 250, 35);
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                float truer = total + Float.parseFloat(f8.getText());
                new banks(truer);
                f.setVisible(false);
            }
        });
        
        f.setVisible(true);
        f.setLayout(null);
        f.add(p1);        f.add(u1);        f.add(f1);
        f.add(u2);        f.add(f2);        f.add(u3);
        f.add(f3);        f.add(u4);        f.add(f4);
        f.add(u5);        f.add(f5);        f.add(u6);
        f.add(f6);        f.add(u7);        f.add(f7);
        f.add(u8);        f.add(f8);        f.add(b1);
        f.add(l2);        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
}

class banks
{
    JFrame f;    JPanel p1;
    JLabel l1,l2,l3,l4,u1,u2,u3,u4,u5,u6,u7;
    JTextField f1,f2,f4,f5,f6,f7;    JComboBox f3;
    JButton b1,b2;
    banks(float tot)
    {
        f = new JFrame();
        f.setTitle("Payment Choosing page");
        f.setSize(400,600);
        f.getContentPane().setBackground(Color.YELLOW);
        
        p1 = new JPanel();
        p1.setBackground(Color.BLACK);        
        p1.setBounds(20, 20, 360, 40);
        
        l1 = new JLabel("PAYMENT GATEWAY");
        l1.setFont(new Font("Bahnschrift",Font.BOLD ,30));
        l1.setForeground(Color.WHITE);
        l1.setBounds(0, 0, 150, 30);
        
        p1.add(l1);
        
        l2 = new JLabel("Amount Information");
        l2.setFont(new Font("Bahnschrift",Font.BOLD ,20));
        l2.setForeground(Color.BLACK);
        l2.setBounds(30, 90, 200, 22);
        
        u1 = new JLabel("Amount to be Paid ");
        u1.setFont(new Font("Bahnschrift",Font.BOLD ,18));
        u1.setForeground(Color.BLACK);
        u1.setBounds(30, 130, 180, 22);
        
        f1 = new JTextField("       "+tot);
        f1.setFont(new Font("Bahnschrift",Font.PLAIN ,18));
        f1.setBackground(Color.BLACK);
        f1.setEnabled(false);
        f1.setForeground(Color.WHITE);
        f1.setBounds(210, 129, 140, 22);
        
        u2 = new JLabel("Antha Tax to pay ");
        u2.setFont(new Font("Bahnschrift",Font.BOLD ,18));
        u2.setForeground(Color.BLACK);
        u2.setBounds(30, 180, 180, 22);
        
        f2 = new JTextField("       "+0.00);
        f2.setFont(new Font("Bahnschrift",Font.PLAIN ,18));
        f2.setBackground(Color.BLACK);
        f2.setEnabled(false);
        f2.setForeground(Color.WHITE);
        f2.setBounds(210, 179, 140, 22);
        
        l3 = new JLabel("Net Banking Information");
        l3.setFont(new Font("Bahnschrift",Font.BOLD ,20));
        l3.setForeground(Color.BLACK);
        l3.setBounds(30, 220, 300, 22);
        
        u3 = new JLabel("Choose Bank");
        u3.setFont(new Font("Bahnschrift",Font.BOLD ,18));
        u3.setForeground(Color.BLACK);
        u3.setBounds(30, 250, 180, 22);
        String bks[] = {"   SBI","  CUB","  IOB","  BOI","  ICICI"};
        f3 = new JComboBox(bks);
        f3.setFont(new Font("Bahnschrift",Font.PLAIN ,15));
        f3.setBackground(Color.BLACK);
        f3.setForeground(Color.WHITE);
        f3.setBounds(210, 249, 140, 22);
        
        b1 = new JButton("Pay");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Bahnschrift",Font.BOLD ,20));
        b1.setBounds(50, 280, 250, 30);
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                new finale();
                f.setVisible(false);
            }
        });
        
        l4 = new JLabel("Card Information");
        l4.setFont(new Font("Bahnschrift",Font.BOLD ,20));
        l4.setForeground(Color.BLACK);
        l4.setBounds(30, 320, 300, 22);
        
        u4 = new JLabel("Name on Card");
        u4.setFont(new Font("Bahnschrift",Font.BOLD ,18));
        u4.setForeground(Color.BLACK);
        u4.setBounds(30, 350, 180, 22);
        
        f4 = new JTextField();
        f4.setFont(new Font("Bahnschrift",Font.PLAIN ,18));
        f4.setBackground(Color.BLACK);
        f4.setForeground(Color.WHITE);
        f4.setBounds(210, 349, 140, 22);
        
        u5 = new JLabel("Number on Card");
        u5.setFont(new Font("Bahnschrift",Font.BOLD ,18));
        u5.setForeground(Color.BLACK);
        u5.setBounds(30, 380, 180, 22);
        
        f5 = new JTextField();
        f5.setFont(new Font("Bahnschrift",Font.PLAIN ,18));
        f5.setBackground(Color.BLACK);
        f5.setForeground(Color.WHITE);
        f5.setBounds(210, 379, 140, 22);
        
        u6 = new JLabel("Expiry of Card");
        u6.setFont(new Font("Bahnschrift",Font.BOLD ,18));
        u6.setForeground(Color.BLACK);
        u6.setBounds(30, 410, 180, 22);
        
        f6 = new JTextField();
        f6.setFont(new Font("Bahnschrift",Font.PLAIN ,18));
        f6.setBackground(Color.BLACK);
        f6.setForeground(Color.WHITE);
        f6.setBounds(210, 409, 140, 22);
        
        u7 = new JLabel("CVV on Card");
        u7.setFont(new Font("Bahnschrift",Font.BOLD ,18));
        u7.setForeground(Color.BLACK);
        u7.setBounds(30, 440, 180, 22);
        
        f7 = new JTextField();
        f7.setFont(new Font("Bahnschrift",Font.PLAIN ,18));
        f7.setBackground(Color.BLACK);
        f7.setForeground(Color.WHITE);
        f7.setBounds(210, 439, 140, 22);
       
        b2 = new JButton("Pay");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("Bahnschrift",Font.BOLD ,20));
        b2.setBounds(50, 480, 250, 35);
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                new finale();
                f.setVisible(false);
            }
        });
        
        f.setVisible(true);
        f.setLayout(null);
        f.add(p1);        f.add(l2);        f.add(u1);
        f.add(f1);        f.add(u2);        f.add(f2);
        f.add(l3);        f.add(u3);        f.add(f3);
        f.add(b1);        f.add(b2);        f.add(l4);
        f.add(u4);        f.add(f4);        f.add(u5);
        f.add(f5);        f.add(u6);        f.add(f6);
        f.add(u7);        f.add(f7);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
}

