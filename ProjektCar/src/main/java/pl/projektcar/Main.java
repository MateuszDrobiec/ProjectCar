package pl.projektcar;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import pl.projektcar.utils.FxmlUtils;

public class Main extends Application{

    public static final String FXML_STRONA_GLOWNA_FXML = "/fxml/StronaGlowna.fxml";

    public static void main(String[] args){launch((args)); }

    @Override
    public void start(Stage primaryStage) throws Exception {

    Pane anchorPane = FxmlUtils.fxmlLoader(FXML_STRONA_GLOWNA_FXML);

    Scene scene = new Scene(anchorPane);
    primaryStage.setScene(scene);

    primaryStage.setTitle("Applikacja");
    primaryStage.show();
    }
}
