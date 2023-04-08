/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.gui;

import edu.esprit.entities.User;
import edu.esprit.services.UserCrud;
import edu.esprit.utilis.MyConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author Mayssa
 */
public class AdminController implements Initializable {

    @FXML
    private Button btndeconnexion;
    @FXML
    private TableColumn<?, ?> id;
    @FXML
    private TableColumn<?, ?> Nom;
    @FXML
    private TableColumn<?, ?> prenom;
    @FXML
    private TableColumn<?, ?> email;
    @FXML
    private TableColumn<?, ?> cin;
    @FXML
    private TableColumn<?, ?> numtel;
    @FXML
    private TableColumn<?, ?> adresse;
    @FXML
    private Button btnsupprimer;
    @FXML
    private Button btnmodifier;
    @FXML
    private Button Recherche;
    
      private Connection cnx;
    private Statement statement;
    private PreparedStatement prepare;
    private ResultSet result;
     User user = null ; 
    @FXML
    private TableView<User> tableviewUser;
    @FXML
    private TableColumn<?, ?> roles;
    /**

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        showRec();
    }    

    
      public void showRec() //affiche une liste utilisateur fe table view 
      {
       
         ObservableList<User> list = getUserList();
         id.setCellValueFactory(new PropertyValueFactory<>("id"));
         email.setCellValueFactory(new PropertyValueFactory<>("email"));
         Nom.setCellValueFactory(new PropertyValueFactory<>("nom"));
         prenom.setCellValueFactory(new PropertyValueFactory<>("prenom"));
         cin.setCellValueFactory(new PropertyValueFactory<>("cin"));
         numtel.setCellValueFactory(new PropertyValueFactory<>("num_tel"));
         adresse.setCellValueFactory(new PropertyValueFactory<>("adresse"));
         roles.setCellValueFactory(new PropertyValueFactory<>("roles"));

      
         tableviewUser.setItems(list);
         
     }
    
      public  ObservableList<User> getUserList() { //methode affichage mtaa liste utilisateur  fe table view 
         cnx = MyConnection.getInstance().getCnx();
        
        ObservableList<User> UserList = FXCollections.observableArrayList();
        try {
                String query2="SELECT * FROM  user ";
                PreparedStatement smt = cnx.prepareStatement(query2);
                User user;
                ResultSet rs= smt.executeQuery();
            while(rs.next()){ //parcour les enregistrement retoune par la requette sql 
                user=new User(rs.getInt("id"),rs.getString("email"),rs.getString("nom"),rs.getString("prenom"),rs.getInt("cin"),rs.getString("adresse"),rs.getInt("num_tel"),rs.getString("roles"));
                UserList.add(user);//ajout utilisateur fe liste 
            }
                System.out.println(UserList);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return UserList;
   
    }
    @FXML
    private void exit(ActionEvent event) {
         System.exit(0);
    }

    @FXML
    private void suprimer(ActionEvent event) {
         UserCrud u=new UserCrud();
   //       commandeplat t = tvcommande.getSelectionModel().getSelectedItem();
        User user = (User) tableviewUser.getSelectionModel().getSelectedItem();
      //  Plat p = new Plat(c.getreference());
        u.supprimerUtilisateur(user);
        refrech();
        Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Travel Me :: Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Utilisateur supprimé");
                alert.showAndWait(); 
    }

    @FXML
    private void modifier(ActionEvent event) {
         user = (User) tableviewUser.getSelectionModel().getSelectedItem();
                            FXMLLoader loader = new FXMLLoader ();
                            loader.setLocation(getClass().getResource("/Gui/ModifierUser.fxml"));
                            try {
                                loader.load();
                            } catch (Exception ex) {
                               System.err.println(ex.getMessage());
                            }
                            
                           // ModifierUserController muc = loader.getController();
                           // mrc.setUpdate(true);
                          //  muc.setTextFields(user);
                            Parent parent = loader.getRoot();
                            Stage stage = new Stage();
                            stage.setScene(new Scene(parent));
                            stage.initStyle(StageStyle.UTILITY);
                            stage.show();
                            showRec();
    }

    @FXML
    private void refrech() {
    }
    
}
