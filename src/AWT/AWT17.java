package AWT;


import javax.swing.*;
import java.awt.*;

public class AWT17 {
    public static void main(String[] args) {
        JFrame jFrame = getJFrame();
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);

        JTextField jTextField = new JTextField(10);
        JTextField jTextField1 = new JTextField(10);
        jTextField.setDragEnabled(true);
        jTextField1.setDragEnabled(true);

        jPanel.add(jTextField);
        jPanel.add(jTextField1);
        jPanel.revalidate();
    }

    public static JFrame getJFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("AWT7");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension d = toolkit.getScreenSize();
        jFrame.setBounds(d.width / 2 - 350, d.height / 2 - 250, 700, 500);
        jFrame.setVisible(true);
        return jFrame;
    }
}
