package Swing.les.Swing;

import javax.swing.*;
import java.awt.*;


public class Swing3 {
    public static void main(String[] args) {
        JFrame jFrame = getJFrame();
        JPanel jPanel = new JPanel();
        JButton jButton = new JButton("submit");
        jPanel.add(jButton);
        jFrame.add(jPanel);
        jButton.addActionListener(e -> {
            jPanel.setBackground(Color.GRAY);
            jButton.setText("apply");
            jFrame.setSize(new Dimension(100, 100));
        });


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
