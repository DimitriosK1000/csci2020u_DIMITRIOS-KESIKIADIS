package csci2020u.lab07;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Lab07Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(Lab07Main.class.getResource("Lab07-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 450);
        primaryStage.setTitle("Weather Warnigns Pie Chart");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {

        launch(args);

    }

}
