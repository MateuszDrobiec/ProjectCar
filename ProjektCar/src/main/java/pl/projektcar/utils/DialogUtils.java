package pl.projektcar.utils;

import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;

import java.util.ResourceBundle;

public class DialogUtils {

    private static ResourceBundle bundle = FxmlUtils.getResourceBundle();

    public static void errorDialog(String error) {
        Alert errorAlert = new Alert(Alert.AlertType.ERROR);
        errorAlert.setTitle(bundle.getString("exit.title"));
        errorAlert.setHeaderText(bundle.getString("exti.heater"));

        TextArea textArea = new TextArea(error);
        errorAlert.getDialogPane().setContent(textArea);

        errorAlert.showAndWait();
    }


}
