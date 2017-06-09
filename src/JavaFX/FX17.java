package JavaFX;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Side;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;



public class FX17 extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ObservableList<PieChart.Data> dataChart = FXCollections.observableArrayList(
                new PieChart.Data("Apple", 25),
                new PieChart.Data("Oranges", 12),
                new PieChart.Data("Plums", 33),
                new PieChart.Data("Pears", 10),
                new PieChart.Data("Any", 10)
        );

        PieChart pieChart = new PieChart(dataChart);
        pieChart.setTitle("Fruits");
        pieChart.setLegendSide(Side.RIGHT);
//        pieChart.setLabelsVisible(false);

        pieChart.setLabelLineLength(48);


        Label label = new Label("");
        label.setId("myLabel");




        for ( PieChart.Data data : pieChart.getData()) {
            data.getNode().addEventHandler(MouseEvent.MOUSE_MOVED,
                    e -> {
                        label.setTranslateX(e.getSceneX());
                        label.setTranslateY(e.getSceneY());
                        label.setText(String.valueOf(data.getPieValue()) + "% " + data.getName());
                    });
        }

        Group group = new Group();
        group.getChildren().addAll(pieChart, label);

        Scene scene = new Scene(group, 600, 600);
        scene.getStylesheets().add((getClass().getResource("FX17_css.css")).toExternalForm());




        
        
        primaryStage.setTitle("FX17");
        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.show();


    }
}
