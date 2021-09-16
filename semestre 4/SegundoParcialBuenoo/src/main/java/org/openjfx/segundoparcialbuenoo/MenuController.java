/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openjfx.segundoparcialbuenoo;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Set;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import modelo.CatalogoEmpleado;
import modelo.MdEmpleado;

/**
 *
 * @author linda
 */
public class MenuController implements Initializable{
     private static final CatalogoEmpleado catalogoEmple = new CatalogoEmpleado();
    
    
     @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtEnero;

    @FXML
    private TextField txtFebrero;

    @FXML
    private TextField txtMarzo;

    @FXML
    private Label lblCodigo;

    @FXML
    private TextField txtBuscaCodigo;

    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnEditar;

    @FXML
    private Button btnEliminar;

    @FXML
    private TextField txtBuscaCantidad;

    @FXML
    private Button btnBuscarCant;

    @FXML
    private Label LblBuscarCantidad;

    @FXML
    private TextField txtBuscaMes;

    @FXML
    private Button btnMayorMes;

    @FXML
    private Label LblBuscarMayor;
    
        @FXML
    private Label LblBuscarMenor;

    @FXML
    private Button btnListar;

    
    @FXML
    private TableView<MdEmpleado> TvMostrar;
    @FXML
    private TableColumn<MdEmpleado, Integer> TvCodigo;

    @FXML
    private TableColumn<MdEmpleado, String> TvNombre;

    @FXML
    private TableColumn<MdEmpleado, Double> TvEnero;

    @FXML
    private TableColumn<MdEmpleado, Double> TvFebrero;

    @FXML
    private TableColumn<MdEmpleado, Double> TvMarzo;
    
     @FXML
    private TableColumn<MdEmpleado, Double> TvTotal;

    @FXML
    private TableColumn<MdEmpleado, Double> TvPromedio;
    
    

    @FXML
    private Button btnBuscarCod;

    @FXML
    private Label LblBuscaMayor3;
    
    @FXML
    private Button btnMayorTresMeses;
    
     @FXML
    private Label LblBusquedaCod;
    
    //eventos de botones
    
    @FXML
    void eventAgregar(ActionEvent event) {
    String nombre = txtNombre.getText();
    String enero=txtEnero.getText();
    String febrero=txtFebrero.getText();
    String marzo=txtMarzo.getText();
        try {
    
    catalogoEmple.agregarEmpleado(nombre,Double.valueOf(enero),Double.valueOf(febrero),Double.valueOf(marzo)); 
    new Alert(Alert.AlertType.INFORMATION, "El empleado se agregó").showAndWait();
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, "Error al agregar empleado").showAndWait();
        }
    
    }

    @FXML
    void eventBuscarCant(ActionEvent event) {
        String buscar = txtBuscaCantidad.getText();
        try {
            LblBuscarCantidad.setText(catalogoEmple.buscarEmpleado(Double.valueOf(buscar)));
        } catch (Exception e) {
             new Alert(Alert.AlertType.ERROR, "Error al encontrar el cantidad").showAndWait();
        }
        
    }

    @FXML
    void eventBuscarCod(ActionEvent event) {
    int cod = Integer.valueOf(txtBuscaCodigo.getText());
        try {
            
            String[] datosEm=catalogoEmple.buscarEmpleadoPorCod(cod).toString().split("\\|");
            lblCodigo.setText(String.valueOf(cod));
            txtNombre.setText(datosEm[1]);
            txtEnero.setText(datosEm[2]);
            txtFebrero.setText(datosEm[3]);
            txtMarzo.setText(datosEm[4]);
            
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, "Error al buscar codigo").showAndWait();
        }
    
    }

    @FXML
    void eventEditar(ActionEvent event) {
    int codigo=Integer.valueOf(txtBuscaCodigo.getText());
    String nuevoNombre=txtNombre.getText();
    String nuevoEnero=txtEnero.getText();
    String nuevoFebrero=txtFebrero.getText();
    String nuevoMarzo=txtMarzo.getText();
        try {
         catalogoEmple.editar2(codigo, nuevoNombre, nuevoEnero, nuevoFebrero,nuevoMarzo); 
         new Alert(Alert.AlertType.INFORMATION, "Dato editado con exito").showAndWait();
        } catch (Exception e) {
             new Alert(Alert.AlertType.ERROR, "Error al editar datos ").showAndWait();
        }
    
    }

    @FXML
    void eventEliminar(ActionEvent event) {
        int codigo=Integer.valueOf(txtBuscaCodigo.getText());
        try {
            catalogoEmple.borrar(codigo);
            new Alert(Alert.AlertType.INFORMATION, "El empleado se eliminó").showAndWait();
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, "Error al encontrar el codigo que desea borrar").showAndWait();
        }
    
    }

    @FXML
    void eventListar(ActionEvent event) {
        try {
        Listar();
           // ObservableList<catalogoEmple.listarEmpleado()> teams = FXCollections.observableArrayList();
           // TvMostrar.setCellFactory(catalogoEmple.listarEmpleado());
        } catch (Exception e) {
             new Alert(Alert.AlertType.ERROR, "Error al Listar").showAndWait();
       }
        
    }
    
    private ObservableList<MdEmpleado> getEmpleados(){
        ObservableList<MdEmpleado> datos = FXCollections.observableArrayList();
        List<MdEmpleado> todos = catalogoEmple.listarEmpleado();
        todos.forEach(empleado -> {
            datos.add(empleado);
        });
        return datos;
    }

    @FXML
    void eventMayorMes(ActionEvent event) {
        int mesElegido = Integer.valueOf(txtBuscaMes.getText());
        try {
            LblBuscarMayor.setText(catalogoEmple.MayorxMes(mesElegido));
            LblBuscarMenor.setText(catalogoEmple.MenorxMes(mesElegido));
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, "Error al buscar mayor de ese mes").showAndWait();
        }
    }
    
     @FXML
    void eventMayorTresMeses(ActionEvent event) {
        try {
            LblBuscaMayor3.setText(catalogoEmple.vendioMas3Meses());
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, "Error al buscar mayor de los tres mes").showAndWait();
        }
    }
        @FXML
    void eventRegresar(ActionEvent event) throws IOException {
    App.setRoot("Login");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         //To change body of generated methods, choose Tools | Templates.

    }
    
   public void Listar(){
             try{
            this.TvCodigo.setCellValueFactory(new PropertyValueFactory("codigo"));
            this.TvNombre.setCellValueFactory(new PropertyValueFactory("nombre"));
            this.TvEnero.setCellValueFactory(new PropertyValueFactory("enero"));
            this.TvFebrero.setCellValueFactory(new PropertyValueFactory("febrero"));
            this.TvMarzo.setCellValueFactory(new PropertyValueFactory("marzo"));
            this.TvTotal.setCellValueFactory(new PropertyValueFactory("total"));
            this.TvPromedio.setCellValueFactory(new PropertyValueFactory("promedio"));
            ObservableList<MdEmpleado> datos = getEmpleados();
            this.TvMostrar.setItems(datos);
        } catch (Exception ex) {
            new Alert(Alert.AlertType.ERROR, "ERROOOOOOOR").showAndWait();
        }
    }
}
    
    

