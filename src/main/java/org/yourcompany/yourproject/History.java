/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.yourcompany.yourproject.utils.ButtonUtils;
/**
 *
 * @author jarcenas
 */
public class History {

    
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame();
        JPanel mainPanel = new JPanel();
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;

        //JFrame
        mainFrame.setSize(new Dimension(width,height));
        mainFrame.add(mainPanel);
        mainPanel.setLayout(null);
        mainPanel.add(ButtonUtils.newButton("Fortran", 1 , 0.1, 0.25, width, height, mainPanel));
            
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        

        mainFrame.setVisible(true);
        System.out.println("Hello World!");
        

    }
}



/*
To Do:

Modular Buttons


Constraints

1 Panel only
*/