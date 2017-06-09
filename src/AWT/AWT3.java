package AWT;


import javax.swing.*;
import java.awt.*;

import java.awt.geom.Line2D;


public class AWT3 {
    public static void main(String[] args) {
        JFrame jFrame = getJFrame();
        jFrame.add(new MyComponent());
    }

    static class MyComponent extends JComponent {
        @Override
        public void paint(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
//            g2.setStroke(new BasicStroke(10f));
//            g2.setStroke(new BasicStroke(10f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
            g2.setStroke(new BasicStroke(10f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 30f,new float []{10,10,10,20,20,30,40,50}, 0));

            g2.draw(new Line2D.Double(0, 0, 500, 120));

        }
    }


    public static JFrame getJFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("AWT3");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension d = toolkit.getScreenSize();
        jFrame.setBounds(d.width / 2 - 350, d.height / 2 - 250, 700, 500);
        jFrame.setVisible(true);
        return jFrame;
    }

}
