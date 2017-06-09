package JavaFX;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FX13_1 extends Application {
    public static void main(String[] args) {
        launch();

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
//        Application.setUserAgentStylesheet(getClass().getResource("mystyle.css").toExternalForm());
        
        Button button = new Button("Button");
        button.setId("my-button");

        Button button1 = new Button("Root button");

        Tooltip tooltip = new Tooltip("My slyle CSS");

        Button button2 = new Button("My style CSS");
        button2.getStyleClass().add("mysamestyle");
        button2.setTooltip(tooltip);

        Button button3 = new Button("4 Button");
        button3.setStyle("" +
                "-fx-font-size: 16 pt;\n" +
                "-fx-font-family: \"Courier New\";\n" +
                "-fx-base: rgb(132, 145, 47);\n" +
                "-fx-background: rgb(225, 228, 203);\n");

        VBox vBox = new VBox();
        vBox.getChildren().addAll(button, button1,button2, button3);

        Group group = new Group();
        group.getChildren().addAll(vBox);
        Scene scene = new Scene(group, 500, 500);
        scene.getStylesheets().add((getClass().getResource("mystyle.css").toExternalForm()));

        primaryStage.setTitle("FX13_1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
