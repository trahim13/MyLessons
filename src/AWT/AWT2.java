package AWT;


import javax.swing.*;
import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class AWT2 {
    public static void main(String[] args) {
        JFrame jFrame = getJFrame();
        jFrame.add(new MyComponent());
    }

    static class MyComponent extends JComponent {
        @Override
        public void paint(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            Area area = new Area(new Rectangle2D.Double(0, 0, 100, 100));
//            area.add(new Area(new Ellipse2D.Double(25, 25, 150, 150)));
//            area.subtract(new Area(new Ellipse2D.Double(25, 25, 150, 150)));
//            area.intersect(new Area(new Ellipse2D.Double(25, 25, 150, 150)));
            area.exclusiveOr(new Area(new Ellipse2D.Double(25, 25, 150, 150)));
            g2.fill(area);
        }
    }


    public static JFrame getJFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("AWT2");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension d = toolkit.getScreenSize();
        jFrame.setBounds(d.width / 2 - 350, d.height / 2 - 250, 700, 500);
        jFrame.setVisible(true);
        return jFrame;
    }
}
