/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.esprit.services;

import java.sql.SQLException;
import java.util.List;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author zaghd
 */
public interface IService <T> {
    public void ajouter(T o) throws SQLException;
    public void modifier(T o) throws SQLException;
    public void supprimer(int id) throws SQLException;
    public List<T> getAll() throws SQLException;
}
