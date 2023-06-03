
package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    
    String name;
    JButton start, back;
    
    Rules(String name)
    {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        JLabel heading = new JLabel("welcome " + name + " to this Quiz");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel rules = new JLabel("welcome " + name + " to Simple Minds");
        rules.setBounds(53, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
            "<html>"+ 
                "1. Click the \"Start\" button to begin." + "<br><br>" +
                "2. Read each question carefully before selecting an answer." + "<br><br>" +
                "3. Select only one answer per question." + "<br><br>" +
                "4. Once an answer is selected, it cannot be changed." + "<br><br>" +
                "5. Progress to the next question by clicking \"Next\" or similar." + "<br><br>" +
                "6. Track the number of correct answers as you go." + "<br><br>" +
                "7. Complete the quiz by answering all the questions." + "<br><br>" +
                "8. Brace yourself, this paper is not for the faint hearted." + "<br><br>" +
            "<html>"
        );
        add(rules);
        
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(450, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == start)
        {
           setVisible(false);
           new Quiz(name); 
        }
        else 
        {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args)
    {
        new Rules("User");
    }
    
}
