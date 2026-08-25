//Params(title, description)

package org.yourcompany.yourproject.utils;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

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
                mainPanel.add(InformationUtils.displayInfo(index, screenWidth, screenHeight), 0); // 0 always makes sure panel appears on top
                mainPanel.setComponentZOrder(InformationUtils.displayInfo(index, screenWidth, screenHeight), 0);
                mainPanel.revalidate();
                mainPanel.repaint();
            }
            );
        
        
        
        return wrapper;
    }   


}