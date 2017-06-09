package JavaFX;

import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javax.imageio.ImageIO;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FX10 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Image image = new Image(new FileInputStream("C:\\Users\\petrovski\\IdeaProjects\\JavaLessons\\imageBLOG.jpg"));
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(200);
        imageView.setFitWidth(200);

//        PixelReader pixelReader = image.getPixelReader();
//        for (int i = 0; i < image.getHeight(); i++) {
//            for (int j = 0; j < image.getWidth(); j++) {
//                Color c = pixelReader.getColor(i, j);
//            }
//        }

        WritableImage writableImage = new WritableImage((int) image.getWidth(), (int) image.getHeight());
        PixelWriter pixelWriter = writableImage.getPixelWriter();
        for (int i = 0; i < image.getWidth(); i++) {
            for (int j = 0; j < image.getHeight(); j++) {
                pixelWriter.setColor(i, j, Color.RED);
            }
        }
        ImageIO.write(SwingFXUtils.fromFXImage(writableImage, null), "png", new FileOutputStream("FX10.png"));
        Group group = new Group();
        group.getChildren().addAll(new ImageView(writableImage));
        Scene scene = new Scene(group, 500, 500);

        primaryStage.setTitle("FX10");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
