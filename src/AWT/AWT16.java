package AWT;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class AWT16 {
    public static void main(String[] args) throws IOException, UnsupportedFlavorException, InterruptedException {
        Clipboard clipBoard = Toolkit.getDefaultToolkit().getSystemClipboard();
        Image image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        Graphics g = image.getGraphics();
        g.fillOval(0, 0, 100, 100);
        ImageTransferable tr = new ImageTransferable(image);
        clipBoard.setContents(tr, null);
        Thread.sleep(10_000);

        DataFlavor flavor = DataFlavor.imageFlavor;
        if (clipBoard.isDataFlavorAvailable(flavor)) {
            System.out.println(clipBoard.getData(flavor));

        }


    }

    static class ImageTransferable implements Transferable {
        Image image;



        public ImageTransferable(Image image) {
            this.image = image;
        }

        @Override
        public DataFlavor[] getTransferDataFlavors() {
            return new DataFlavor[]{DataFlavor.imageFlavor};
        }

        @Override
        public boolean isDataFlavorSupported(DataFlavor flavor) {
            return flavor.equals(DataFlavor.imageFlavor);
        }

        @Override
        public Object getTransferData(DataFlavor flavor) throws UnsupportedFlavorException, IOException {
            if(flavor.equals(DataFlavor.imageFlavor)) return image;
            else throw new UnsupportedFlavorException(flavor);
        }
    }

}
