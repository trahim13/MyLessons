package JavaFX;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class FX14_Controller implements Initializable {
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    @FXML
    public void printButtonTop() {
        System.out.println("Press button top");

    }
    @FXML
    public void printButtonCentr() {
        System.out.println("Press button center");

    }
}
