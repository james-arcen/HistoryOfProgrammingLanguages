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
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Fortran II", "desc", "src/main/java/org/yourcompany/yourproject/resources/fortran logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 3: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Fortran IV", "desc", "src/main/java/org/yourcompany/yourproject/resources/fortran logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 4: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Fortran 77", "desc", "src/main/java/org/yourcompany/yourproject/resources/fortran logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 5: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Fortran 90", "desc", "src/main/java/org/yourcompany/yourproject/resources/fortran logo.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 6: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Algol 58", "desc", "src/main/java/org/yourcompany/yourproject/resources/algol.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 7: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Algol 60", "desc", "src/main/java/org/yourcompany/yourproject/resources/algol.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 8: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Algol W", "desc", "src/main/java/org/yourcompany/yourproject/resources/algol.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 9: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Algol 68", "desc", "src/main/java/org/yourcompany/yourproject/resources/algol.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 10: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Pascal", "desc", "src/main/java/org/yourcompany/yourproject/resources/pascal.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 11: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Modula-2", "desc", "src/main/java/org/yourcompany/yourproject/resources/modula2.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 12: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Modula-3", "desc", "src/main/java/org/yourcompany/yourproject/resources/modula3.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 13: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Oberon", "desc", "src/main/java/org/yourcompany/yourproject/resources/oberon.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 14: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Ada 83", "desc", "src/main/java/org/yourcompany/yourproject/resources/ada83.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 15: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Ada 95", "desc", "src/main/java/org/yourcompany/yourproject/resources/ada95.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 16: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Simula I", "desc", "src/main/java/org/yourcompany/yourproject/resources/simula.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 17: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Simula 67", "desc", "src/main/java/org/yourcompany/yourproject/resources/simula.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 18: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Smalltalk 80", "desc", "src/main/java/org/yourcompany/yourproject/resources/smalltalk.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 19: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Eiffel", "desc", "src/main/java/org/yourcompany/yourproject/resources/eiffel.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 20: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "APL", "desc", "src/main/java/org/yourcompany/yourproject/resources/apl.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 21: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "BASIC", "desc", "src/main/java/org/yourcompany/yourproject/resources/basic.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 22: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "QuickBASIC", "desc", "src/main/java/org/yourcompany/yourproject/resources/quickbasic.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 23: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Visual BASIC", "desc", "src/main/java/org/yourcompany/yourproject/resources/visualbasic.jpeg");
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
                    JPanel panel = PanelUtils.displayPanel(panelSize, "COBOL", "desc", "src/main/java/org/yourcompany/yourproject/resources/cobol.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 26: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "PL/I", "desc", "src/main/java/org/yourcompany/yourproject/resources/pl1.jpeg");
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
                    JPanel panel = PanelUtils.displayPanel(panelSize, "B", "desc", "src/main/java/org/yourcompany/yourproject/resources/b.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 30: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "C", "desc", "src/main/java/org/yourcompany/yourproject/resources/c.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 31: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "C++", "desc", "src/main/java/org/yourcompany/yourproject/resources/cpp.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 32: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "ANSI C", "desc", "src/main/java/org/yourcompany/yourproject/resources/ansi.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 33: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Java", "desc", "src/main/java/org/yourcompany/yourproject/resources/java.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 34: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "LISP", "desc", "src/main/java/org/yourcompany/yourproject/resources/lisp.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 35: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Scheme", "desc", "src/main/java/org/yourcompany/yourproject/resources/scheme.jpeg");
                    panel.setBounds(bounds);
                    panel.setVisible(true);
                    return panel;
                }
                case 36: {
                    JPanel panel = PanelUtils.displayPanel(panelSize, "Common LISP", "desc", "src/main/java/org/yourcompany/yourproject/resources/lisp.jpeg");
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


}