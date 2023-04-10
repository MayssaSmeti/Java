/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.entities;

import java.util.Objects;

/**
 *
 * @author zaghd
 */
public class Contrat {
    private int id;
    private String validitedu;
    private String validiteau;
    private int id_vehicule;
    private int id_client;
    private String photo_cin;

    public Contrat(int id, String validitedu, String validiteau, int id_vehicule, int id_client, String photo_cin) {
        this.id = id;
        this.validitedu = validitedu;
        this.validiteau = validiteau;
        this.id_vehicule = id_vehicule;
        this.id_client = id_client;
        this.photo_cin = photo_cin;
    }

    public Contrat() {
    }

    public Contrat(String validitedu, String validiteau, int id_vehicule, int id_client, String photo_cin) {
        this.validitedu = validitedu;
        this.validiteau = validiteau;
        this.id_vehicule = id_vehicule;
        this.id_client = id_client;
        this.photo_cin = photo_cin;
    }

    public Contrat(String validitedu, String validiteau, String photo_cin) {
        this.validitedu = validitedu;
        this.validiteau = validiteau;
        this.photo_cin = photo_cin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValiditedu() {
        return validitedu;
    }

    public void setValiditedu(String validitedu) {
        this.validitedu = validitedu;
    }

    public String getValiditeau() {
        return validiteau;
    }

    public void setValiditeau(String validiteau) {
        this.validiteau = validiteau;
    }

    public int getId_vehicule() {
        return id_vehicule;
    }

    public void setId_vehicule(int id_vehicule) {
        this.id_vehicule = id_vehicule;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public String getPhoto_cin() {
        return photo_cin;
    }

    public void setPhoto_cin(String photo_cin) {
        this.photo_cin = photo_cin;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contrat other = (Contrat) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.id_vehicule != other.id_vehicule) {
            return false;
        }
        if (this.id_client != other.id_client) {
            return false;
        }
        if (!Objects.equals(this.validitedu, other.validitedu)) {
            return false;
        }
        if (!Objects.equals(this.validiteau, other.validiteau)) {
            return false;
        }
        return Objects.equals(this.photo_cin, other.photo_cin);
    }

    

    @Override
    public String toString() {
        return "Contrat{" + "id=" + id + ", validitedu=" + validitedu + ", validiteau=" + validiteau + ", id_vehicule=" + id_vehicule + ", id_client=" + id_client + ", photo_cin=" + photo_cin + '}';
    }
    
    
}
