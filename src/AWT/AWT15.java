package AWT;


import javax.print.DocFlavor;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class AWT15 {
    public static void main(String[] args) throws InterruptedException, IOException, UnsupportedFlavorException {
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection stringSelection = new StringSelection("same text for clipboard");
        clipboard.setContents(stringSelection, null);

        Thread.sleep(10_000);

        DataFlavor flavor = DataFlavor.stringFlavor;
        if (clipboard.isDataFlavorAvailable(flavor)) {
            System.out.println(clipboard.getData(flavor));
        }
    }
}
