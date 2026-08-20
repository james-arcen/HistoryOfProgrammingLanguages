package org.yourcompany.yourproject.utils;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;

public class PanelUtils{
    public static JPanel displayPanel(Dimension d){
        JPanel bPanel = new JPanel(); // wrapper to control the size of the display panel
        JPanel dPanel = new JPanel();

        bPanel.setLayout(new FlowLayout());
        dPanel.setBackground(Color.BLUE);
        dPanel.setPreferredSize(d); // set the preffered dimensions of our panel
        bPanel.add(dPanel);

        bPanel.revalidate(); // recalculate changes
        bPanel.repaint(); // redraw the panel after we finish calculating and evaluating the  new components
        return bPanel;
    }

}