package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Botones {
	@FXML
	private Button die;

	@FXML
	private Stage sendStage;

	private Main mainApp;

	public Botones() {
		super();
	}

	@FXML
	private void handleClose() {
		System.exit(0);
	}

	public void showSendProfile() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("Escenario.fxml"));
			AnchorPane page = (AnchorPane) loader.load();
			sendStage = new Stage();
			sendStage.setTitle("Send Profile");
			Scene scene = new Scene(page);
			sendStage.setScene(scene);
			sendStage.show();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
