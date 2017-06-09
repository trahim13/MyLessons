package AWT;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;


public class AWT7 {
    public static void main(String[] args) {
        JFrame jFrame = getJFrame();
        jFrame.add(new MyComponent());
    }

    static class MyComponent extends JComponent {
        @Override
        public void paint(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;

            Rectangle2D rectangle2D = new Rectangle2D.Double(0, 0, 200, 100);
            Ellipse2D ellipse2D = new Ellipse2D.Double(100, 50, 100, 100);
//            g2.setComposite(AlphaComposite.SrcAtop);
            g2.setColor(new Color(30, 255, 100, 90));


            g2.fill(rectangle2D);
            g2.setColor(new Color(100,100,100, 80));
            g2.fill(ellipse2D);

        }
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
