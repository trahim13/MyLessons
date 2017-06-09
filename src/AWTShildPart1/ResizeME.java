package AWTShildPart1;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by petrovski on 22.03.2017.
 */
public class ResizeME extends Applet {
    final int inc = 25;
    int max = 500;
    int min = 10;
    Dimension d;

    public ResizeME() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                int w = (d.width + inc) > max ? min : (d.width + inc);
                int h = (d.height + inc) > max ? min : (d.height + inc);
                setSize(new Dimension(w, h));


            }
        });
    }

    public void paint(Graphics g) {
        d = getSize();
        g.drawLine(0, 0, d.width - 1, d.height - 1);
        g.drawLine(0, d.height - 1, d.width - 1, 0);
        g.drawRect(0, 0, d.width - 1, d.height - 1);
    }
}
