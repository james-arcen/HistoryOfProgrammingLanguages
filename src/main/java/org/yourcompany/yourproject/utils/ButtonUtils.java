//Params(title, description)

package org.yourcompany.yourproject.utils;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonUtils{
    

    public static JPanel newButton(String title, String desc, String path){
        JButton button = new JButton();
        JPanel wrapper = new JPanel();
        JPanel panel = PanelUtils.displayPanel(new Dimension(800,600), title, desc, path);



        panel.setVisible(false);
        wrapper.setLayout(new FlowLayout());
        wrapper.add(button);
        wrapper.add(panel);
        button.setText(title);
        button.setPreferredSize(new Dimension(100,200));
        
        button.addActionListener(e -> {
                if(panel.isVisible() == false){
                    panel.setVisible(true);
                }    
                
            }
            );
        wrapper.revalidate();
        wrapper.repaint();
        
        return wrapper;
    }   


}