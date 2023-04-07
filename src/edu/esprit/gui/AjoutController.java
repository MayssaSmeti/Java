/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.gui;

import edu.esprit.entities.User;
import edu.esprit.services.UserCrud;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Mayssa
 */
public class AjoutController implements Initializable {

    @FXML
    private TextField fxNom;
    @FXML
    private TextField fxPrenom;
    @FXML
    private TextField fxEmail;
    @FXML
    private TextField fxCin;
    @FXML
    private TextField fxAdresse;
    @FXML
    private TextField fxNum;
    @FXML
    private Button btnajouter;
    @FXML
    private PasswordField fxPassword;
    @FXML
    private ComboBox<?> fxRole;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void close(MouseEvent event) { 
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }
   

   

    @FXML
    private void Ajouter(ActionEvent event) {
        User u; 
        u = new User(fxEmail.getText(), fxNom.getText(), fxPrenom.getText(), fxPassword.getText(), 0, fxAdresse.getText(), 0, (String) fxRole.getValue());
        
    }

        
    }
    

