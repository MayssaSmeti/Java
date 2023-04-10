/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.tests;

import edu.esprit.entities.Offre;
import edu.esprit.services.ContratCRUD;
import edu.esprit.services.OffreCRUD;
import edu.esprit.utils.MyConnection;
import java.sql.SQLException;

/**
 *
 * @author zaghd
 */
public class MainClass {
    public static void main(String[] args) throws SQLException {
          MyConnection mc = MyConnection.getInstance();
          //OffreCRUD ocd = new OffreCRUD();
          ContratCRUD ccd = new ContratCRUD();
          //ccd.supprimer(422);
          //Offre o2 = new Offre("Nharkom", 26, "Mabrouk", "24 mois", "akrem.jpg");
          //ocd.ajouter(o2);
          System.out.println(ccd.getAll());
          //ocd.supprimer(7990);
          //Offre offre =new Offre(7989, "Mouledkom", 23,"Mabrouk", "1 mois", "image_offre");
     
        //ocd.modifier(offre);
    }
}
