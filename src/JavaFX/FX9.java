package JavaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FX9 extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox vBox = new VBox();
        vBox.setPadding(new Insets(10));
        vBox.setSpacing(5);

        Button button = new Button("First");
        Button button2 = new Button("Second");
        Button button3 = new Button("Thread");
button.setOnAction(new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        System.out.println("button");
    }
});

button2.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        System.out.println("button2");

    }
});
        vBox.getChildren().addAll(button, button2, button3);

button3.setOnAction(e -> System.out.println("button3"));


        Group group = new Group();
        group.getChildren().addAll(vBox);
        Scene scene = new Scene(group, 500, 500);

        primaryStage.setTitle("FX9");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
