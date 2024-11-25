package cs112.lab09.controllers;

import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class CityController {

    @FXML
    private Label locationLabel;

    @FXML
    private Label descriptionLabel;

    @FXML
    private Label revisedDescriptionLabel;

    @FXML
    private ImageView eventImageView;

    private RevisedHistoricalEvent event;

    /**
     * Initializes the data for the event popup view.
     *
     * @param eventData An array containing event information: image, location, description, revised description, and citation.
     */
    public void initData(String[] eventData) {
        // Create a RevisedHistoricalEvent object using event data
        event = new RevisedHistoricalEvent(eventData);

        // Populate the labels and image view
        locationLabel.setText(event.getLocation());
        descriptionLabel.setText(event.getDescription());
        revisedDescriptionLabel.setText(event.getRevisedDescription());
        eventImageView.setImage(new Image(event.getImageName()));
    }

    /**
     * Closes the popup window when the close button is clicked.
     */
    @FXML
    public void handleCloseButton() {
        Stage stage = (Stage) locationLabel.getScene().getWindow();
        stage.close();
    }
}