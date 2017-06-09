package JavaFX;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class FX12 extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group group = new Group();

        Parent content = FXMLLoader.load(getClass().getResource("myFXMLFX12.fxml"));
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(content);

        group.getChildren().addAll(borderPane);

        Scene scene = new Scene(group, 500, 500);

        primaryStage.setTitle("FX12");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
