package gui;

import java.util.Locale;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewController {

	@FXML
	private TextField txtFirtNumber;
	
	@FXML
	private TextField txtSecondNumber;
	
	@FXML
	private Label labelResult;
	
	@FXML
	private Button btSum;
	
	@FXML
	private Button btSubtraction;
	
	@FXML
	private Button btMultiplication;
	
	@FXML
	private Button btDivision;
	
	@FXML
	public void onBtSumAction() {
		try {
			Locale.setDefault(Locale.US);
			double firstNumber = Double.parseDouble(txtFirtNumber.getText());
			double secondtNumber = Double.parseDouble(txtSecondNumber.getText());
			double sum = firstNumber + secondtNumber;

			labelResult.setText(String.format("%.2f", sum));
		} catch (NumberFormatException e) {
			Alerts.showAlert("Error", "Parse Error", e.getMessage(), AlertType.ERROR);
		}
	}

	@FXML
	public void onBtSubtractionAction() {
		try {
			Locale.setDefault(Locale.US);
			double firstNumber = Double.parseDouble(txtFirtNumber.getText());
			double secondtNumber = Double.parseDouble(txtSecondNumber.getText());
			double sum = firstNumber - secondtNumber;

			labelResult.setText(String.format("%.2f", sum));
		} catch (NumberFormatException e) {
			Alerts.showAlert("Error", "Parse Error", e.getMessage(), AlertType.ERROR);
		}
	}

	@FXML
	public void onBtbtMultiplicationAction() {
		try {
			Locale.setDefault(Locale.US);
			double firstNumber = Double.parseDouble(txtFirtNumber.getText());
			double secondtNumber = Double.parseDouble(txtSecondNumber.getText());
			double sum = firstNumber * secondtNumber;

			labelResult.setText(String.format("%.2f", sum));
		} catch (NumberFormatException e) {
			Alerts.showAlert("Error", "Parse Error", e.getMessage(), AlertType.ERROR);
		}
	}

	@FXML
	public void onBtDivisionAction() {
		try {
			Locale.setDefault(Locale.US);
			double firstNumber = Double.parseDouble(txtFirtNumber.getText());
			double secondtNumber = Double.parseDouble(txtSecondNumber.getText());
			double sum = firstNumber / secondtNumber;

			labelResult.setText(String.format("%.2f", sum));
		} catch (NumberFormatException e) {
			Alerts.showAlert("Error", "Parse Error", e.getMessage(), AlertType.ERROR);
		}
	}
}
