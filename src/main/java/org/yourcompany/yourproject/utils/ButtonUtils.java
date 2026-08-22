//Params(title, description)

package org.yourcompany.yourproject.utils;

import java.awt.BorderLayout;
import java.awt.Dimension;

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
        button.setText(title);
        button.setPreferredSize(new Dimension(100,100));
        wrapper.setBounds(calculatedX, calculatedY, 100,100);


        InformationUtils.mouse(button, wrapper);
        button.addActionListener(e -> {
                mainPanel.add(InformationUtils.displayInfo(index, screenWidth, screenHeight));
                mainPanel.revalidate();
                mainPanel.repaint();
            }
            );
        
        
        
        return wrapper;
    }   


}