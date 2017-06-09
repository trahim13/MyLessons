package Swing.les.Swing;


import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.net.MalformedURLException;
import java.net.URL;

public class Swing2 {
    public static void main(String[] args) {
        JFrame jFrame = getJFrame();
        jFrame.add(new MyJComponent());

//        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
//        String[] f = ge.getAvailableFontFamilyNames();
//        for (String a : f) {
//            System.out.println(a);
//        }


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

    static class MyJComponent extends JComponent {
        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            Font f = new Font("Arial Black", Font.BOLD, 20);
            g2.setFont(f);
            g2.drawString("My First text in Swing application", 10, 20);
            Line2D l1 = new Line2D.Double(30, 30, 100, 100);
            g2.draw(l1);
            Point2D p1 = new Point2D.Double(40, 40);
            Point2D p2 = new Point2D.Double(150, 100);
            Line2D l2 = new Line2D.Double(p1, p2);
            g2.setColor(Color.green);
            g2.draw(l2);
            g2.setPaint(Color.yellow);
            Ellipse2D e1 = new Ellipse2D.Double(100, 100, 100, 100);
            g2.fill(e1);
            Rectangle2D r1 = new Rectangle2D.Double();
            r1.setFrameFromDiagonal(p1, p2);
            g2.setColor(Color.black);
            g2.draw(r1);


            URL url = null;
            try {
                url = new URL("http://d3gnp09177mxuh.cloudfront.net/tech-page-images/java.png");
                Image in = new ImageIcon(url).getImage();
                g2.drawImage(in, 200, 200, null);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }



        }
    }

}
