/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;


import entities.Membresia;
import entities.Socio;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author SANTIAGO
 */
public class MembresiaData {
    private Connection connection;

    public MembresiaData() {
        connection = Conexion.getConexion();
    }
    
     public void agregarMembresia(Membresia membresia) {
        String query = "INSERT INTO `membresias`(`CantidadPases`, `Id_Socio`, `Fecha_Inicio`, `Fecha_Fin`, `Costo`, `Estado`) VALUES (?, ?, ?, ?, ?, ? )";
        try (PreparedStatement ps = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            
            ps.setInt(1,membresia.getCantPases());
            ps.setInt(2, membresia.getSocio().getIdSocio());
            ps.setDate(3, java.sql.Date.valueOf(membresia.getFechaInicio()));
            ps.setDate(4, java.sql.Date.valueOf(membresia.getFechaFin()));
            ps.setDouble(5, membresia.getCosto());
            ps.setInt(6, membresia.getEstado());
            ps.executeUpdate();
         ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                // Obtener el id generado (opcional)
                membresia.setIdMembresia(rs.getInt(1));// el (1) es la columna 1 donde esta el id, originalmente se llama insert_id, ese campo
                JOptionPane.showMessageDialog(null, "Socio añadido con éxito.");
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Socio: " + e.getMessage());
            e.printStackTrace();
        }
    }
     public List<Membresia> listarMembresia(Socio socio){
         List<Membresia> membresia = new ArrayList<>();
         String sql = "SELECT * FROM membresias";
        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(sql)){
            while (rs.next()) {
                Membresia i = new Membresia();
                
                 
                i.setIdMembresia(rs.getInt("idMembresia"));
                i.setCantPases(rs.getInt("CantPases"));
                
                i.setSocio(rs.getInt(socio.getIdSocio()));
                i.setFechaInicio(rs.getDate("Fecha_Inicio").toLocalDate());
                i.setCosto(rs.getDouble("Costo"));
                i.setEstado(rs.getInt("Estado"));
                
                membresia.add(i);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripciones: " + ex.getMessage());
        }
        return membresia;
        
     }
     
     

}
