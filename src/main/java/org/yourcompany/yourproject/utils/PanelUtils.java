package org.yourcompany.yourproject.utils;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PanelUtils{
    public static JPanel displayPanel(Dimension d, String title, String description){
        JPanel bPanel = new JPanel(); // wrapper to control the size of the display panel
        JPanel dPanel = new JPanel();
        JButton closeButton = new JButton();
        JLabel t = new JLabel();
        JTextArea desc = new JTextArea();

        bPanel.setLayout(new FlowLayout());


        //Display Panel Configuration
        dPanel.setBackground(Color.BLUE);
        dPanel.add(closeButton);
        dPanel.add(t);
        dPanel.add(desc);


        //Title and Info
        t.setText(title);
        desc.setText(description);

        closeButton.addActionListener(e-> {
            if(bPanel.isVisible() == true){
                bPanel.setVisible(false);
            }
        });
        closeButton.setText("X");

        
        dPanel.setPreferredSize(d); // set the preffered dimensions of our panel

        bPanel.add(dPanel);
        return bPanel;
    }



}