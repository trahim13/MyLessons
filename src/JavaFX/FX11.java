package JavaFX;

import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.FileInputStream;


public class FX11 extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Image image = new Image(new FileInputStream("C:\\Users\\petrovski\\IdeaProjects\\JavaLessons\\imageBLOG.jpg"));
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(300);
        imageView.setFitHeight(300);

        FadeTransition fadeTransition = new FadeTransition(Duration.millis(1000), imageView);
        fadeTransition.setFromValue(1);
        fadeTransition.setToValue(0.0);
        fadeTransition.setCycleCount(FadeTransition.INDEFINITE);
        fadeTransition.setAutoReverse(true);
        fadeTransition.play();


        Rectangle rectangle = new Rectangle(50, 25);

        KeyValue keyValueX = new KeyValue(rectangle.xProperty(), 100);
        KeyValue keyValueY = new KeyValue(rectangle.yProperty(), 150);

        KeyFrame keyFrame = new KeyFrame(Duration.millis(3000), keyValueX, keyValueY);

        Timeline timeline = new Timeline();
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.setAutoReverse(true);
        timeline.getKeyFrames().addAll(keyFrame);
        timeline.play();

        Rectangle rectangle2 = new Rectangle(30, 30);
        rectangle2.setFill(Color.ORANGE);

        Path path = new Path();
        path.getElements().add(new MoveTo(10, 50));
        path.getElements().add(new CubicCurveTo(380, 0, 380, 120, 200, 120));
        path.getElements().add(new CubicCurveTo(0, 120, 0, 240, 380, 240));

        PathTransition pathTransition = new PathTransition();
        pathTransition.setDuration(Duration.millis(3000));
        pathTransition.setCycleCount(PathTransition.INDEFINITE);
        pathTransition.setAutoReverse(true);
        pathTransition.setPath(path);
        pathTransition.setNode(rectangle2);
        pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pathTransition.play();

        Rectangle rectangle3 = new Rectangle(10,200,50,50);
        rectangle3.setFill(Color.DARKBLUE);
        rectangle3.setArcHeight(15);
        rectangle3.setArcWidth(15);
        rectangle3.setTranslateX(50);
        rectangle3.setTranslateY(75);

        FadeTransition fadeTransition1 = new FadeTransition(Duration.millis(2000), rectangle3);
        fadeTransition1.setFromValue(1);
        fadeTransition1.setToValue(0.4);
        fadeTransition1.setAutoReverse(true);
        fadeTransition1.setCycleCount(2);
//        fadeTransition1.play();

        TranslateTransition translateTransition = new TranslateTransition(Duration.millis(2000), rectangle3);
        translateTransition.setFromX(50);
        translateTransition.setToX(350);
//        translateTransition.setFromY(150);
//        translateTransition.setToY(300);
        translateTransition.setCycleCount(2);
        translateTransition.setAutoReverse(true);
//        translateTransition.play();

        RotateTransition rotateTransition = new RotateTransition(Duration.millis(1000), rectangle3);
        rotateTransition.setByAngle(180);
        rotateTransition.setCycleCount(2);
        rotateTransition.setAutoReverse(true);
//        rotateTransition.play();

        ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(2000), rectangle3);
        scaleTransition.setToX(2f);
        scaleTransition.setToY(2f);
        scaleTransition.setCycleCount(2 );
        scaleTransition.setAutoReverse(true);
//        scaleTransition.play();

//        ParallelTransition parallelTransition = new ParallelTransition();
//        parallelTransition.getChildren().addAll(
//                fadeTransition1, translateTransition, rotateTransition, scaleTransition
//        );
//
//        parallelTransition.setCycleCount(PathTransition.INDEFINITE);
//        parallelTransition.setAutoReverse(true);
//        parallelTransition.play();

        SequentialTransition sequentialTransition = new SequentialTransition();
        sequentialTransition.getChildren().addAll(fadeTransition1, translateTransition, rotateTransition, scaleTransition);
        sequentialTransition.setCycleCount(SequentialTransition.INDEFINITE);
        sequentialTransition.setAutoReverse(true);
        sequentialTransition.play();

        Group group = new Group();
        group.getChildren().addAll(imageView,rectangle, rectangle2, rectangle3);


        Scene scene = new Scene(group, 500, 500);

        primaryStage.setTitle("Java FX: FX11");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

