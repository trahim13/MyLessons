package AWT;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class AWT1 {



    public static void main(String[] args) {
        JFrame jFrame = getJFrame();
        jFrame.add(new MyComponent());
    }

    static class MyComponent extends JComponent {
        @Override
        public void paint(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            Point2D point1 = new Point2D.Double(0, 50);
            Point2D point2 = new Point2D.Double(100, 0);
            Line2D line2D = new Line2D.Double(0, 0, 100, 30);
            g2.draw(line2D);
            g2.draw(new Line2D.Double(point1, point2));

            Rectangle2D rectangle2D = new Rectangle2D.Double(200, 0, 150, 100);
            g2.draw(rectangle2D);

            RoundRectangle2D roundRectangle2D = new RoundRectangle2D.Double(350, 0, 150, 100, 30, 30);
            g2.draw(roundRectangle2D);

            Ellipse2D ellipse2D = new Ellipse2D.Double(500, 0, 140, 30);
            g2.draw(ellipse2D);

            QuadCurve2D quadCurve2D = new QuadCurve2D.Double(0, 150, 50, 300, 100, 150);
            g2.draw(quadCurve2D);

            CubicCurve2D cubicCurve2D = new CubicCurve2D.Double(110, 150, 160, 180, 210, 120, 310, 150);
            g2.draw(cubicCurve2D);

            Arc2D arc2D = new Arc2D.Double(320, 150, 200, 200, 90, 90, Arc2D.PIE);
            g2.draw(arc2D);

            GeneralPath generalPath = new GeneralPath();
            generalPath.moveTo(0, 300);
            generalPath.lineTo(100, 300);
            generalPath.quadTo(150, 400, 200, 300);
            generalPath.curveTo(250, 350, 350, 250, 450, 300);
            generalPath.closePath();
            g2.draw(generalPath);

        }
    }

    public static JFrame getJFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("AWT1");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension d = toolkit.getScreenSize();
        jFrame.setBounds(d.width / 2 - 350, d.height / 2 - 250, 700, 500);
        jFrame.setVisible(true);
        return jFrame;
    }
}
