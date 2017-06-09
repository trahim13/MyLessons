package JavaFX;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;




public class FX3 extends Application {
    public static void main(String[] args) {
      Application.launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root,400,400);

        Text text = new Text(0, 100, "Hello from JavaFX FX3.class");
        text.setStroke(Color.BLACK);
        text.setFill(Color.WHITE);
        text.setFont(Font.font(50));

        root.getChildren().add(text);

        primaryStage.setTitle("Hello JavaFX FX1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
