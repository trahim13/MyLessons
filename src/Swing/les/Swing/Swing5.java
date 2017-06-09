package Swing.les.Swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by petrovski on 22.03.2017.
 */
public class Swing5 {
    public static void main(String[] args) throws Exception {
//        UIManager.LookAndFeelInfo[] LoAndFe = UIManager.getInstalledLookAndFeels();
//        for (UIManager.LookAndFeelInfo a : LoAndFe) {
//            System.out.println(a.getName());
//            System.out.println(a.getClassName());
//
//        }

        JFrame jFrame = getJFrame();
        JPanel jPanel = new JPanel();
        JButton j1 = new JButton("Metal");
        JButton j2 = new JButton("Nimbus");
        JButton j3 = new JButton("Motif");
        JButton j4 = new JButton("Windows");
        JButton j5 = new JButton("Windows Classic");
        jPanel.add(j1);
        jPanel.add(j2);
        jPanel.add(j3);
        jPanel.add(j4);
        jPanel.add(j5);
        jFrame.add(jPanel);

        j1.addActionListener(e -> {
            try {
                UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            } catch (Exception e1) {}

        });

        j2.addActionListener(e -> {
            try {
                UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            } catch (Exception e1) {}

        });

        j3.addActionListener(e -> {
            try {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
            } catch (Exception e1) {}

        });

        j4.addActionListener(e -> {
            try {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            } catch (Exception e1) {}

        });

        j4.addActionListener(e -> {
            try {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
            } catch (Exception e1) {}

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
