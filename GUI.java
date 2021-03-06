/* BASIC JAVA GUI GAME */

/**
 * @author Ekupka
 */

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {

    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;
    
    public GUI(){
        frame = new JFrame();
        
        JButton button = new JButton("Click me");
        button.addActionListener(this);
        
        JLabel label = new JLabel("Number of Clicks: 0");
       
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("OUR GUI");
        frame.pack();
        frame.setVisible(true);
    } //gui
    
    public static void main(String args[]) {
        new GUI();
    } //main

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of Clicks: " + count);
    } //actionPerformed
}
