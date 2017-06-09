package AWTShildPart1;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by petrovski on 22.03.2017.
 */
public class XORDemo extends Applet {
    int chsX = 100;
    int chsY = 100;

    public XORDemo() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseMoved (MouseEvent e) {
                int x = e.getX();
                int y = e.getY();

                chsX = x - 10;
                chsY = y - 10;

                repaint();
            }

            public void mousePressed (MouseEvent e) {
                int x = e.getX();
                int y = e.getY();

                chsX = x - 10;
                chsY = y - 10;

                repaint();
            }
        });
    }

    public void paint(Graphics g) {
        g.drawLine(0, 0, 100, 100);
        g.drawLine(0, 100, 100, 0);
        g.setColor(Color.blue);
        g.drawLine(40, 25, 250, 180);
        g.drawLine(75, 90, 400, 400);
        g.setColor(Color.green);
        g.drawRect(10, 10, 60, 50);
        g.fillRect(100, 10, 60, 50);

        g.setXORMode(Color.black);
        g.drawLine(chsX - 10, chsY, chsX + 10, chsY);
        g.drawLine(chsX, chsY - 10, chsX, chsY + 10);
        g.setPaintMode();


    }
}
