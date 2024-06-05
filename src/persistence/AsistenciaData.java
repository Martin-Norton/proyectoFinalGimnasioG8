package persistence;

import entities.Asistencia;
import entities.Clase;
import entities.Socio;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AsistenciaData {

    private Connection connection;

    public AsistenciaData() {
        connection = Conexion.getConexion();
    }

    public void agregarAsistencia(Asistencia asistencia) {
        Socio socio = asistencia.getSocio();
        String sql = "INSERT INTO asistencia (ID_Socio, ID_Clase, Fecha_Asistencia) VALUES (?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, socio.get);
            statement.setInt(2, asistencia.getIdAclase());
            statement.setDate(3, Date.valueOf(asistencia.getFechaAsistencia())); // LocalDate a Date  

            int filasAfectadas = statement.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Asistencia agregada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al agregar la asistencia.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actualizarAsistencia(Asistencia asistencia) {
        String sql = "UPDATE asistencia SET ID_Socio = ?, ID_Aclase = ?, Fecha_Asistencia = ? WHERE ID_Asistencia = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, asistencia.getIdSocio());
            statement.setInt(2, asistencia.getIdAclase());
            statement.setDate(3, Date.valueOf(asistencia.getFechaAsistencia()));
            statement.setInt(4, asistencia.getIdAsistencia());

            int filasAfectadas = statement.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Asistencia actualizada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar la asistencia.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void borrarAsistencia(int idAsistencia) {
        String sql = "DELETE FROM asistencia WHERE ID_Asistencia = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, idAsistencia);

            int filasAfectadas = statement.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Asistencia eliminada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar la asistencia.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Asistencia listarAsistenciaPorId(int idAsistencia) {
        String sql = "SELECT * FROM asistencia WHERE ID_Asistencia = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, idAsistencia);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    Asistencia asistencia = new Asistencia();
                    asistencia.setIdAsistencia(resultSet.getInt("ID_Asistencia"));
                    asistencia.setIdSocio(resultSet.getInt("ID_Socio"));
                    asistencia.setIdAclase(resultSet.getInt("ID_Aclase"));
                    asistencia.setFechaAsistencia(resultSet.getDate("Fecha_Asistencia").toLocalDate());
                    return asistencia;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Manejar la excepción adecuadamente
        }
        return null;
    }

    public List<Asistencia> listarAsistencias() {
        List<Asistencia> asistencias = new ArrayList<>();
        try {
            String sql = "SELECT * FROM asistencia";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Asistencia asistencia = new Asistencia();
                asistencia.setIdAsistencia(rs.getInt("ID_Asistencia"));
                asistencia.setIdSocio(rs.getInt("ID_Socio"));
                asistencia.setIdAclase(rs.getInt("ID_Aclase"));
                asistencia.setFechaAsistencia(rs.getDate("Fecha_Asistencia").toLocalDate());
                asistencias.add(asistencia);
            }
            ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return asistencias;
    }
}
