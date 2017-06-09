package Swing.les.Swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by root on 27.03.2017.
 */
public class Swing17 {
   static JFrame jFrame = getJFrame();
   static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        //flouLayayt
//        jFrame.add(jPanel);
//        jPanel.add(new JButton("one"));
//        jPanel.add(new JButton("two"));
//        jPanel.add(new JButton("three"));
//        jPanel.add(new JButton("four"));
//        jPanel.add(new JButton("five"));

//        jFrame.add(new Button("one"), BorderLayout.CENTER);
//        jFrame.add(new Button("two"), BorderLayout.NORTH);
////        jFrame.add(new Button("three"), BorderLayout.SOUTH);
//        jFrame.add(new Button("four"), BorderLayout.EAST);
//        jFrame.add(new Button("five"), BorderLayout.WEST);

        jFrame.add(jPanel);
        jPanel.setLayout(new GridLayout(3, 3));
        jPanel.add(new JButton("one"));
        jPanel.add(new JButton("two"));
        jPanel.add(new JButton("three"));
        jPanel.add(new JButton("four"));
        jPanel.add(new JButton("five"));
        jPanel.add(new JButton("six"));



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
