package AWTShildPart1;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by petrovski on 22.03.2017.
 */
public class GraphicsDemo extends Applet {
    public void paint(Graphics g) {
//        g.drawLine(10, 10, 200, 100);
//        g.drawRect(20, 20, 19, 20);
//        g.fillRect(50, 50, 30, 60);
//        g.drawRoundRect(100, 60, 50, 30, 1, 15);
//        g.fillRoundRect(100, 80, 100, 150, 50, 50);
//        g.drawOval(150, 150, 100, 100);
        g.drawArc(10, 350, 70, 70, 0, 180);
        g.fillArc(100, 350, 70, 70, 0, 180);
    }

}
