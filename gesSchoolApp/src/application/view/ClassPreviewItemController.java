package application.view;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class ClassPreviewItemController implements Initializable {
    @FXML
    private ImageView class_preview;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        class_preview.setImage(new Image("resources/images/plc.png"));
    }
}
