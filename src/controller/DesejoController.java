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
import javafx.scene.control.cell.PropertyValueFactory;
import model.Desejo;


public class DesejoController extends Controller<Desejo> implements Initializable {

	private Desejo desejo;
    @FXML
    private TextField tfDesejo;

    @FXML
    private RadioButton rbAguardando;

    @FXML
    private RadioButton rbRealizado;

    @FXML
    private RadioButton rbNaoRealizado;

    @FXML
    private TableView<Desejo> tvListDesejos;

    @FXML
    private TableColumn<Desejo,Integer> tcId;

    @FXML
    private TableColumn<Desejo, String> tcDesejo;

    @FXML
    private Button btSalvar;

    @FXML
    private Button btAtualizar;

    @FXML
    private Button btCancelar;

    @FXML
    private Button btLimpar;

    @FXML
    void handleAtualizar(ActionEvent event) {

    }

    @FXML
    void handleCancelar(ActionEvent event) {
    	//tfCpf.setText("");
    	System.exit(0);

		atualizarBotoes();

    }

    @FXML
    void handleLimpar(ActionEvent event) {

    }

    @FXML
    void handleSalvar(ActionEvent event) {
    	getDesejo().setDescricao(tfDesejo.getText());

		tvListDesejos.getItems().add(desejo);

		super.save(getDesejo());

	//	handleCancelar(event);
    }

    @Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		// setando o focus no text field cpf
		tfDesejo.requestFocus();

		tcId.setCellValueFactory(new PropertyValueFactory<>("id"));

		tcDesejo.setCellValueFactory(new PropertyValueFactory<>("descricao"));

	}
		    
	  

	/*
    @FXML
    void handleAdicionarTelefone(ActionEvent event) {
    	Telefone tel = new Telefone();
    	tel.setCodigoArea(tfCodigoArea.getText());
    	tel.setNumero(tfNumero.getText());
    	tel.setPessoa(pessoa);
    	
    	if (getPessoa().getListaTelefone() == null)
    		getPessoa().setListaTelefone(new ArrayList<Telefone>());
    	
    	getPessoa().getListaTelefone().add(tel);
    	
    	// atualizando a interface
    	tbTelefone.setItems(FXCollections.observableList(getPessoa().getListaTelefone()));
    	
    	// limpando os campos
    	tfCodigoArea.clear();
    	tfNumero.clear();
    	tfCodigoArea.requestFocus();

    }*/
	

	/*@FXML
	void handlePesquisar(ActionEvent event) {
		pessoaRepository repository = 
				new pessoaRepository(JPAFactory.getEntityManager());
		List<Pessoa> lista = repository.getPessoas(tfPesquisar.getText());
		
		if (lista.isEmpty()) {
			Alert alerta = new Alert(AlertType.INFORMATION);
			alerta.setTitle("Informação");
			alerta.setHeaderText(null);
			alerta.setContentText("A consulta não retornou dados.");
			alerta.show();
		}
		tvpessoas.setItems(FXCollections.observableList(lista));
	}*/

	/*@FXML
	void handleMouseClicked(MouseEvent event) {
		// verificando se eh o botao principal
		if (event.getButton().equals(MouseButton.PRIMARY)) {
			// verificando a quantidade de cliques
			if (event.getClickCount() == 2) {
				pessoa = tvpessoas.getSelectionModel().getSelectedItem();
				tfCpf.setText(getPessoa().getCpf());
				tfNome.setText(getPessoa().getNome());
				tfEndereco.setText(getPessoa().getEndereco());
				tfEmail.setText(getPessoa().getEmail());
				dpAniversario.setValue(getPessoa().getDataAniversaio());
				
				// preenchendo os telefone
				tbTelefone.setItems(FXCollections.observableList(getPessoa().getListaTelefone()));

				// selecionando a primeira aba
				tpAbas.getSelectionModel().select(0);

				// setando o focus no cpf
				tfCpf.requestFocus();
				atualizarBotoes();
			}
		}

	}*/

	

/*	@FXML
	void handleAlterar(ActionEvent event) {
		getPessoa().setCpf(tfCpf.getText());
		getPessoa().setNome(tfNome.getText());
		getPessoa().setEndereco(tfEndereco.getText());
		getPessoa().setEmail(tfEmail.getText());
		getPessoa().setDataAniversaio(dpAniversario.getValue());

		save(getPessoa());
		
		handleLimpar(event);
	}
*/
	/*@FXML
	void handleExcluir(ActionEvent event) {
		super.remove(getPessoa());
		handleLimpar(event);
	}*/



	private void atualizarBotoes() {
		btSalvar.setDisable(getDesejo().getId() != null);
		
	}

	public Desejo getDesejo() {
		if (desejo == null)
			desejo = new Desejo();
		return desejo;
	}

	public void setDesejo(Desejo desejo) {
		this.desejo = desejo;
	}

	
	
}
