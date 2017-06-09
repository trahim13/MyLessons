package AWT;


import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageInputStream;
import javax.imageio.stream.ImageOutputStream;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

public class AWT9 {
    public static void main(String[] args) throws IOException {
        File file = new File("6784023.jpg");
        BufferedImage bufferedImage = ImageIO.read(file);
        ImageIO.write(bufferedImage, "png", new File("new Image.png"));


        String[] format = ImageIO.getReaderFileSuffixes();
        for(String a : format) System.out.println(a);


        ImageReader reader = null;
        Iterator<ImageReader> itr = ImageIO.getImageReadersByFormatName("PNG");
        if(itr.hasNext()) reader = itr.next();

        InputStream inputStream = new FileInputStream("new Image.png");
        ImageInputStream imageInputStream = ImageIO.createImageInputStream(inputStream);
//        ImageInputStream imageInputStream1 = ImageIO.createImageInputStream(new File("new Image.png"));
        reader.setInput(imageInputStream, true);
        BufferedImage bufferedImage1 = reader.read(0);

        ImageIO.write(bufferedImage1, "png", new File("ImageInputStream.png"));


//        int count = reader.getNumThumbnails(0);
//        BufferedImage bufferedImage2 = reader.readThumbnail(0, count);
//        System.out.println(reader.getHeight(0) + reader.getWidth(0));

        ImageWriter writer = null;
        Iterator<ImageWriter> itr1 = ImageIO.getImageWritersByFormatName("JPG");
        while(itr1.hasNext()) writer = itr1.next();

        ImageOutputStream imageOutputStream = ImageIO.createImageOutputStream(new File("ImageOutputStream.jpg"));
        writer.setOutput(imageOutputStream);
        writer.write(bufferedImage1);

    }
}
