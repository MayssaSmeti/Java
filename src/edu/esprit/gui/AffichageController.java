/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.gui;

import edu.esprit.entities.User;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Mayssa
 */
public class AffichageController implements Initializable {
    @FXML
    private TableColumn<?,?> fxID;
    @FXML
    private TableColumn<?,?> fxNom;
    @FXML
    private TableColumn<?,?> fxPrenom;
    @FXML
    private TableColumn<?,?> fxEmail;
    @FXML
    private TableColumn<?,?> fxAdresse;
    @FXML
    private TableColumn<?,?> fxCin;
    @FXML
    private TableColumn<?,?> fxNum;
    @FXML
    private TableColumn <?,?> fxRole;
    @FXML
    private Button btnAjouter;
    @FXML
    private Button btnModifier;
    @FXML
    private Button btnSupprimer;
    
    
    
     Connection connection=null ; 
     PreparedStatement preparedStatement = null ; 
     ResultSet resultSet = null ; 
     User user = null ; 
    
    @FXML
    private TableView<User> userTable;
    @FXML
    private Button btnRechercher;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Ajouter(ActionEvent event) {
    }

    @FXML
    private void close(MouseEvent event) {
         Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    private void Modifier(ActionEvent event) {
    }

    @FXML
    private void Supprimer(ActionEvent event) {
    }


    @FXML
    private void Recherche(ActionEvent event) {
    }
    
    
}
