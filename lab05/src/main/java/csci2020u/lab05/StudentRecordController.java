package csci2020u.lab05;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import java.net.URL;
import java.util.ResourceBundle;

public class StudentRecordController implements Initializable {
    
    public TableView<DataSource> studentRecordTable;
    public TableColumn<DataSource, String> colSID;
    public TableColumn<DataSource, Float> colAssignments;
    public TableColumn<DataSource, Float> colMidterm;
    public TableColumn<DataSource, Float> colFinalExam;
    public TableColumn<DataSource, Float> colFinalMark;
    public TableColumn<DataSource, String> colLetterGrade;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        colSID.setCellValueFactory(new PropertyValueFactory<>("StudentID"));
        colAssignments.setCellValueFactory(new PropertyValueFactory<>("AssignmentMark"));
        colMidterm.setCellValueFactory(new PropertyValueFactory<>("MidtermMark"));
        colFinalExam.setCellValueFactory(new PropertyValueFactory<>("FinalExamMark"));
        colFinalMark.setCellValueFactory(new PropertyValueFactory<>("FinalMark"));
        colLetterGrade.setCellValueFactory(new PropertyValueFactory<>("LetterGrade"));
        studentRecordTable.setItems(marks);
    }

    ObservableList<DataSource> marks = FXCollections.observableArrayList(
            new DataSource("100100100", 75.0f, 68.0f, 54.25f, 62.525f, "C"),
            new DataSource("100100101", 70.0f, 69.25f, 51.5f, 60.525f, "C"),
            new DataSource("100100102", 100.0f, 97.0f, 92.5f, 95.35f, "A"),
            new DataSource("100100103", 90.0f, 88.5f, 68.75f, 78.925f, "B"),
            new DataSource("100100104", 72.25f, 74.75f, 58.25f, 66.0f, "C"),
            new DataSource("100100105", 85.0f, 56.0f, 62.5f, 65.05f, "C"),
            new DataSource("100100106", 70.0f, 66.5f, 61.75f, 64.825f, "C"),
            new DataSource("100100107", 55.0f, 47.0f, 50.5f, 50.35f, "D"),
            new DataSource("100100108", 40.0f, 32.5f, 27.75f, 31.625f, "F"),
            new DataSource("100100109", 82.5f, 77.0f, 74.25f, 76.725f, "B")
    );

}

