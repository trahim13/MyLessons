package Swing.les.Swing;



import javax.swing.*;
import java.awt.*;

public class Swing22 {

   private static JFrame jFrame = getJFrame();
   private static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        JButton jButton = new JButton("my button with dialog window");
       // jButton.addActionListener(e -> JOptionPane.showMessageDialog(jPanel, "this is show window dialog", "title", JOptionPane.QUESTION_MESSAGE));
//        jButton.addActionListener(e -> JOptionPane.showConfirmDialog(jPanel, "Please choose one of this is buttons","title", JOptionPane.OK_OPTION ));
//        jButton.addActionListener(e -> JOptionPane.showOptionDialog(jPanel, "What do you want", "title", JOptionPane.CLOSED_OPTION,JOptionPane.QUESTION_MESSAGE, null, new Object[]{"one", "two", "three"}, "three"));
        jButton.addActionListener(e -> JOptionPane.showInputDialog(jPanel, "You is serios?", "title", JOptionPane.QUESTION_MESSAGE));

        jPanel.add(jButton);
    }

    static public JFrame getJFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Swing22");
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension d = toolkit.getScreenSize();
        jFrame.setBounds(d.width / 2 - 250, d.height / 2 - 250, 500, 500);
        return jFrame;
    }

}
