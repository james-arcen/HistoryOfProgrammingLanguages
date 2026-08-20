/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;
import java.awt.Dimension;

import javax.swing.JFrame;

import org.yourcompany.yourproject.utils.ButtonUtils;
/**
 *
 * @author jarcenas
 */
public class History {

    
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame();
        //JFrame
        mainFrame.setSize(new Dimension(1920,1080));
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        mainFrame.add(ButtonUtils.newButton("Fortran", "desc"));


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