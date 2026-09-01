//Params(title, description)

package org.yourcompany.yourproject.utils;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ButtonUtils{
    

    public static JPanel newButton(String title, int index, double xRatio, double yRatio, int screenWidth, int screenHeight, JPanel mainPanel){
        JButton button = new JButton();
        JPanel wrapper = new JPanel();


        int calculatedX = (int) (screenWidth * xRatio); 
        int calculatedY = (int) (screenHeight * yRatio);

        wrapper.setLayout(new BorderLayout());
        wrapper.add(button, BorderLayout.CENTER);
        button.setFont(new java.awt.Font("Arial", Font.PLAIN, 24));
        button.setText(title);
        int buttonWidth = (int)(screenWidth * 0.04895);
        int buttonHeight = (int)(screenHeight * 0.06130);
        button.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        wrapper.setBounds(calculatedX, calculatedY, buttonWidth, buttonHeight);


        button.addActionListener(e -> {
                JPanel panel = InformationUtils.displayInfo(index, screenWidth, screenHeight);
                panel.setBounds(0, 0, screenWidth, screenHeight);
                
                //Block mouse events from the buttons
                panel.addMouseListener(new java.awt.event.MouseAdapter() {});
                
                mainPanel.add(panel, 0); 
                mainPanel.setComponentZOrder(panel, 0);
                mainPanel.revalidate();
                
                SwingUtilities.getWindowAncestor(mainPanel).repaint();
            }
            );
        
        
        
        return wrapper;
    }   


}