package org.yourcompany.yourproject.utils;

import java.awt.Dimension;
import java.awt.Rectangle;

import javax.swing.JPanel;
// Call the index value of the item
public class InformationUtils{
        public static JPanel displayInfo(int index, int screenWidth, int screenHeight){
            //Dynamic size
            double displayWidth = screenWidth  *.7;
            double displayHeight = screenHeight * .7;

            //Centering
            double calculatedX = ((screenWidth - displayWidth) / 2);
            double calculatedY = ((screenHeight - displayHeight) / 2);

            Dimension panelSize = new Dimension((int)displayWidth,(int)displayHeight);
            Rectangle bounds = new Rectangle((int)calculatedX, (int)calculatedY, (int)displayWidth, (int)displayHeight);

            

            switch (index) {
                case 1: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Fortran I", "desc", "src/main/java/org/yourcompany/yourproject/resources/fortran logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 2: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Fortran II", "desc", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 3: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Fortran IV", "desc", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 4: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Fortran 77", "desc", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 5: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Fortran 90", "desc", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 6: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Algol 58", "desc", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 7: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Algol 60", "desc", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 8: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Algol W", "desc", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 9: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Algol 68", "desc", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 10: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Pascal", "desc", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 11: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Modula-2", "desc", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 12: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Modula-3", "desc", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 13: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Oberon", "desc", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 14: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Ada 83", "desc", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 15: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Ada 95", "desc", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 16: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Simula I", "desc", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 17: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Simula 67", "desc", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 18: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Smalltalk 80", "desc", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 19: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Eiffel", "desc", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 20: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "APL", "desc", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 21: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "BASIC", "desc", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 22: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "QuickBASIC", "desc", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 23: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Visual BASIC", "desc", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 24: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "FLOW-MATIC", "desc", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 25: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "COBOL", "desc", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 26: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "PL/I", "desc", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 27: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "CPL", "desc", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 28: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "BCPL", "desc", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 29: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "B", "desc", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 30: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "C", "desc", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 31: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "C++", "desc", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 32: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "ANSI C", "desc", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 33: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Java", "desc", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 34: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "LISP", "desc", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 35: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Scheme", "desc", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 36: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Common LISP", "desc", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 37: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "SNOBOL", "desc", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 38: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "ICON", "desc", "src/main/java/org/yourcompany/yourproject/resources/logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                default:
                    throw new AssertionError();
            }
        }


public static void mouse(javax.swing.JButton button, JPanel panel){
    // 1. Create a final array to hold the anchor points. 
    final int[] anchor = new int[2];

    // 2. Interrogate the OS hardware limits strictly for the math calculation
    final java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();

    // 3. Instantiate the universal MouseAdapter sensor
    java.awt.event.MouseAdapter telemetryAdapter = new java.awt.event.MouseAdapter() {

        @Override
        public void mousePressed(java.awt.event.MouseEvent e) {
            // Calibrate the initial anchor point 
            anchor[0] = e.getX();
            anchor[1] = e.getY();
        }

        @Override
        public void mouseDragged(java.awt.event.MouseEvent e) {
            // Calculate the delta (the exact pixel difference)
            int deltaX = e.getX() - anchor[0];
            int deltaY = e.getY() - anchor[1];

            // Push the PANEL (wrapper) to its new physical location
            int currentX = panel.getX();
            int currentY = panel.getY();
            panel.setLocation(currentX + deltaX, currentY + deltaY);

            // 4. The Proportional Math: Divide the exact pixel coordinate by the total screen dimension
            double ratioX = (double) panel.getX() / screenSize.width;
            double ratioY = (double) panel.getY() / screenSize.height;

            // 5. Stream the live decimal ratio straight to your IDE console, formatted to 3 decimal places
            System.out.println("Decimal Ratio -> X: " + String.format("%.3f", ratioX) + ", Y: " + String.format("%.3f", ratioY));
        }
    };

    // 6. Physically wire the sensor strictly into the BUTTON
    button.addMouseListener(telemetryAdapter);
    button.addMouseMotionListener(telemetryAdapter);
}

}