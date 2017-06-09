package JavaFX;

import javafx.application.Application;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;

import javax.swing.*;
import java.awt.*;


public class FX21_SwingAndFX  {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("FX21_SwingAndFX");
        JFXPanel jfxPanel = new JFXPanel();
        jFrame.add(jfxPanel);

        jFrame.setSize(new Dimension(300, 200));
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);





        Button button = new Button("press");
        Group group = new Group();
        group.getChildren().addAll(button);
        Scene scene = new Scene(group, 300, 200, Color.GREEN);
        jfxPanel.setScene(scene);
    }

}
