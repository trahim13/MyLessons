package AWT;


import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

public class AWT12 {
    public static void main(String[] args) throws PrinterException {
        Printable printable = new Printable() {
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                if (pageIndex == 0) {
                    Graphics2D g2 = (Graphics2D) graphics;
                    g2.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
                    Line2D line = new Line2D.Double(0, 0, 200, 100);
                    g2.draw(line);
                    return PAGE_EXISTS;
                }
                return NO_SUCH_PAGE;
            }
        };

        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(printable);
        if (job.printDialog()) {
            job.print();
        }
    }
}
