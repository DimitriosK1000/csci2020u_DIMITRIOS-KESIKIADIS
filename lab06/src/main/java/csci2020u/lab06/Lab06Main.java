package csci2020u.lab06;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Lab06Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(Lab06Main.class.getResource("Lab06-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 550);
        primaryStage.setTitle("Bar and Pie Graph");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {

        launch(args);

    }

}
