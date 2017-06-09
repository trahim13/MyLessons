package AWTShildPart1;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by petrovski on 22.03.2017.
 */
public class MultiLine extends Applet {
    int curX = 0;
    int curY = 0;

    public void init() {
        Font f = new Font("SansSerif", Font.BOLD, 14);
        setFont(f);
    }

    public void paint(Graphics g) {
        FontMetrics fm = g.getFontMetrics();
        nexLine("Same text", g);
        nexLine("Anather other text", g);
        samLine("Same text in thaer line", g);
        nexLine("What's a fuck in this line", g);
    }

    void nexLine(String s , Graphics g) {
        FontMetrics fm = g.getFontMetrics();
        curY += fm.getHeight();
        curX = 0;
        g.drawString(s, curX, curY);
        curX = fm.stringWidth(s);
    }

    void samLine(String s, Graphics g) {
        FontMetrics fm = g.getFontMetrics();
        g.drawString(s, curX+4, curY);
        curX += fm.stringWidth(s);
    }
}
