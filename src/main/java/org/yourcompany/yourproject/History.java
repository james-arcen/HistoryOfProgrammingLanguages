/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;
import java.awt.Dimension;
import java.awt.GridBagLayout;

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
        //JFrame
        mainFrame.setLayout(new GridBagLayout());
        mainFrame.setSize(new Dimension(1920,1080));
        mainFrame.add(mainPanel);
        mainPanel.setLayout(null);
        mainPanel.setPreferredSize(new Dimension(1920,1080));
        mainPanel.add(ButtonUtils.newButton("Fortran", 1, 200, 300, mainPanel));
            
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