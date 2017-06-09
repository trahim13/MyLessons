package AWT;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;


public class AWT5 {
    public static void main(String[] args) {
        JFrame jFrame = getJFrame();
        jFrame.add(new MyComponent());
    }

    static class MyComponent extends JComponent {
        @Override
        public void paint(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;

            Rectangle2D rectangle2D = new Rectangle2D.Double(300, 300, 200, 200);
            g2.scale(0.3, 0.3);
//            g2.rotate(45);
            g2.translate(-300,-300);
            g2.shear(0.1, 0.4);


            g2.fill(rectangle2D);
        }
    }


    public static JFrame getJFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("AWT5");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension d = toolkit.getScreenSize();
        jFrame.setBounds(d.width / 2 - 350, d.height / 2 - 250, 700, 500);
        jFrame.setVisible(true);
        return jFrame;
    }
}
