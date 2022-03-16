package csci2020u.midtermquestion;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import javafx.animation.Animation;
import javafx.util.Duration;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;


public class SHPandAnimationController implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Rectangle rect;

    @FXML
    private Label studentName;

    @FXML
    private Label studentEmail;

    @FXML
    private Label softwareDescription;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        TranslateTransition transition = new TranslateTransition();
        transition.setDuration(Duration.seconds(2));
        transition.setNode(rect);
        transition.setAutoReverse(true);
        transition.setCycleCount(Animation.INDEFINITE);
        transition.setToX(400);

        transition.play();

    }

    public void doAnimation(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("animationScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        System.out.println("Animation button pressed");

    }

    public void doGraphics(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("graphicsScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        System.out.println("2D Graphics button pressed");

    }

    public void doAbout(ActionEvent event) throws IOException, ParserConfigurationException, SAXException {
        Parent root = FXMLLoader.load(getClass().getResource("aboutPageScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        File file = new File(Objects.requireNonNull(SHPandAnimationController.class.getResource("aboutPageInfo.xml")).getPath());
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = dbFactory.newDocumentBuilder();
        Document document = docBuilder.parse(file);
        document.getDocumentElement().normalize();


        String software_desc = document.getElementsByTagName("software-description").item(0).getTextContent().trim();
        String student_name = document.getElementsByTagName("name").item(0).getTextContent().trim();
        String student_email = document.getElementsByTagName("email").item(0).getTextContent().trim();

        System.out.println("About button pressed");
        System.out.println(student_name);
        System.out.println(student_email);
        System.out.println(software_desc);

    }

    public void goToMain(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("mainScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        System.out.println("Went back to main");

    }

}
