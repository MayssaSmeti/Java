/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Mayssa
 */
public class SignUpController implements Initializable {

    @FXML
    private TextField fxnom;
    @FXML
    private TextField fxprenom;
    @FXML
    private TextField fxemail;
    @FXML
    private PasswordField fxpassword;
    @FXML
    private TextField fxcin;
    @FXML
    private TextField fxnum;
    @FXML
    private TextField fxadresse;
    @FXML
    private Button btninscrit;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Inscription(ActionEvent event) {
         if (fxnom.getText().isEmpty() || fxprenom.getText().isEmpty()||fxemail.getText().isEmpty() || fxcin.getText().isEmpty()|| fxnum.getText().isEmpty() || fxadresse.getText().isEmpty() ) {
            Alert a = new Alert(Alert.AlertType.ERROR, "Champs invalides ! ", ButtonType.OK);
            a.showAndWait();
           
        } else if (fxpassword.getText().length()<8)
        {
             Alert a = new Alert(Alert.AlertType.ERROR, "Mot de passe doit etre >8 caractéres !)", ButtonType.OK);
              a.showAndWait();
        }
    }
    
    
}
