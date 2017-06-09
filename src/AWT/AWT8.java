package AWT;


import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class AWT8 {
    public static void main(String[] args) {
        JFrame jFrame = getJFrame();
        jFrame.add(new MyComponent());
    }

    static class MyComponent extends JComponent {
        @Override
        public void paint(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;

            Ellipse2D ellipse2D = new Ellipse2D.Double(50, 50, 100, 100);
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.draw(ellipse2D);

            RenderingHints renderingHints = new RenderingHints(null);
            renderingHints.put(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_DEFAULT);
            g2.setRenderingHints(renderingHints);
            g2.draw(new Ellipse2D.Double(150, 50, 100, 100));

        }
    }


    public static JFrame getJFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("AWT8");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension d = toolkit.getScreenSize();
        jFrame.setBounds(d.width / 2 - 350, d.height / 2 - 250, 700, 500);
        jFrame.setVisible(true);
        return jFrame;
    }
}
