package csci2020u.lab04;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RegistrationForm extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(RegistrationForm.class.getResource("registrationform-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 300);
        primaryStage.setTitle("Registration Form");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {

        launch(args);

    }

}
