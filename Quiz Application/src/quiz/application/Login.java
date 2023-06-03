
package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    
    JButton Enter, Back;
    JTextField tfname;
    
    Login()
    {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);
        
        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        name.setForeground(new Color(30, 144, 254));
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);
        
        Enter = new JButton("Enter");
        Enter.setBounds(735, 270, 120, 25);
        Enter.setBackground(new Color(30, 144, 254));
        Enter.setForeground(Color.WHITE);
        Enter.addActionListener(this);
        add(Enter);
        
        Back = new JButton("Back");
        Back.setBounds(915, 270, 120, 25);
        Back.setBackground(new Color(30, 144, 254));
        Back.setForeground(Color.WHITE);
        Back.addActionListener(this);
        add(Back);
        
        setSize(1200, 500);
        setLocation(200,150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == Enter)
        {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        }
        else if(ae.getSource() == Back)
        {
            setVisible(false);
        }
    }
    
    public static void main(String[] args)
    {
        new Login();
    }
}
