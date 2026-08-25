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
                case  1:
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Fortran", "desc", "src/main/java/org/yourcompany/yourproject/resources/fortran logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
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