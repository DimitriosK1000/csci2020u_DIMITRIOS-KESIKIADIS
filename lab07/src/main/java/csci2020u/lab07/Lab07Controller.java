package csci2020u.lab07;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import java.io.*;
import java.util.Objects;

public class Lab07Controller {

    @FXML
    private PieChart pieChart;

    public void initialize() {

        File file = new File(Objects.requireNonNull(Lab07Controller.class.getResource("weatherwarnings-2015.csv")).getPath());

        try {
            String data;

            BufferedReader bf = new BufferedReader(new FileReader(file));

            int fflood_data = 0;
            int thunderstorm_data = 0;
            int spmarine_data = 0;
            int tornado_data = 0;

            while ((data = bf.readLine()) != null) {

                String[] warning_num = data.split(",");

                String type_of_warning = warning_num[5];

                switch (type_of_warning) {
                    case "FLASH FLOOD":
                        fflood_data++;
                        break;

                    case "SEVERE THUNDERSTORM":
                        thunderstorm_data++;
                        break;

                    case "SPECIAL MARINE":
                        spmarine_data = 0;
                        break;

                    case "TORNADO":
                        tornado_data++;
                        break;

                }
            }

            ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                    new PieChart.Data("Flash Floods", fflood_data),
                    new PieChart.Data("Severe Thunderstorms", thunderstorm_data),
                    new PieChart.Data("Special Marines", spmarine_data),
                    new PieChart.Data("Tornados", tornado_data)
            );

            pieChart.setData(pieChartData);

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();

        }

    }

}
