package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	private AnchorPane mypane;

	@Override
	public void start(Stage primaryStage) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Layouts.fxml"));

		mypane = (AnchorPane) loader.load();

		primaryStage.setTitle("App");
		primaryStage.setScene(new Scene(mypane));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
