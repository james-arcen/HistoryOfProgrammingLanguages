package org.yourcompany.yourproject.utils;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class PanelUtils{
    public static JPanel displayPanel(Dimension d, String title, String description){
        JPanel bPanel = new JPanel(); // wrapper to control the size of the display panel
        JPanel dPanel = new JPanel();
        JPanel header = new JPanel();
        JButton closeButton = new JButton();
        JLabel t = new JLabel();
        JTextArea desc = new JTextArea();
        bPanel.setLayout(new FlowLayout());


        //Display Panel Configuration
        dPanel.setLayout(new BorderLayout());
        dPanel.setBackground(Color.GRAY);
        dPanel.add(header, BorderLayout.NORTH);
        header.setLayout(new BorderLayout());
        header.setOpaque(false);
        //Title Configuration
        t.setHorizontalAlignment(SwingConstants.CENTER);// this sets the title on the center of the screen
        t.setOpaque(false);
        header.add(t, BorderLayout.CENTER);

        //Description Configuration
        dPanel.add(desc, BorderLayout.CENTER);

        header.add(closeButton, BorderLayout.EAST);
        


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