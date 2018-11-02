package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.Desejos;

public class DesejosController extends Controller<Desejos> implements Initializable {

	private Desejos desejos;

	@FXML
	private TextField tfDesejo;

	@FXML
	private Button btCancelar;

	@FXML
	private Button btSalvar;

	@FXML
	private TableView<Desejos> tbDesejos;

	@FXML
	private TableColumn<Desejos, Integer> tcId;

	@FXML
	private TableColumn<Desejos, String> tcDesejo;

	/*
	 * @FXML private TableColumn<Des, ?> tcStatus;
	 */

	@FXML
	private Button btAtualizar;

	@FXML
	private Button btLimpar;

	@FXML
	private RadioButton rbAguardando;

	@FXML
	private RadioButton rbRealizado;

	@FXML
	private RadioButton rbNaoRealizado;

	@FXML
	void handleAtualizar(ActionEvent event) {

	}

	@FXML
	void handleLimpar(ActionEvent event) {

	}

	@FXML
	void handleCancelar(ActionEvent event) {
		System.exit(0);

		atualizarBotoes();
	}

	@FXML
	void handleSalvar(ActionEvent event) {

		getDesejos().setDesejo(tfDesejo.getText());

		tbDesejos.getItems().add(desejos);

		super.save(getDesejos());

		handleCancelar(event);

	}

	private void atualizarBotoes() {
		btSalvar.setDisable(getDesejos().getId() != null);
		btCancelar.setDisable(getDesejos().getId() == null);

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		// setando o focus no text field cpf
		tfDesejo.requestFocus();

		/*tcId.setCellValueFactory(new PropertyValueFactory<>("id"));

		tcDesejo.setCellValueFactory(new PropertyValueFactory<>("desejo"));
*/
	}

	public Desejos getDesejos() {
		if (desejos == null)
			desejos = new Desejos();
		return desejos;
	}

	public void setDesejos(Desejos desejos) {
		this.desejos = desejos;
	}
}
