/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openjfx.segundoparcialbuenoo;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import modelo.Usuario;
import modelo.UsuarioJDBC;

public class LoginController implements Initializable{

    @FXML
    private TextField txtUsuarioI;

    @FXML
    private Button ButtonIngresar;

    @FXML
    private Button ButtonRegistrarInicio;

    @FXML
    private PasswordField txtContraI;
    
    
    //eventos de botones

    @FXML
    void eventIngresar(ActionEvent event) throws IOException {
        Usuario usu=new Usuario();
        UsuarioJDBC udb=new UsuarioJDBC();
        
        String usr= txtUsuarioI.getText();
        String pwd=txtContraI.getText();
        usu.setUsername(usr);
        usu.setPassword(pwd);

       if(udb.select_validacion(usu)){
             App.setRoot("Menu");
        }else{
            new Alert(Alert.AlertType.ERROR, "Usuario o contraseña incorrecta").showAndWait();
        }
    }

    @FXML
    void eventResgistrarInicio(ActionEvent event) throws IOException {
     App.setRoot("Registrarse");
    }

    

    /**
     * Initializes the controller class.
     */
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         //To change body of generated methods, choose Tools | Templates.
    }
    
}
