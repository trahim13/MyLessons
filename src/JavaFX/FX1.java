package JavaFX;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class FX1 extends Application {
    public static void main(String[] args) {
        Application.launch();

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group group = new Group();
        Scene scene = new Scene(group, 400,300);


        primaryStage.setTitle("Hello Word!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
