package AWTShildPart1;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by petrovski on 22.03.2017.
 */
public class SampleFont extends Applet {
    int next = 0;
    Font f;
    String msg;

    public void init() {
        f = new Font("Dialog", Font.PLAIN, 12);
        msg = "Dialog";
        setFont(f);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                next++;
                switch (next) {
                    case 0:
                        f = new Font("Dialog", Font.PLAIN, 12);
                        msg = "Dialog";
                        break;
                    case 1:
                        f = new Font("Serif", Font.PLAIN, 12);
                        msg = "Serif";
                        break;

                }
                if (next == 1) {
                    next = -1;
                }

                setFont(f);
                repaint();
            }
        });



    }
    public void paint(Graphics g) {
        g.drawString(msg, 4, 20);
        Font f = g.getFont();

        String fontName = f.getName();
        int fontSize = f.getSize();
        int fontStule = f.getStyle();

        String msg = "Имя" + fontName + " Размер " + fontSize + "  Стиль " + fontStule;

        if (fontStule == Font.PLAIN) {

            msg += " Обычный (нормальный).";

        }

        showStatus(msg);
        g.drawString(msg, 4, 40);

    }
}
