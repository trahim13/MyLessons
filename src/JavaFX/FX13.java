package JavaFX;

import com.aquafx_project.AquaFx;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class FX13 extends Application {
    public static void main(String[] args) {
        launch();

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Application.setUserAgentStylesheet(STYLESHEET_CASPIAN);
//       AquaFx.style();

        Parent context = FXMLLoader.load(getClass().getResource("FX13.fxml"));
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(context);

        Group group = new Group();
        group.getChildren().addAll(borderPane);
        Scene scene = new Scene(group, 600, 600);

        primaryStage.setTitle("FX13");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
