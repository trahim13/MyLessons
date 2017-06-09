package JavaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;

import javafx.scene.Node;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Cylinder;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

public class FX18 extends Application {
    final   double sceneWidth = 600;
    final double sceneHeight = 600;
    double mouseXold = 0;
    double mouseYold = 0;
    final double cameraYlimit = 15;
    final double rotateModifier = 25;
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        PerspectiveCamera camera = new PerspectiveCamera();
        camera.setFarClip(500);
        camera.setTranslateZ(-1000);

        Cylinder cylinder = new Cylinder(50, 100);

        PhongMaterial orangeMaterial = new PhongMaterial();
        orangeMaterial.setSpecularColor(Color.ORANGE);
        orangeMaterial.setDiffuseColor(Color.DARKORANGE);

        cylinder.setMaterial(orangeMaterial);

        cylinder.setRotationAxis(Rotate.X_AXIS);
        cylinder.setRotate(45);

        Group group = new Group();
        group.getChildren().add(cylinder);
        Scene scene = new Scene(group, 500, 500);
        scene.setCamera(camera);
        scene.setFill(Color.BLACK);

//        scene.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent event) {
//                Node picked = event.getPickResult().getIntersectedNode();
//                if (null != picked) {
//                    double scalar = 2;
//                    if (picked.getScaleX() > 1) {
//                        scalar = 1;
//                    }
//                    picked.setScaleX(scalar);
//                    picked.setScaleY(scalar);
//                    picked.setScaleZ(scalar);
//
//                }
//            }
//        });

        double cameraModifaer = 50.0;
        double cameraQ = 10.0;

        scene.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                double change = cameraQ;
                if (event.isShiftDown()) {
                    change = cameraModifaer;
                }

                KeyCode keycode = event.getCode();

                if (keycode == KeyCode.W) {
                    camera.setTranslateZ(camera.getTranslateZ() + change);
                }
                if (keycode == KeyCode.S) {
                    camera.setTranslateZ(camera.getTranslateZ() - change);
                }

                if (keycode == KeyCode.A) {
                    camera.setTranslateX(camera.getTranslateX() + change);

                }

                if (keycode == KeyCode.D) {
                    camera.setTranslateX(camera.getTranslateX() - change);

                }

            }
        });



        Rotate xRotate = new Rotate(0, 0, 0, 0, Rotate.X_AXIS);
        Rotate yRotate = new Rotate(0, 0, 0, 0, Rotate.Y_AXIS);

        camera.getTransforms().addAll(xRotate, yRotate);
        scene.addEventHandler(MouseEvent.ANY, event ->  {
            if (event.getEventType() == MouseEvent.MOUSE_PRESSED || event.getEventType() == MouseEvent.MOUSE_DRAGGED) {
                double mouseXnew = event.getSceneX();
                double mouseYney = event.getSceneY();
                if (event.getEventType() == MouseEvent.MOUSE_DRAGGED) {
                    double pitchRotate = xRotate.getAngle() + (mouseXnew - mouseXold) / rotateModifier;
                    pitchRotate = pitchRotate > cameraYlimit ? cameraYlimit: pitchRotate;
                    pitchRotate = pitchRotate < -cameraYlimit ? -cameraYlimit : pitchRotate;
                    xRotate.setAngle(pitchRotate);

                    double yawRotate = yRotate.getAngle() - (mouseXnew - mouseXold) / rotateModifier;
                    yRotate.setAngle(yawRotate);

                }
                mouseXold = mouseXnew;
                mouseYold = mouseYney;
            }



        });

        primaryStage.setTitle("FX18: 3D");
        primaryStage.sizeToScene();
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
