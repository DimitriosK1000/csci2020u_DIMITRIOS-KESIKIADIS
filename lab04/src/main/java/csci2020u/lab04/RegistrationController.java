package csci2020u.lab04;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.time.format.DateTimeFormatter;

public class RegistrationController {

    @FXML
    public TextField usernameField;

    @FXML
    public DatePicker datePickerField;

    @FXML
    public TextField passwordField;

    @FXML
    public TextField fullNameField;

    @FXML
    public TextField emailField;

    @FXML
    public TextField phoneNumField;

    @FXML
    public Button doRegistrationButtonPressed;

    @FXML
    protected void doRegistrationButtonPressed() {

        System.out.println("Username: " + usernameField.getText());
        System.out.println("Password: " + passwordField.getText());
        System.out.println("Full Name: " + fullNameField.getText());
        System.out.println("Email: " + emailField.getText());
        System.out.println("Phone Number: " + phoneNumField.getText());
        System.out.println("Date: " + datePickerField.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));

        Stage stage = (Stage) doRegistrationButtonPressed.getScene().getWindow();
        System.out.println("Button pressed");
        stage.close();

    }

}
