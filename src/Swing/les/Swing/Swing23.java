package Swing.les.Swing;


import javax.swing.*;
import java.awt.*;

public class Swing23 {
    private static JFrame jFrame = getJFrame();
    private static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        JButton jButton = new JButton("show dialog");
        jPanel.add(jButton);
        jButton.addActionListener(e -> new MyDialog(jFrame, "Swing23", true).setVisible(true));



    }

    static private class  MyDialog extends JDialog {
        private MyDialog(JFrame owner, String title, boolean modal) {
            super(owner, title, modal);
            add(new JButton("Yes"), BorderLayout.WEST);
            add(new JLabel("What you a doing?"), BorderLayout.EAST);
            setBounds(500, 500, 500, 200);

        }
    }


    private static JFrame getJFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Swing23");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension d = toolkit.getScreenSize();
        jFrame.setBounds(d.width / 2 - 250, d.height / 2 - 250, 500, 500);
        jFrame.setVisible(true);
        return jFrame;
    }
}
