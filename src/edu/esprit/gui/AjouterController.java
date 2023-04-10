/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.gui;

import edu.esprit.entities.User;
import edu.esprit.services.UserCrud;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Mayssa
 */
public class AjouterController implements Initializable {

    @FXML
    private TextField fxprenom;
    @FXML
    private TextField fxnom;
    @FXML
    private TextField fxemail;
    @FXML
    private TextField fxcin;
    @FXML
    private TextField fxnum;
    @FXML
    private TextField fxadresse;
    @FXML
    private TextField fxroles;
    @FXML
    private Button btnaj;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ajouter(ActionEvent event) {
         if (fxnom.getText().isEmpty() || fxprenom.getText().isEmpty()||fxemail.getText().isEmpty() || fxcin.getText().isEmpty()|| fxnum.getText().isEmpty() || fxadresse.getText().isEmpty()||fxroles.getText().isEmpty() ) {
            Alert a = new Alert(Alert.AlertType.ERROR, "il faut remplir tous les champs ! ", ButtonType.OK);
            a.showAndWait();
        } else {
             UserCrud us= new UserCrud();
             User p = new User(fxemail.getText(), fxnom.getText(), fxprenom.getText(), fxcin, fxadresse.getText(), fxnum, fxroles.getText());
             us.ajouterUtilisateur2(p);
             Alert a = new Alert(Alert.AlertType.INFORMATION, "user added !", ButtonType.OK);
             a.showAndWait();
        }

    }


    }
   

