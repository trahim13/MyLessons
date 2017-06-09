package Swing.les.Swing;

import javax.swing.*;
import java.awt.*;



public class Swing25 {
    private static JFrame jFrame = getJFrame();
    private static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        JButton jButton = new JButton("Choose color");
        jButton.addActionListener(e -> {
            Color color = JColorChooser.showDialog(jPanel, "Color choose", Color.black);
            jPanel.setBackground(color);

            });
        jPanel.add(jButton);
        jPanel.revalidate();

    }

    private static JFrame getJFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Swing24");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension d = toolkit.getScreenSize();
        jFrame.setBounds(d.width / 2 - 250, d.height / 2 - 250, 500, 500);
        jFrame.setVisible(true);
        return jFrame;

    }
}
