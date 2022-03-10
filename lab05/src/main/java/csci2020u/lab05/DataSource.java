package csci2020u.lab05;

import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleStringProperty;

public class DataSource {

    private SimpleStringProperty studentID;
    private SimpleFloatProperty assignmentMark;
    private SimpleFloatProperty midtermMark;
    private SimpleFloatProperty finalExamMark;
    private SimpleFloatProperty finalMark;
    private SimpleStringProperty letterGrade;

    public DataSource(String studentID, float assignmentMark, float midtermMark, float finalExamMark, float finalMark, String letterGrade) {
        this.studentID = new SimpleStringProperty(studentID);
        this.assignmentMark = new SimpleFloatProperty(assignmentMark);
        this.midtermMark = new SimpleFloatProperty(midtermMark);
        this.finalExamMark = new SimpleFloatProperty(finalExamMark);
        this.finalMark = new SimpleFloatProperty(finalMark);
        this.letterGrade = new SimpleStringProperty(letterGrade);
    }

    public String getStudentID() {
        return studentID.get();
    }

    public void setStudentID(String studentID) {
        this.studentID = new SimpleStringProperty(studentID);
    }

    public float getAssignmentMark() {
        return assignmentMark.get();
    }

    public void setAssignmentMark(float assignmentMark) {
        this.assignmentMark = new SimpleFloatProperty(assignmentMark);
    }

    public float getMidtermMark() {
        return midtermMark.get();
    }

    public void setMidtermMark(float midtermMark) {
        this.midtermMark = new SimpleFloatProperty(midtermMark);
    }

    public float getFinalExamMark() {
        return finalExamMark.get();
    }

    public void setFinalExamMark(float finalExamMark) {
        this.finalExamMark = new SimpleFloatProperty(finalExamMark);
    }

    public float getFinalMark() {
        return finalMark.get();
    }

    public void setFinalMark(float finalMark) {
        this.finalMark = new SimpleFloatProperty(finalMark);
    }

    public String getLetterGrade() {
        return letterGrade.get();
    }

    public void setLetterGrade(String letterGrade) {
        this.letterGrade.set(letterGrade);
    }

}
