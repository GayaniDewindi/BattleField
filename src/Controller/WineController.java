package Controller;

import javafx.collections.transformation.TransformationList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import Class.*;

public class WineController implements Initializable {


    public Label lblScour;
    public Label lblWingngTeam;

    public void OnActionPlayAgain(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../FXML/ReaduToWeponsFrom.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        int a=A_play.getScore();
        int b=B_play.getScore();
        if (a>b){
            lblWingngTeam.setText("A");
            lblScour.setText(String.valueOf(a));
        }else {
            lblWingngTeam.setText("B");
            lblScour.setText(String.valueOf(b));
        }
    }
}
