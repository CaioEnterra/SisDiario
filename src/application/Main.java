package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("/view/diario.fxml"));
		
		Scene scene = new Scene(root, 750, 600);
		
		primaryStage.setTitle("Escrever Anota��es Diarias");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}