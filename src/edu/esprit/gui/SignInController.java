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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author Mayssa
 */
public class SignInController implements Initializable {

    @FXML
    private TextField fxemail;
    @FXML
    private TextField fxpassword;
    @FXML
    private Button btnconnexion;
    @FXML
    private Label fxreset;
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
    private void login(ActionEvent event) {
         if (fxemail.getText().isEmpty() || fxpassword.getText().isEmpty() ) {
            Alert a = new Alert(Alert.AlertType.ERROR, " Email et mot de passe invalides   ! ", ButtonType.OK);
            a.showAndWait();
         }
         else if (fxpassword.getText().length()<8) {
             Alert a = new Alert(Alert.AlertType.ERROR, " Le mot de passe doit etre superieur à 8 caractéres   ! ", ButtonType.OK);
            a.showAndWait();
             
             
         }
         
        
    }

    @FXML
    private void ResetPassword(MouseEvent event) {
    }

  

    @FXML
    private void inscription(ActionEvent event) {
        
                            FXMLLoader loader = new FXMLLoader ();//creation de FXMLLoader 
                            loader.setLocation(getClass().getResource("SignUp.fxml")); //emplacement du fichier fxml 
                            try {
                                loader.load();
                            } catch (Exception ex) {
                               System.err.println(ex.getMessage());
                            }
                          
                            Parent parent = loader.getRoot(); 
                            Stage stage = new Stage(); //affichage de la fenetre 
                            stage.setScene(new Scene(parent));
                            stage.initStyle(StageStyle.UTILITY);
                            stage.show();
    }
    
}
