package com.bellis.finance;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.chart.PieChart;

import java.io.IOException;

public class PieController {

    @FXML
    PieChart piechart;

    public void iniitialize(ActionEvent event){
        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                        new PieChart.Data("Grapefruit", 13),
                        new PieChart.Data("Oranges", 25),
                        new PieChart.Data("Plums", 10),
                        new PieChart.Data("Pears", 22),
                        new PieChart.Data("Apples", 30));
        final PieChart chart = new PieChart(pieChartData);
        chart.setTitle("Asset Allocation");
        chart.setData(pieChartData);
    }
    @FXML
    private void switchToPrimary() throws IOException {

        App.setRoot("secondary");
    }
}
