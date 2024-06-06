package persistence;
import entities.Clase;
import entities.Entrenador;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

public class ClaseData {
    private Connection connection;

    public ClaseData() {
        connection = Conexion.getConexion();
    }

    public void agregarClase(Clase clase) {
        String query = "INSERT INTO clases (Nombre, Id_Entrenador, Horario, Capacidad, Estado) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, clase.getNombreClase());
            ps.setInt(2, clase.getEntrenador().getIdEntrenador());
            ps.setTime(3, Time.valueOf(clase.getHorarioClase()));
            ps.setInt(4, clase.getCapacidad());
            ps.setBoolean(5, clase.isEstado());
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Clase agregada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al agregar la clase.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Clase> listarClases() {
        List<Clase> clases = new ArrayList<>();
        String query = "SELECT * FROM clases";
        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                Clase clase = new Clase();
                clase.setIdClase(rs.getInt("Id_Clase"));
                clase.setNombreClase(rs.getString("Nombre"));
                // Aquí deberías cargar el entrenador desde la base de datos
                Entrenador entrenador = new Entrenador(); // Aquí deberías cargar el entrenador desde la base de datos
                clase.setEntrenador(entrenador);
                clase.setHorarioClase(rs.getTime("Horario").toLocalTime());
                clase.setCapacidad(rs.getInt("Capacidad"));
                clase.setEstado(rs.getBoolean("Estado"));
                clases.add(clase);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clases;
    }

    public Clase listarClasesPorId(int id) {
        Clase clase = null;
        String query = "SELECT * FROM clases WHERE Id_Clase = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    clase = new Clase();
                    clase.setIdClase(rs.getInt("Id_Clase"));
                    clase.setNombreClase(rs.getString("Nombre"));
                    // Aquí deberías cargar el entrenador desde la base de datos
                    Entrenador entrenador = new Entrenador(); // Aquí deberías cargar el entrenador desde la base de datos
                    clase.setEntrenador(entrenador);
                    clase.setHorarioClase(rs.getTime("Horario").toLocalTime());
                    clase.setCapacidad(rs.getInt("Capacidad"));
                    clase.setEstado(rs.getBoolean("Estado"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clase;
    }

    public void actualizarClase(Clase clase) {
        String query = "UPDATE clases SET Nombre = ?, Id_Entrenador = ?, Horario = ?, Capacidad = ?, Estado = ? WHERE Id_Clase = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, clase.getNombreClase());
            ps.setInt(2, clase.getEntrenador().getIdEntrenador());
            ps.setTime(3, Time.valueOf(clase.getHorarioClase()));
            ps.setInt(4, clase.getCapacidad());
            ps.setBoolean(5, clase.isEstado());
            ps.setInt(6, clase.getIdClase());
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Clase actualizada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar la clase.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void borrarClase(int id) {
        String query = "DELETE FROM clases WHERE Id_Clase = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, id);
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Clase eliminada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar la clase.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


