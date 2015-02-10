package parts;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import fopramodel.FoPra;

public class FoPraBasisController {

	/*
	 * TODO Startdatum in die Vergangenheit legen Warnungsfeld
	 * TODO Dokumentieren
	 */

	// Das zu betrachtende FoPaSystem
	FoPra myfopra;

	HashMap<String, String> status;

	@FXML
	private Button bt_Plus;

	@FXML
	private Button bt_Minus;

	@FXML
	private Label lb_von;

	@FXML
	private DatePicker dp_end;

	@FXML
	private Button bt_Speichern;

	@FXML
	private ComboBox<String> cb_status;

	@FXML
	private TextField tf_maxB;

	@FXML
	private DatePicker dp_start;

	@FXML
	private TextArea ta_beschreibung;

	@FXML
	private TextField tf_titel;

	@FXML
	private Label lb_bis;

	@FXML
	private AnchorPane ap_Root;

	@FXML
	private Button bt_SpeichernNeu;

	@FXML
	void bt_Plus_Click(ActionEvent event) {
		if (tf_maxB.getText() == "") {
			tf_maxB.setText("0");
		}
		int anzahl = Integer.parseInt(tf_maxB.getText());
		anzahl += 1;

		tf_maxB.setText(String.valueOf(anzahl));
	}

	@FXML
	void bt_Minus_Click(ActionEvent event) {
		if (tf_maxB.getText() == "") {
			tf_maxB.setText("0");
		}
		int anzahl = Integer.parseInt(tf_maxB.getText());
		if (anzahl > 0) {
			anzahl -= 1;

			tf_maxB.setText(String.valueOf(anzahl));
		}
	}

	@FXML
	void bt_Speichern_Click(ActionEvent event) {
		updateUI();
	}

	@FXML
	void bt_SpeichernNeu_Click(ActionEvent event) {

	}

	@FXML
	public void initialize() {
		// ComboBox optionen setzen
		ObservableList<String> options = FXCollections.observableArrayList(
				"Abgeschlossen", "Abgebrochen", "In Bearbeitung", "Offen");
		cb_status.setItems(options);

		status = new HashMap<String, String>();
		status.put("pending", "Offen");
		status.put("inprocess", "In Bearbeitung");
		status.put("completed", "Abgeschlossen");
		status.put("cancelled", "Abgebrochen");

		dp_start.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent t) {
				checkDate();
			}
		});
		dp_end.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent t) {
				checkDate();
			}
		});

	}

	public void updateUI() {
		// Start des FoPras
		if (myfopra == null) {
			System.out.println("Error FoPra empty");
		} else {
			clearComponents();

			if (myfopra.getStart() != null) {

				// Formatieren des Datum
				LocalDate von = DatetoLocalDate(myfopra.getStart());
				lb_von.setText(LocalDatetoString(von));
				dp_start.setValue(von);
			}

			// Ende des FoPras

			if (myfopra.getEnd() != null) {

				// Formatieren des Datum
				LocalDate end = DatetoLocalDate(myfopra.getStart());
				lb_bis.setText(LocalDatetoString(end));
				dp_end.setValue(end);
			}

			tf_maxB.setText(String.valueOf(myfopra.getMaxNumberOfStudents()));
			tf_titel.setText(myfopra.getTitle());
			ta_beschreibung.setText(myfopra.getDescription());
			cb_status.setValue(status.get(myfopra.getStatus().toString()));

		}
	}

	private void clearComponents() {
		lb_bis.setText("");
		lb_von.setText("");
		tf_titel.clear();
		ta_beschreibung.clear();
		tf_maxB.clear();

	}

	void checkDate() {
		if (myfopra.getStart() == null && dp_start.getValue() != null) {
			myfopra.setStart(LocaleDatetoDate(dp_start.getValue()));
		}
		if (myfopra.getEnd() == null && dp_end.getValue() != null) {
			myfopra.setEnd(LocaleDatetoDate(dp_end.getValue()));
		}
		// Testen ob das End Datum vor dem Startdatum ist
		if (!((myfopra.getStart() == null) || (myfopra.getEnd() == null))) {
			if (dp_end.getValue().isBefore(dp_start.getValue())) {
				dp_end.setValue(dp_start.getValue().plusDays(1));

			}
			updateTime();
		}

	}

	void updateTime() {
		lb_von.setText(LocalDatetoString(dp_start.getValue()));
		lb_bis.setText(LocalDatetoString(dp_end.getValue()));
	}

	String LocalDatetoString(LocalDate date) {
		return date.getDayOfMonth() + "." + date.getMonthValue() + "."
				+ date.getYear();
	}

	@SuppressWarnings("deprecation")
	Date LocaleDatetoDate(LocalDate date) {
		int day = date.getDayOfMonth();
		int month = date.getMonthValue();
		int year = date.getYear();

		return new Date(year, month, day);

	}

	@SuppressWarnings("deprecation")
	LocalDate DatetoLocalDate(Date date) {
		int day = date.getDay();
		int month = date.getMonth();
		int year = date.getYear() + 1900;

		return LocalDate.of(year, month, day);
	}
}
