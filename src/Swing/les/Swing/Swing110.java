package Swing.les.Swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by petrovski on 26.03.2017.
 */
public class Swing110 {
    static JFrame jFrame = getJFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        JToolBar jtoolBar = new JToolBar("title");
        JButton one = new JButton("one");
        one.setToolTipText("this is the first button");
        jtoolBar.add(one);
        jtoolBar.add(new JButton("two"));
        jtoolBar.addSeparator();
        jtoolBar.add(new JButton("three"));
        jPanel.add(jtoolBar);
    }

    public static JFrame getJFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Swing110");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension d = toolkit.getScreenSize();
        jFrame.setBounds(d.width / 2 - 250, d.height / 2 - 250, 500, 500);
        jFrame.setVisible(true);
        return jFrame;
    }
}
