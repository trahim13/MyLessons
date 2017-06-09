package Swing.les.Swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by root on 28.03.2017.
 */
public class Swing21 {
    private static JFrame jFrame = getJFrame();
    private static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        jPanel.add(new JButton("one"));
        jPanel.add(new JButton("two")).setFocusable(false);
        jPanel.add(new JButton("three")).requestFocusInWindow();
        jFrame.revalidate();


    }


    public static JFrame getJFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Swing121");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension d = toolkit.getScreenSize();
        jFrame.setBounds(d.width / 2 - 250, d.height / 2 - 250, 500, 500);
        jFrame.setVisible(true);
        return jFrame;
    }
}
