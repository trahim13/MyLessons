package AWT;


import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageInputStream;
import javax.imageio.stream.ImageOutputStream;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class AWT10 {
    public static void main(String[] args) throws IOException {
        ImageReader reader = null;
        Iterator<ImageReader> itr = ImageIO.getImageReadersByFormatName("JPG");
        while(itr.hasNext()) reader = itr.next();

        ImageInputStream imageInputStream = ImageIO.createImageInputStream(new FileInputStream(new File("6784023.jpg")));
        reader.setInput(imageInputStream, true);
        BufferedImage image = reader.read(0);

        WritableRaster raster = image.getRaster();
        for (int i = 0; i < raster.getWidth(); i++) {
            int[] pixel = raster.getPixel(i, 0, new int[4]);
            pixel[0] = 255;
            pixel[1] = 255;
            pixel[2] = 255;
            raster.setPixel(i,0,pixel);
        }

        image.setData(raster);
        //
//        raster.getPixels(0, 0, image.getWidth(), image.getHeight(), new int[4 * image.getWidth() * image.getHeight()]);
//        raster.setPixels(0,0,image.getWidth(), image.getHeight(), new int[4 * image.getWidth() * image.getHeight()]);
        //

//        Object data = raster.getDataElements(0, 0, null);
//        ColorModel colorModel = image.getColorModel();
//        Color color = new Color(colorModel.getRGB(data));
//        raster.setDataElements(0, 0, data);
        //


        ImageWriter writer = null;
        Iterator<ImageWriter> itr1 = ImageIO.getImageWritersByFormatName("jpg");
        while(itr1.hasNext()) writer = itr1.next();

        ImageOutputStream imageOutputStream = ImageIO.createImageOutputStream(new File("AWT10.jpg"));
        writer.setOutput(imageOutputStream);
        writer.write(image);


    }
}
