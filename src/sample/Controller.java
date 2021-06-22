package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Controller {


    @FXML
    private CheckBox chechkBox;

    @FXML
    private ImageView imageView;

    @FXML
    private Label label;

    Image myImage = new Image(getClass().getResourceAsStream("turnoff.jpg"));
    Image myImage1 = new Image(getClass().getResourceAsStream("turnon.jpg"));


    public void change(ActionEvent event) {
        if (chechkBox.isSelected()) {
            imageView.setImage(myImage1);
            label.setText("ON");
        } else {
            imageView.setImage(myImage);
            label.setText("OFF");
        }
    }
}
