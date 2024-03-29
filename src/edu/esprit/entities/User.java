
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.entities;

import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 *
 * @author Mayssa
 */
public class User {
    
    private int id;
    private String email ; 
    private String nom ; 
    private String prenom ; 
    private String password ; 
    private int cin ; 
    private String adresse ; 
    private int num_tel ; 
    private String roles ; 

    public User() {
    }

    public User(int id, String email, String nom, String prenom, int cin, String adresse, int num_tel, String roles) {
        this.id = id;
        this.email = email;
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
        this.adresse = adresse;
        this.num_tel = num_tel;
        this.roles = roles;
    }
    
    

    public User(String email, String nom, String prenom, String password, int cin, String adresse, int num_tel, String roles) {
        this.email = email;
        this.nom = nom;
        this.prenom = prenom;
        this.password = password;
        this.cin = cin;
        this.adresse = adresse;
        this.num_tel = num_tel;
        this.roles = roles;
    }

    public User(TextField fxemail, TextField fxnom, TextField fxprenom, PasswordField fxpassword, Integer cin, TextField fxadresse, Integer num_tel, TextField fxroles) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

  
   

   

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public int getNum_tel() {
        return num_tel;
    }

    public void setNum_tel(int num_tel) {
        this.num_tel = num_tel;
    }

  

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String edresse) {
        this.adresse = edresse;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", email=" + email + ", nom=" + nom + ", prenom=" + prenom + ", password=" + password + ", cin=" + cin + ", adresse=" + adresse + ", num_tel=" + num_tel + ", roles=" + roles + '}';
    }

   

  
    
    
    
}
