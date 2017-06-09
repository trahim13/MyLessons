package AWT;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.io.IOException;
import java.net.URL;


public class AWT4 {
    public static void main(String[] args) {
        JFrame jFrame = getJFrame();
        jFrame.add(new MyComponent());
    }

    static class MyComponent extends JComponent {
        @Override
        public void paint(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            Ellipse2D ellipse2D = new Ellipse2D.Double(0,0,300,300);
//            g2.setPaint(Color.red);
//            g2.setPaint(new GradientPaint(0,0, Color.green, 300,300, Color.yellow));
            try {
                g2.setPaint(new TexturePaint(ImageIO.read(new URL("https://2ch.hk/fl/arch/2016-11-27/src/222887/14672399970380.png")), new Rectangle2D.Double(0,0,25,25)));
            } catch (IOException e) {
                e.printStackTrace();
            }
            g2.fill(ellipse2D);

        }
    }


    public static JFrame getJFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("AWT4");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension d = toolkit.getScreenSize();
        jFrame.setBounds(d.width / 2 - 350, d.height / 2 - 250, 700, 500);
        jFrame.setVisible(true);
        return jFrame;
    }
}
