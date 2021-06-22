package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Controller {


    @FXML
    private ImageView imageView;




    Image myImage = new Image(getClass().getResourceAsStream("image2.jpg"));
    Image myImage1 = new Image(getClass().getResourceAsStream("image1.jpg"));

    public void displayImage(){
        if (imageView.getImage() == myImage1){
            imageView.setImage(myImage);

        }else{
            imageView.setImage(myImage1);

        }
    }
}
