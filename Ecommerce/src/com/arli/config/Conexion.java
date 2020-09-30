package com.arli.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection con;
    String url="jdbc:mysql://localhost:3306/carrito_arli";
    String user="hilary";
    String pass="1234";
    
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            
        }
        return con;
    }
     
}
