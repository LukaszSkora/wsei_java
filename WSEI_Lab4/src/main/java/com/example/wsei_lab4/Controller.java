package com.example.wsei_lab4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    public Slider amplitudeSlider;
    @FXML
    public Slider freqSlider;
    @FXML
    public Slider phaseSlider;
    @FXML
    public Slider offsetSlider;
    @FXML
    public CategoryAxis categoryAxis;
    @FXML
    public NumberAxis numberAxis;
    @FXML
    public LineChart<CategoryAxis, NumberAxis> lineChart;
    @FXML
    public TextField promienWalca;
    @FXML
    public TextField wysokoscWalca;
    @FXML
    public TextField gruboscBlachy;
    @FXML
    public TextField cenaBlachyStalowej;
    @FXML
    public TextField cenaBlachyNierdzewnej;
    @FXML
    public Label ciezarWalca;
    @FXML
    public Label kosztStalowa;
    @FXML
    public Label kosztNierdzewna;
    @FXML
    public Button obliczKoszt;
    @FXML
    public TextField wagaBlachy;

    @FXML
    public void suwakChanged(MouseEvent event) {
        regenSin();
    }

    @FXML
    private XYChart.Series series;

    public void initialize() {
        series = new XYChart.Series<>();
        series.setName("sin");
        lineChart.getData().add(series);
    }

    private void regenSin() {
        series.getData().clear();
        for (int i = 0; i < 200; i++) {
            series.getData().add(new XYChart.Data("" + i, amplitudeSlider.getValue()
                    * Math.sin(2.0 * Math.PI * Math.toRadians(i) * freqSlider.getValue()
                    - Math.toRadians(phaseSlider.getValue()))
                    + offsetSlider.getValue()));
        }
    }

    public void oblicz(ActionEvent actionEvent) {
        Double promienWalcaD = Double.valueOf(promienWalca.getText());
        Double wysokoscWalcaD = Double.valueOf(wysokoscWalca.getText());
        Double gruboscBlachyD = Double.valueOf(gruboscBlachy.getText());
        Double cenaBlachyStalowejD = Double.valueOf(cenaBlachyStalowej.getText());
        Double cenaBlachyNierdzewnejD = Double.valueOf(cenaBlachyNierdzewnej.getText());
        Double wagaBlachyD = Double.valueOf(wagaBlachy.getText());

        double poleWalca = ( 2.0 * Math.PI * promienWalcaD * promienWalcaD ) + ( 2 * Math.PI * promienWalcaD * wysokoscWalcaD );
        double ciezarWalcaD = poleWalca * gruboscBlachyD * wagaBlachyD;
        double kosztStalowaD = poleWalca * gruboscBlachyD * cenaBlachyStalowejD;
        double kosztNierdzewnaD = poleWalca * gruboscBlachyD * cenaBlachyNierdzewnejD;

        ciezarWalca.setText(String.format("%.2f", ciezarWalcaD));
        kosztStalowa.setText(String.format("%.2f", kosztStalowaD));
        kosztNierdzewna.setText(String.format("%.2f", kosztNierdzewnaD));
    }
}