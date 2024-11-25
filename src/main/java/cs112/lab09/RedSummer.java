package cs112.lab09;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import static cs112.lab09.Constants.*;

public class RedSummer extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(RedSummer.class.getResource(MAIN_VIEW_RESOURCE));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.setTitle(MAIN_VIEW_TITLE);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}