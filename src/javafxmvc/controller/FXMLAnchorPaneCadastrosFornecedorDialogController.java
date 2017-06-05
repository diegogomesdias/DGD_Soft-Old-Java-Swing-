
package javafxmvc.controller;

import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.Stage;
import javafxmvc.model.dao.CidEstDao;
import javafxmvc.model.database.Database;
import javafxmvc.model.database.DatabaseFactory;
import javafxmvc.model.domain.Fornecedor;

public class FXMLAnchorPaneCadastrosFornecedorDialogController implements Initializable {

    
    
    private Stage dialogStage;
    private boolean btnConfirmarClicked = false;
    private Fornecedor fornecedor;
    
    //OBJETOS UTILIZADOS
    private String uf;
    private String cidade;
    
    //atributos para manipulação de banco de dados
    private final Database database = DatabaseFactory.getDatabase("postgresql");
    private final Connection connection = database.conectar();
    private final CidEstDao cidestDao = new CidEstDao();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    /*
    	//CONVERTE UMA STRING EM FORMATO DATE
    public static java.sql.Date formataData(String data) throws Exception {
        if (data == null || data.equals("")) {
            return null;
        }
        java.sql.Date date = null;
        try {
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            date = new java.sql.Date(((java.util.Date) formatter.parse(data)).getTime());
        } catch (ParseException e) {
            throw e;
        }
        return date;
    }
	
	//Carregar paises na ComboBox
    public void CarregaPais(){
        List<String> listaPais = cidestDao.listaPais();
        listaPais.forEach((nomePais) -> {
            boxNacionalidade.getItems().add(nomePais);
         });
    }
    
    //CARREGA OS ESTADOS E OS ADD EM UMA COMBOBOX    
    public void carregarEstado(){
        List<String> listaEstado = cidestDao.listaEstados();
        listaEstado.forEach((nomeEstado) -> {
            boxUF.getItems().add(nomeEstado);
        });
    }
    
    //TORNA OS NOMES COMPLETOS EM SIGLAS
    private String EstadoNomeParaSigla(){
        String estado = null;
        if("Acre".equals(boxUF.valueProperty().get()) ) estado = "AC";
        if("Alagoas".equals(boxUF.valueProperty().get()) ) estado = "AL";
        if("Amazonas".equals(boxUF.valueProperty().get()) ) estado = "AM";
        if("Amapá".equals(boxUF.valueProperty().get()) ) estado = "AP";
        if("Bahia".equals(boxUF.valueProperty().get()) ) estado = "BA";
        if("Ceará".equals(boxUF.valueProperty().get()) ) estado = "CE";
        if("Distrito Federal".equals(boxUF.valueProperty().get()) ) estado = "DF";
        if("Espírito Santo".equals(boxUF.valueProperty().get()) ) estado = "ES";
        if("Goiás".equals(boxUF.valueProperty().get()) ) estado = "GO";
        if("Maranhão".equals(boxUF.valueProperty().get()) ) estado = "MA";
        if("Minas Gerais".equals(boxUF.valueProperty().get()) ) estado = "MG";
        if("Mato Grosso do Sul".equals(boxUF.valueProperty().get()) ) estado = "MS";
        if("Mato Grosso".equals(boxUF.valueProperty().get()) ) estado = "MT";
        if("Pará".equals(boxUF.valueProperty().get()) ) estado = "PA";
        if("Paraíba".equals(boxUF.valueProperty().get()) ) estado = "PB";
        if("Pernambuco".equals(boxUF.valueProperty().get()) ) estado = "PE";
        if("Piauí".equals(boxUF.valueProperty().get()) ) estado = "PI";
        if("Paraná".equals(boxUF.valueProperty().get()) ) estado = "PR";
        if("Rio de Janeiro".equals(boxUF.valueProperty().get()) ) estado = "RJ";
        if("Rio Grande do Norte".equals(boxUF.valueProperty().get()) ) estado = "RN";
        if("Rondônia".equals(boxUF.valueProperty().get()) ) estado = "RO";
        if("Roraima".equals(boxUF.valueProperty().get()) ) estado = "RR";
        if("Rio Grande do Sul".equals(boxUF.valueProperty().get()) ) estado = "RS";
        if("Santa Catarina".equals(boxUF.valueProperty().get()) ) estado = "SC";
        if("Sergipe".equals(boxUF.valueProperty().get()) ) estado = "SE";
        if("São Paulo".equals(boxUF.valueProperty().get()) ) estado = "SP";
        if("Tocantins".equals(boxUF.valueProperty().get()) ) estado = "TO";
        return estado;
    }
	*/
    public Stage getDialogStage() {
        return dialogStage;
    }

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    public boolean isBtnConfirmarClicked() {
        return btnConfirmarClicked;
    }

    public void setBtnConfirmarClicked(boolean btnConfirmarClicked) {
        this.btnConfirmarClicked = btnConfirmarClicked;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
        
        //this.ClienteNome.setText(cliente.getNome());
        //this.ClienteCPF.setText(cliente.getCpf());
        //this.ClienteRG.setText(cliente.getRg());
        //this.ClienteEnd.setText(cliente.getEnd());
        //cidade
        //this.ClienteBairro.setText(cliente.getBairro());
        //buxuf
        //this.ClienteTelefone.setText(cliente.getTelefone());
        //IMAGEM
        //boxSexo
        //boxNacionalidade
        //CEP Ver se vai utilizar
        //this.ClienteNasc.setText(String.valueOf(cliente.getNasc()));
        //boxEstCivil
        //cliente.setCelular(ClienteCelular.getText());
        //cliente.setEmail(ClienteEmail.getText());
        //cliente.setNumeroEnd(Integer.parseInt(ClienteNumero.getText()));
        //cliente.setComplemento(ClienteComp.getText());
    }
    
    @FXML
    public void handleBtnConfirmar() throws Exception{
        //cliente.setNome(ClienteNome.getText());
        //cliente.setCpf(ClienteCPF.getText());
        //cliente.setRg(ClienteRG.getText());
        //cliente.setEnd(ClienteEnd.getText());
        //cidade
        //cliente.setBairro(ClienteBairro.getText());
        //boxUF
        //cliente.setTelefone(ClienteTelefone.getText());
        //IMAGEM
        //boxSexo
        //boxNacionalidade
        //CEP Ver se vai utilizar
        //cliente.setNasc(formataData(ClienteNasc.getText()));
        //boxEstCivil
        //cliente.setCelular(ClienteCelular.getText());
        //cliente.setEmail(ClienteEmail.getText());
        //cliente.setNumeroEnd(Integer.parseInt(ClienteNumero.getText()));
        //cliente.setComplemento(ClienteComp.getText());
        
        btnConfirmarClicked = true;
        dialogStage.close();
    }
    
    @FXML
    public void handleBtnCancelar(){
        dialogStage.close();
    }
    
}