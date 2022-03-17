package csci2020u.lab06;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;

import java.net.URL;
import java.util.ResourceBundle;

public class Lab06Controller implements Initializable {

    @FXML
    private PieChart pieChart;

    @FXML
    private BarChart barChart;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        // pie chart
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("18-25", 648),
                new PieChart.Data("26-35", 1021),
                new PieChart.Data("36-45", 2453),
                new PieChart.Data("46-55", 3173),
                new PieChart.Data("56-65", 1868),
                new PieChart.Data("66-75", 2247)
        );

        pieChart.setData(pieChartData);

        // bar chart
        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Housing");
        series1.getData().add(new XYChart.Data("2010", 247381.0));
        series1.getData().add(new XYChart.Data("2011", 264171.4));
        series1.getData().add(new XYChart.Data("2012", 287715.3));
        series1.getData().add(new XYChart.Data("2013", 294736.1));
        series1.getData().add(new XYChart.Data("2014", 308431.4));
        series1.getData().add(new XYChart.Data("2015", 322635.9));
        series1.getData().add(new XYChart.Data("2016", 340253.0));
        series1.getData().add(new XYChart.Data("2017", 363153.7));


        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Commercial");
        series2.getData().add(new XYChart.Data("2010", 1121585.3));
        series2.getData().add(new XYChart.Data("2011", 1219479.5));
        series2.getData().add(new XYChart.Data("2012", 1246354.2));
        series2.getData().add(new XYChart.Data("2013", 1295364.8));
        series2.getData().add(new XYChart.Data("2014", 1335932.6));
        series2.getData().add(new XYChart.Data("2015", 1472362.0));
        series2.getData().add(new XYChart.Data("2016", 1583521.9));
        series2.getData().add(new XYChart.Data("2017", 1613246.3));

        barChart.getData().addAll(series1, series2);

    }

}
