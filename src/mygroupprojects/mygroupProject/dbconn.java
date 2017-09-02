/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygroupprojects.mygroupProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author wilson
 */
public class dbconn {
  static Connection conn;

public static Connection getcon(){

    try {
        conn = DriverManager.getConnection("jdbc:sqlite:groupdb.sqlite");
        return conn;
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
        return null;
    }
}  
}
