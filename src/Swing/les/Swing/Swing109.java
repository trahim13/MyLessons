package Swing.les.Swing;

import javax.swing.*;
import java.awt.*;


public class Swing109 {
    static JFrame jFrame = getJFrame();
    static JPanel jPanel = new JPanel();


    public static void main(String[] args) {
        jFrame.add(jPanel);
        JPopupMenu jPopupMenu = new JPopupMenu();
        jPopupMenu.add(new JMenuItem("one"));
        jPopupMenu.add(new JMenuItem("two"));
        jPanel.setComponentPopupMenu(jPopupMenu);


    }

    public static JFrame getJFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension d = toolkit.getScreenSize();
        jFrame.setBounds(d.width / 2 - 250, d.height / 2 - 250, 500, 500);
        jFrame.setTitle("Swing109");
        return jFrame;

    }
}
