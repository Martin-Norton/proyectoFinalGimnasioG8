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
        String sql = "INSERT INTO asistencia (Id_Socio, ID_Clase, Fecha_Asistencia) VALUES (?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, asistencia.getSocio().getIdSocio()); 
            statement.setInt(2, asistencia.getClase().getIdClase()); 
            statement.setDate(3, Date.valueOf(asistencia.getFechaAsistencia()));  

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
        String sql = "UPDATE asistencia SET ID_Socio = ?, ID_Clase = ?, Fecha_Asistencia = ? WHERE ID_Asistencia = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, asistencia.getSocio().getIdSocio()); // Obtener el ID del socio
            statement.setInt(2, asistencia.getClase().getIdClase()); // Obtener el ID de la clase
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

                    // Aquí se deben obtener los objetos Socio y Clase con los IDs correspondientes
                    Socio socio = new Socio();
                    socio.setIdSocio(resultSet.getInt("ID_Socio"));
                    asistencia.setSocio(socio);

                    Clase clase = new Clase();
                    clase.setIdClase(resultSet.getInt("ID_Clase"));
                    asistencia.setClase(clase);

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

                // Aquí se deben obtener los objetos Socio y Clase con los IDs correspondientes
                Socio socio = new Socio();
                socio.setIdSocio(rs.getInt("ID_Socio"));
                asistencia.setSocio(socio);

                Clase clase = new Clase();
                clase.setIdClase(rs.getInt("ID_Clase"));
                asistencia.setClase(clase);

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



