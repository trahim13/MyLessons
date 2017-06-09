package JavaFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.web.HTMLEditor;
import javafx.stage.Stage;

public class FX6 extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
//        BorderPane borderPane = new BorderPane();
//        borderPane.setBottom(new Button("Same button"));
//        borderPane.setMinWidth(200);
//        borderPane.setMinHeight(150);
//
//        Group group = new Group();
//        group.getChildren().addAll(borderPane);
//
//        Scene scene = new Scene(group, 400, 300);
//
//        primaryStage.setTitle("FX6");
//        primaryStage.setScene(scene);
//        primaryStage.show();


        HBox hbox = new HBox();
        Tooltip tooltip = new Tooltip("button whith tooltip");

        Button button = new Button("Tooltip");
        button.setTooltip(tooltip);

        button.setOnAction(e -> System.out.println("Same action"));

        HTMLEditor htmlEditor = new HTMLEditor();

        hbox.getChildren().addAll(new Button("Same button1"), new Button("Same button2"), new TextField(), button, htmlEditor);
        hbox.setSpacing(10);
        hbox.setPadding(new Insets(5));

        Group group = new Group();
        group.getChildren().add(hbox);
        Scene scene = new Scene(group, 500, 500);

        primaryStage.setTitle("FX6 HBox");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
