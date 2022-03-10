package csci2020u.lab05;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StudentRecord extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(StudentRecord.class.getResource("studentrecord-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 300);
        primaryStage.setTitle("Student Record");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {

        launch(args);

    }
}


