package org.yourcompany.yourproject.utils;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

public class PanelUtils{
    public static JPanel displayPanel(Dimension d){
        JPanel bPanel = new JPanel();
        JPanel dPanel = new JPanel();
        bPanel.setLayout(new FlowLayout());
        dPanel.setBackground(Color.BLUE);
        dPanel.setPreferredSize(d);
        bPanel.add(dPanel);

        return bPanel;
    }

}