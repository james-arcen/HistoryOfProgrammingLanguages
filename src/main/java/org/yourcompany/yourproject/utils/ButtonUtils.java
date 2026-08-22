//Params(title, description)

package org.yourcompany.yourproject.utils;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonUtils{
    

    public static JPanel newButton(String title, int index, int x, int y, JPanel mainPanel){
        JButton button = new JButton();
        JPanel wrapper = new JPanel();
        wrapper.setLayout(new BorderLayout());
        wrapper.add(button, BorderLayout.CENTER);
        button.setText(title);
        button.setPreferredSize(new Dimension(100,200));
        wrapper.setBounds(x, y, 100,200);

        button.addActionListener(e -> {
                mainPanel.add(InformationUtils.displayInfo(index));
                mainPanel.revalidate();
                mainPanel.repaint();
            }
            );
        
        
        
        return wrapper;
    }   


}