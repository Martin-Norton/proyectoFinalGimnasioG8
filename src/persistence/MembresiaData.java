/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import entities.Clase;
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

            ps.setInt(1, membresia.getCantPases());
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

    public List<Membresia> listarMembresia(Socio socio) {
        List<Membresia> membresias = new ArrayList<>();
        String sql = "SELECT * FROM membresias";
        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Membresia i = new Membresia();

                i.setIdMembresia(rs.getInt("id_Membresia"));
                i.setCantPases(rs.getInt("CantidadPases"));
                i.setSocio(socio);
                i.setFechaInicio(rs.getDate("Fecha_Inicio").toLocalDate());
                i.setFechaFin(rs.getDate("Fecha_Fin").toLocalDate());
                i.setCosto(rs.getDouble("Costo"));
                i.setEstado(rs.getInt("Estado"));

                membresias.add(i);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripciones: " + ex.getMessage());
        }
        return membresias;

    }

    public void actualizarMembresia(Membresia membresia) {
        String query = "UPDATE membresias SET CantidadPases=?,Fecha_Inicio=?,Fecha_Fin=?,Costo=?,Estado=? WHERE Id_Membresia LIKE ?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {

            ps.setInt(1, membresia.getCantPases());
            ps.setDate(2, java.sql.Date.valueOf(membresia.getFechaInicio()));
            ps.setDate(3, java.sql.Date.valueOf(membresia.getFechaFin()));
            ps.setDouble(4, membresia.getCosto());
            ps.setInt(5, membresia.getEstado());
            ps.setInt(6, membresia.getIdMembresia());
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Membresia actualizada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar la Membresia.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void borrarMembresia(int id) {
        String query = "DELETE FROM membresias WHERE Id_Membresia = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, id);
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Membresia eliminada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar la Membresia.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
