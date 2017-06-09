package JavaFX;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class FX14 extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent context = FXMLLoader.load(getClass().getResource("FX14.fxml"));
        BorderPane borderPane = new BorderPane();
        borderPane.getChildren().add(context);

        Group group = new Group();
        group.getChildren().add(borderPane);

        Scene scene = new Scene(group, 500, 500);

        primaryStage.setTitle("FX14");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
