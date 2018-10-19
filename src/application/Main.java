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
		
		Parent root = FXMLLoader.load(getClass().getResource("/view/cadastroPessoa.fxml"));
		
		Scene scene = new Scene(root, 600, 600);
		
		primaryStage.setTitle("Cadastro Cidade");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}