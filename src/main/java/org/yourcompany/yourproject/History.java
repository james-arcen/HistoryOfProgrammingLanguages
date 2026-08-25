/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
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
        
        Image tempImage = null;
        try{
            tempImage = ImageIO.read(new File("/home/jarcenas/Java/Projects/History/src/main/java/org/yourcompany/yourproject/resources/layout.png"));
        } catch(IOException e){
            System.out.println("check file path");
            e.printStackTrace();
        }
        final Image backgroundImage = tempImage;

        JPanel mainPanel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (backgroundImage != null) {
                    g.drawImage(backgroundImage, 0, 0, this.getWidth(), this.getHeight(), this);
                }
            }
        };
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width;
        int height = screenSize.height;

        //JFrame
        mainFrame.setSize(new Dimension(width,height));
        mainFrame.add(mainPanel);
        mainPanel.setLayout(null);
        
        mainPanel.add(ButtonUtils.newButton("Fortran", 1 , 0.046, 0.389, width, height, mainPanel));
            
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        

        mainFrame.setVisible(true);
        System.out.println("Hello World!");
        

    }
}