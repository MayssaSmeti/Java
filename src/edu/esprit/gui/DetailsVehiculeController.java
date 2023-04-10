/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.gui;

import edu.esprit.entities.Vehicule;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class DetailsVehiculeController implements Initializable {

    @FXML
    private TextField tfmatricule;
    @FXML
    private TextField tftype;
    @FXML
    private TextField tfmarque;
    @FXML
    private TextField tfid;
    @FXML
    private TextField tfnb_ch;
    @FXML
    private TableColumn<Vehicule, String> idcol;
    @FXML
    private TableColumn<Vehicule, String> matcol;
    @FXML
    private TableColumn<Vehicule, String> typecol;
    @FXML
    private TableColumn<Vehicule, String> marcol;
    @FXML
    private TableColumn<Vehicule, String> nbcol;
    @FXML
    private TableColumn<Vehicule, String> idccol;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
     
    public void setTfMatricule(String message){
        this.tfmatricule.setText(message);
    }
    
    public void setTfType(String message){
        this.tftype.setText(message);
    }
      
    public void setTfMarque(String message){
        this.tfmarque.setText(message);
    }
    
    public void setTfNb_Ch(String message){
        this.tfnb_ch.setText(message);
    }
        
    public void setTfId(String message){
        this.tfid.setText(message);
    }
        
    
    
    
}
