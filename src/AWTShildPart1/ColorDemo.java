package AWTShildPart1;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by petrovski on 22.03.2017.
 */
public class ColorDemo extends Applet {
public void paint (Graphics g) {
    Color c1 = new Color(255, 100, 100);
    Color c2 = new Color(100, 255, 100);
    Color c3 = new Color(100, 100, 255);

    setBackground(Color.black);

    g.setColor(c1);
    g.drawLine(0, 0, 100, 20);

    g.setColor(c2);
    g.drawLine(10, 10, 100, 30);

    g.setColor(c3);
    g.drawLine(20, 20, 100, 40);

}
}
