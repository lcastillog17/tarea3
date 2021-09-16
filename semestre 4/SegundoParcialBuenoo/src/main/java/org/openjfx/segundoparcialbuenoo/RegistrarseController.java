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
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import modelo.Usuario;
import modelo.UsuarioJDBC;


/**
 *
 * @author linda
 */
public class RegistrarseController implements Initializable {
    
    
    @FXML
    private TextField txtUsuarioR;

    @FXML
    private Button ButtonRegistrar;

    @FXML
    private PasswordField pwdContraR;

    @FXML
    private PasswordField pwdConfirmaContraR;

    
     @FXML
    void eventRegistrarse(ActionEvent event) {
     Usuario usu=new Usuario();
        UsuarioJDBC udb=new UsuarioJDBC();
        
        String usr= txtUsuarioR.getText();
        String pwd=pwdContraR.getText();
        String pwdConfirma=pwdConfirmaContraR.getText();
        if (pwd.equals(pwdConfirma)){
        String contra=pwd;
        usu.setUsername(usr);
        usu.setPassword(contra);
        udb.insert(usu);
        new Alert(Alert.AlertType.INFORMATION, "Listo, ya está registrado").showAndWait();
        }else if(pwd!=pwdConfirma){
        new Alert(Alert.AlertType.ERROR, "Revise que las contraeñas sean las mismas").showAndWait();
        }
        usu.setUsername(usr);
        usu.setPassword(pwd);
    }
    
          @FXML
    void eventRegresar(ActionEvent event) throws IOException {
     App.setRoot("Login");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
