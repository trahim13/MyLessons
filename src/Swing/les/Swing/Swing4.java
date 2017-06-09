package Swing.les.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

/**
 * Created by petrovski on 22.03.2017.
 */
public class Swing4 {
    public static void main(String[] args) {
        JFrame jFrame = getJFrame();
        JPanel jPanel = new JPanel();
        JButton jButton = new JButton("submit");
        jPanel.add(jButton);
        jFrame.add(jPanel);
        jButton.addActionListener(EventHandler.create(ActionListener.class, jFrame, "title", "source.text"));


    }

    static JFrame getJFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 250, 500, 500);
        jFrame.setTitle("My next app in Swing");
        return jFrame;
    }

}
