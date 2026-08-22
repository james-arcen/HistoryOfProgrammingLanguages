package org.yourcompany.yourproject.utils;

import java.awt.Dimension;
import java.awt.Rectangle;

import javax.swing.JPanel;
// Call the index value of the item
public class InformationUtils{
        public static JPanel displayInfo(int index){
            Dimension panelSize = new Dimension(800,600);
            Rectangle bounds = new Rectangle(560, 240, 800, 600);
            switch (index) {
                case  1:
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Fortran", "desc", "/home/jarcenas/Java/Projects/History/src/main/java/org/yourcompany/yourproject/resources/fortran logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                default:
                    throw new AssertionError();
            }
        }
}