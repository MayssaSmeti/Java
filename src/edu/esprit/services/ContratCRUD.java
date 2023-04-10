/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.esprit.services;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import edu.esprit.utils.MyConnection;


import java.sql.Date;
//import Projet.entities.User;
import edu.esprit.entities.Contrat;
import edu.esprit.entities.Offre;
import edu.esprit.utils.MyConnection;
import java.sql.Statement;
//import projet.entities.Vehicule;

/**
 *
 * @author zaghd
 */
public class ContratCRUD implements IService<Contrat>{
    Connection cnx = MyConnection.getInstance().getCnx();
    
    @Override
    public void ajouter(Contrat o) {
        try {
            String requete = "insert into contrat(validitedu,validiteau,id_client,id_vehicule,	photo_cin) values("+o.getValiditedu()+ ",'" +o.getValiditeau() + ",'" +o.getId_client()+ ",'" + o.getId_vehicule()+"'," + o.getPhoto_cin()+  ");";
            PreparedStatement pst = cnx.prepareStatement(requete);
            pst.executeUpdate(requete);
            System.out.println("Votre contrat est  ajouté");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void modifier(Contrat o) throws SQLException {
 try {
          
            String req = "UPDATE `contrat` SET `validitedu` = '" +o.getValiditedu()+ "', `validiteau` = '" + o.getValiditeau()+ "', `photo_cin` = '" + o.getPhoto_cin();
            PreparedStatement ps = cnx.prepareStatement(req);
           Statement pst = cnx.createStatement();
            pst.executeUpdate(req);
            System.out.println("Votre offre est  modifié avec succe");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } }

    @Override
    public void supprimer(int id) throws SQLException {
try {
            String req = "DELETE FROM `contrat` WHERE id = " + id;
            Statement st = cnx.createStatement();
            st.executeUpdate(req);
            System.out.println("Contrat est supprimé !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }    }

    @Override
    public List<Contrat> getAll() throws SQLException {
 List<Contrat> myList = new ArrayList<>();  
       try {
             String req3="SELECT * FROM contrat";
             Statement st = cnx.createStatement(); 
             ResultSet rs = st.executeQuery(req3);
             while(rs.next()){
                Contrat o =new Contrat();
                 o.setId(rs.getInt(1));
                 o.setValiditedu(rs.getString("validitedu"));
                 o.setValiditeau(rs.getString("validiteau"));
                 o.setId_client(rs.getInt("id_client_id"));
                 o.setId_vehicule(rs.getInt("id_vehicule_id"));
                 o.setPhoto_cin(rs.getString("photo_cin"));;
                 myList.add(o);
             }
         } catch (SQLException ex) {
             System.err.println(ex.getMessage());
         }
         return myList;
}    }
    

