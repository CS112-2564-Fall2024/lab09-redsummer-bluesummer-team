package cs112.lab09.controllers;

import cs112.lab09.RedSummer;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Modality;

import java.io.IOException;

import static cs112.lab09.Constants.*;

public class MapController {

    @FXML
    private void handleSanFranciscoButton() throws IOException {
        openEventWindow(HISTORICAL_DATA[0]);
    }

    @FXML
    private void handleBisbeeButton() throws IOException {
        openEventWindow(HISTORICAL_DATA[1]);
    }

    private void openEventWindow(String[] eventData) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(RedSummer.class.getResource(CITY_VIEW_RESOURCE));
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        Scene scene = new Scene(fxmlLoader.load());

        // Use CityController to manage the city view
        CityController controller = fxmlLoader.getController();
        controller.initData(eventData); // Pass event data to the CityController

        stage.setScene(scene);
        stage.setTitle(CITY_VIEW_TITLE);
        stage.show();
    }
}