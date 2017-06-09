package JavaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.AudioEqualizer;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.util.Duration;


import java.beans.EventHandler;
import java.io.File;
import java.net.URI;

public class FX15 extends Application {
    public static void main(String[] args) {
        launch();

       }

    @Override
    public void start(Stage primaryStage) throws Exception {
        File f = new File("C:\\Users\\petrovski\\IdeaProjects\\JavaLessons\\src\\JavaFX\\sound.mp3");
        URI u = f.toURI();
        String s = u.toString();

        Media media = new Media(s);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(false);
        MediaView mediaView = new MediaView(mediaPlayer);





        BorderPane borderPane = new BorderPane();
        Button button = new Button("Play");
        button.setOnAction(new javafx.event.EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mediaPlayer.play();
            }
        });

        Button button1 = new Button("Pause");
        button1.addEventHandler(ActionEvent.ACTION, new javafx.event.EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mediaPlayer.pause();
                Duration d = mediaPlayer.getCurrentTime();
                System.out.println(d);
            }
        });



        borderPane.setCenter(button);
        borderPane.setLeft(button1);
        Group group = new Group();
        group.getChildren().addAll(borderPane);

        Scene scene = new Scene(group, 500, 500);
        ((Group) scene.getRoot()).getChildren().add(mediaView);
        primaryStage.setTitle("FX15");
        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.show();
    }
}

