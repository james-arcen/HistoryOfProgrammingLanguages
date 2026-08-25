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
            tempImage = ImageIO.read(new File("src/main/java/org/yourcompany/yourproject/resources/layout.png"));
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
        
       
        mainPanel.add(ButtonUtils.newButton("<html><center>Fortran I<br><b>1957</b></center></html>", 1, 0.036, 0.067, width, height, mainPanel));
        mainPanel.add(ButtonUtils.newButton("<html><center>Fortran II<br><b>1958</b></center></html>", 2, 0.036, 0.256, width, height, mainPanel));
        mainPanel.add(ButtonUtils.newButton("<html><center>Fortran IV<br><b>1962</b></center></html>", 3, 0.039, 0.435, width, height, mainPanel));
        mainPanel.add(ButtonUtils.newButton("<html><center>Fortran 77<br><b>1978</b></center></html>", 4, 0.036, 0.625, width, height, mainPanel));
        mainPanel.add(ButtonUtils.newButton("<html><center>Fortran 90<br><b>1990</b></center></html>", 5, 0.036, 0.812, width, height, mainPanel));

        mainPanel.add(ButtonUtils.newButton("<html><center>Algol 58<br><b>1958</b></center></html>", 6, 0.192, 0.065, width, height, mainPanel));
        mainPanel.add(ButtonUtils.newButton("<html><center>Algol 60<br><b>1960</b></center></html>", 7, 0.192, 0.189, width, height, mainPanel));
        mainPanel.add(ButtonUtils.newButton("<html><center>Algol W<br><b>1966</b></center></html>", 8, 0.143, 0.309, width, height, mainPanel));
        mainPanel.add(ButtonUtils.newButton("<html><center>Algol 68<br><b>1968</b></center></html>", 9, 0.238, 0.291, width, height, mainPanel));
        mainPanel.add(ButtonUtils.newButton("<html><center>Pascal<br><b>1971</b></center></html>", 10, 0.192, 0.443, width, height, mainPanel));
        mainPanel.add(ButtonUtils.newButton("<html><center>Modula-2<br><b>1977</b></center></html>", 11, 0.193, 0.571, width, height, mainPanel));
        mainPanel.add(ButtonUtils.newButton("<html><center>Modula-3<br><b>1989</b></center></html>", 12, 0.144, 0.720, width, height, mainPanel));
        mainPanel.add(ButtonUtils.newButton("<html><center>Oberon<br><b>1988</b></center></html>", 13, 0.254, 0.717, width, height, mainPanel));

        mainPanel.add(ButtonUtils.newButton("<html><center>Simula I<br><b>1964</b></center></html>", 16, 0.326, 0.191, width, height, mainPanel));
        mainPanel.add(ButtonUtils.newButton("<html><center>Simula 67<br><b>1967</b></center></html>", 17, 0.401, 0.309, width, height, mainPanel));
        mainPanel.add(ButtonUtils.newButton("<html><center>Ada 83<br><b>1983</b></center></html>", 14, 0.326, 0.517, width, height, mainPanel));
        mainPanel.add(ButtonUtils.newButton("<html><center>Smalltalk 80<br><b>1980</b></center></html>", 18, 0.442, 0.546, width, height, mainPanel));
        mainPanel.add(ButtonUtils.newButton("<html><center>Eiffel<br><b>1985</b></center></html>", 19, 0.433, 0.705, width, height, mainPanel));
        mainPanel.add(ButtonUtils.newButton("<html><center>Ada 95<br><b>1995</b></center></html>", 15, 0.326, 0.784, width, height, mainPanel));

        mainPanel.add(ButtonUtils.newButton("<html><center>APL<br><b>1960</b></center></html>", 20, 0.530, 0.158, width, height, mainPanel));
        mainPanel.add(ButtonUtils.newButton("<html><center>BASIC<br><b>1964</b></center></html>", 21, 0.581, 0.283, width, height, mainPanel));
        mainPanel.add(ButtonUtils.newButton("<html><center>QuickBASIC<br><b>1988</b></center></html>", 22, 0.580, 0.526, width, height, mainPanel));
        mainPanel.add(ButtonUtils.newButton("<html><center>Visual BASIC<br><b>1991</b></center></html>", 23, 0.580, 0.682, width, height, mainPanel));

        mainPanel.add(ButtonUtils.newButton("<html><center>FLOW-MATIC<br><b>1957</b></center></html>", 24, 0.661, 0.065, width, height, mainPanel));
        mainPanel.add(ButtonUtils.newButton("<html><center>COBOL<br><b>1960</b></center></html>", 25, 0.661, 0.200, width, height, mainPanel));
        mainPanel.add(ButtonUtils.newButton("<html><center>PL/I<br><b>1964</b></center></html>", 26, 0.661, 0.313, width, height, mainPanel));

        mainPanel.add(ButtonUtils.newButton("<html><center>CPL<br><b>1963</b></center></html>", 27, 0.729, 0.236, width, height, mainPanel));
        mainPanel.add(ButtonUtils.newButton("<html><center>BCPL<br><b>1969</b></center></html>", 28, 0.729, 0.350, width, height, mainPanel));
        mainPanel.add(ButtonUtils.newButton("<html><center>B<br><b>1970</b></center></html>", 29, 0.729, 0.449, width, height, mainPanel));
        mainPanel.add(ButtonUtils.newButton("<html><center>C<br><b>1972</b></center></html>", 30, 0.729, 0.548, width, height, mainPanel));
        mainPanel.add(ButtonUtils.newButton("<html><center>C++<br><b>1985</b></center></html>", 31, 0.731, 0.709, width, height, mainPanel));
        mainPanel.add(ButtonUtils.newButton("<html><center>Java<br><b>1995</b></center></html>", 33, 0.730, 0.822, width, height, mainPanel));

        mainPanel.add(ButtonUtils.newButton("<html><center>LISP<br><b>1959</b></center></html>", 34, 0.838, 0.143, width, height, mainPanel));
        mainPanel.add(ButtonUtils.newButton("<html><center>Scheme<br><b>1975</b></center></html>", 35, 0.849, 0.578, width, height, mainPanel));
        mainPanel.add(ButtonUtils.newButton("<html><center>Common LISP<br><b>1984</b></center></html>", 36, 0.886, 0.719, width, height, mainPanel));
        mainPanel.add(ButtonUtils.newButton("<html><center>ANSI C<br><b>1989</b></center></html>", 32, 0.814, 0.722, width, height, mainPanel));

        mainPanel.add(ButtonUtils.newButton("<html><center>SNOBOL<br><b>1964</b></center></html>", 37, 0.931, 0.213, width, height, mainPanel));
        mainPanel.add(ButtonUtils.newButton("<html><center>ICON<br><b>1984</b></center></html>", 38, 0.931, 0.523, width, height, mainPanel));
            
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        

        mainFrame.setVisible(true);
        System.out.println("Hello World!");
        

    }
}