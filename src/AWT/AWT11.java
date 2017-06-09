package AWT;


import javax.imageio.ImageIO;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.io.File;
import java.io.IOException;


public class AWT11 {
    public static void main(String[] args) throws IOException {
        File f = new File("6784023.jpg");
        BufferedImage bufferedImage = ImageIO.read(f);

        BufferedImage bufferedImage1 = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), bufferedImage.getType());
        AffineTransform trasform = AffineTransform.getRotateInstance(45, bufferedImage.getWidth() / 2, bufferedImage.getHeight() / 2);
        BufferedImageOp op = new AffineTransformOp(trasform, AffineTransformOp.TYPE_BILINEAR);
        op.filter(bufferedImage, bufferedImage1);

        ImageIO.write(bufferedImage1, "jpg", new File("AWT11.jpg"));
    }
}
