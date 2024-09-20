
package minipoo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class mnd
{
    public static void main(String[] argv)
    {
        new finale();
    }
}

class finale
{
    JFrame f;
    JLabel l1,l2,l3;
    JButton b1,b2;
    JPanel p1;
    finale()
    {
        f = new JFrame();
        f.setTitle("Final page");
        f.setSize(400,600);
        f.getContentPane().setBackground(Color.WHITE);
        
        l1 = new JLabel("Few");
        l1.setFont(new Font("Faint Book",Font.BOLD ,40));
        l1.setForeground(Color.BLACK);
        l1.setBounds(55, 210, 100, 50);
        
        p1 = new JPanel();
        p1.setBackground(Color.YELLOW);        
        p1.setBounds(130, 250, 240, 50);
        
        l2 = new JLabel("Minites");
        l2.setFont(new Font("Doctor Glitch",Font.BOLD ,30));
        l2.setForeground(Color.BLACK);
        l2.setBounds(0, 10, 100, 50);
        
        p1.add(l2);
        
        l3 = new JLabel("Later");
        l3.setFont(new Font("Faint Book",Font.BOLD ,40));
        l3.setForeground(Color.YELLOW);
        l3.setBounds(220, 320, 150, 50);
                
        b1 = new JButton();
        b1.setBackground(Color.WHITE);
        b1.setBounds(0, 0, 400, 200);
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                JOptionPane.showMessageDialog(f, "Payment made Successfully","Congratulations!", JOptionPane.INFORMATION_MESSAGE);
                f.dispose();
            }
        });
        
        b2 = new JButton();
        b2.setBackground(Color.WHITE);
        b2.setBounds(0, 400, 400, 200);
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(f, "Payment made Successfully","Congratulations!", JOptionPane.INFORMATION_MESSAGE);
                f.dispose();
            }
        });
                 
        f.setVisible(true);
        f.setLayout(null);
        f.add(l1);        f.add(p1);        f.add(l3);
        f.add(b1);        f.add(b2);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }
}
