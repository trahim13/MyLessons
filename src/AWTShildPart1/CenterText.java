package AWTShildPart1;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by petrovski on 22.03.2017.
 */
public class CenterText extends Applet {
    final Font f = new Font("Dialog", Font.BOLD, 22);

    public void drawCentrText(String s, int w, int h, Graphics g) {FontMetrics fm = g.getFontMetrics();
        int x = (w - fm.stringWidth(s)) / 2;

        int y = (fm.getAscent() + (h - (fm.getAscent() + fm.getDescent())) / 2);
        g.drawString(s, x, y);

    }

    public void paint(Graphics g) {
        Dimension d = getSize();
        g.setColor(Color.white);
        g.fillRect(0, 0, d.width, d.height);
        g.drawRect(0, 0, d.width - 2, d.height - 2);
        g.setColor(Color.black);
        g.setFont(f);
        drawCentrText("This text is centrered.", d.width, d.height, g);
//        drawCentrText("Other text.", d.width, d.height, g);


    }

    public Font getF() {
        return f;
    }
}
