package org.yourcompany.yourproject.utils;

import java.awt.Dimension;
import java.awt.Rectangle;

import javax.swing.JPanel;
// Call the index value of the item
public class InformationUtils{
        public static JPanel displayInfo(int index){
            Dimension panelSize = new Dimension(800,600);
            Rectangle bounds = new Rectangle(560, 240, 800, 600);
            switch (index) {
                case  1:
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Fortran", "desc", "/home/jarcenas/Java/Projects/History/src/main/java/org/yourcompany/yourproject/resources/fortran logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                default:
                    throw new AssertionError();
            }
        }
        public static void mouse(javax.swing.JButton button, JPanel panel){
    // 1. Create a final array to hold the anchor points. 
    // We use an array because variables accessed inside an anonymous inner class must be strictly final.
    final int[] anchor = new int[2];

    // 2. Instantiate the universal MouseAdapter sensor
    java.awt.event.MouseAdapter telemetryAdapter = new java.awt.event.MouseAdapter() {

        @Override
        public void mousePressed(java.awt.event.MouseEvent e) {
            // 3. Calibrate the initial anchor point the exact moment the user clicks down on the BUTTON
            anchor[0] = e.getX();
            anchor[1] = e.getY();
        }

        @Override
        public void mouseDragged(java.awt.event.MouseEvent e) {
            // 4. Calculate the delta (the exact pixel difference) based on the button's internal coordinates
            int deltaX = e.getX() - anchor[0];
            int deltaY = e.getY() - anchor[1];

            // 5. Grab the PANEL's current absolute location on the master canvas
            int currentX = panel.getX();
            int currentY = panel.getY();

            // 6. Push the PANEL (wrapper) to its new physical location by applying the delta
            panel.setLocation(currentX + deltaX, currentY + deltaY);

            // 7. Stream the live telemetry coordinates straight to your IDE console
            System.out.println("Node Coordinates -> X: " + panel.getX() + ", Y: " + panel.getY());
        }
    };

    // 8. Physically wire the sensor strictly into the BUTTON so it intercepts the Z-axis events
    button.addMouseListener(telemetryAdapter);
    button.addMouseMotionListener(telemetryAdapter);
}

}