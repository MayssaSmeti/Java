/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.gui;

import edu.esprit.entities.Constat;
import edu.esprit.services.ConstatCRUD;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class AjouterConstatController implements Initializable {

    @FXML
    private TextField tfnom;
    @FXML
    private TextField tfprenom;
    @FXML
    private ComboBox tftype;
    @FXML
    private ComboBox tfmarque;
    @FXML
    private TextField tfassurance;
    @FXML
    private TextField tfadresse;
    @FXML
    private TextField tfemplacement;
    @FXML
    private DatePicker tfdate;
    @FXML
    private TextField tfmail;
    @FXML
    private TextField tfid_ve;
    @FXML
    private TextField tfphoto;
    @FXML
    private TextField tfdescription;
    @FXML
    private TextField tfobservations;
    @FXML
    private TextField tfnum;
    @FXML
    private TextField tfid_exp;
    @FXML
    private Button btnAjouter;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         ObservableList<String> listtype = FXCollections.observableArrayList("Voiture","Moto","Camion");
         tftype.setItems(listtype);
         ObservableList<String> listmarque = FXCollections.observableArrayList("Kia","Symbole","Clio","BMW","Range Rover","Ibiza","Mercedes","Toyota","Ford","Honda");
         tfmarque.setItems(listmarque);
    }    

    @FXML
    private void EnregistrerConstat(ActionEvent event) {
           
            String nomclient_e = tfnom.getText();
            String prenomclient_e = tfprenom.getText();
            String typevehicule_e = tftype.getSelectionModel().getSelectedItem().toString();
            String marquevehicule_e = tfmarque.getSelectionModel().getSelectedItem().toString();
            String assuranceclient_e = tfassurance.getText();
            String adresseclient_e = tfadresse.getText();
            String emplacementaccid = tfemplacement.getText();
            String photoaccid = tfphoto.getText();
            String descriptiondegat = tfdescription.getText();
            String observations = tfobservations.getText();
            String numcontrat_e = tfnum.getText();
            String mail = tfmail.getText();
            LocalDate selectedDate = tfdate.getValue();
            String date_creation = selectedDate.toString();
            int id_expert_id = Integer.parseInt(tfid_exp.getText());
            int id_vehicule_id = Integer.parseInt(tfid_ve.getText());
 
          
            Constat c = new Constat(nomclient_e,prenomclient_e,typevehicule_e,marquevehicule_e,assuranceclient_e,adresseclient_e,emplacementaccid,photoaccid,descriptiondegat,observations,numcontrat_e,mail,date_creation,id_expert_id,id_vehicule_id);
            ConstatCRUD ccd = new ConstatCRUD();
            ccd.ajouterConstat2(c);
            
            FXMLLoader loader = new FXMLLoader(getClass().getResource("DétailsConstat.fxml"));
        
        try {    
            Parent root = loader.load();
            DétailsConstatController dcc = loader.getController();
            dcc.setTfNom(c.getNomclient_e());
            dcc.setTfPrenom(c.getPrenomclient_e());
            dcc.setTfType(c.getTypevehicule_e());
            dcc.setTfMarque(c.getMarquevehicule_e());
            dcc.setTfAssurance(c.getAssuranceclient_e());
            dcc.setTfAdresse(c.getAdresseclient_e());
            dcc.setTfEmplacement(c.getEmplacementaccid());
            dcc.setTfPhoto(c.getPhotoaccid());
            dcc.setTfDescription(c.getDescriptiondegat());
            dcc.setTfObservations(c.getObservations());
            dcc.setTfNum(c.getNumcontrat_e());
            dcc.setTfIdExpert(""+c.getExpert().getId());
            dcc.setTfIdVehicule(""+c.getVehicule().getId());
            dcc.setTfMail(c.getMail());
            dcc.setTfDate(c.getDate_creation());
            
            tfnom.getScene().setRoot(root);
            
        } catch (IOException ex) {
          System.err.println(ex.getMessage());
        }
    }
    
}
