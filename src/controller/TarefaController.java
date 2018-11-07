package controller;

import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;

import model.Tarefa;
import model.Tarefa;



public class TarefaController extends Controller<Tarefa>  {

	private Tarefa tarefa;

	  @FXML
	    private TextField tfTituloTarefa;

	    @FXML
	    private RadioButton rbStatusAguardandoTarefa;

	    @FXML
	    private RadioButton rbStatusRealizadaTarefa;

	    @FXML
	    private RadioButton rbStatusNaoRealizadoTarefa;

	    @FXML
	    private Button btSalvarTarefa;

	    @FXML
	    private Button btAtualizarTarefa;

	    @FXML
	    private Button btCancelarTarefa;

	    @FXML
	    private Button btLimparTarefa;

	    @FXML
	    private DatePicker dpDatatarefa;

	    @FXML
	    private TextField tfDescricaoTarefa;

	    @FXML
	    private TableColumn<?, ?> tcTituloTarefa;

	    @FXML
	    private TableColumn<?, ?> tcDataTarefa;

	    @FXML
	    private TableColumn<?, ?> tcStatustTarefa;

	    @FXML
	    private TableColumn<?, ?> tcDescricaoTarefa;

	    @FXML
	    void handleAtualizar(ActionEvent event) {
	    	
	    	getTarefa().setTituloTarefa(tfTituloTarefa.getText());
			getTarefa().setDataTarefa(dpDatatarefa.getValue());
			getTarefa().setTituloTarefa(tfTituloTarefa.getText());

			save(getTarefa());
			
			handleLimpar(event);

	    }

	    @FXML
	    void handleCancelar(ActionEvent event) {
	    	
	    	tfTituloTarefa.setText("");
			tfDescricaoTarefa.setText("");
			dpDatatarefa.setValue(null);
		
			// limpando as informacoes da tarefa
			tarefa = null;
			// setando o focus no Titulo
			tfTituloTarefa.requestFocus();

	    }

	    @FXML
	    void handleLimpar(ActionEvent event) {

	    }

	    @FXML
	    void handleSalvar(ActionEvent event) {
	    	
	    	getTarefa().setTituloTarefa(tfTituloTarefa.getText());
	    	getTarefa().setDataTarefa(dpDatatarefa.getValue());
	    	getTarefa().setDescricaoTarefa(tfDescricaoTarefa.getText());
	    	

			super.save(getTarefa());
			
			handleCancelar(event);
	    }

	private void atualizarBotoes() {
		btSalvarTarefa.setDisable(getTarefa().getId() != null);
		
	}

	public Tarefa getTarefa() {
		if (tarefa == null)
			tarefa = new Tarefa();
		return tarefa;
	}

	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}

	
	
}
