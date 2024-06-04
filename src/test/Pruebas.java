package test;
import entities.Asistencia;
import entities.Clase;
<<<<<<< HEAD
import java.time.LocalDate;
=======
import entities.Entrenador;
>>>>>>> 5f9ff6cda4872caacc6231d98793e89c92138775
import java.time.LocalTime;
import persistence.AsistenciaData;
import persistence.ClaseData;
import persistence.Conexion;
import persistence.EntrenadorData;


public class Pruebas {
    
    private Conexion conexion;
    private ClaseData claseData;
    private AsistenciaData asistenciaData;


    public static void main(String[] args) {
        Conexion.getConexion(); 
        
       
//Crear una clase
<<<<<<< HEAD
//    ClaseData clase = new ClaseData();
//    Clase clase1 = new Clase("Boxeo", 4, LocalTime.parse("13:00:00"), 20, true);
//    clase.agregarClase(clase1);
    
    
// Crear una asistencia
//
//    AsistenciaData asistencia = new AsistenciaData();
//    Asistencia asist1 = new Asistencia(1, 6, LocalDate.of(2024, 5, 15)); 
//    asistencia.agregarAsistencia(asist1);
//    
    
=======
    ClaseData clase = new ClaseData();
    Clase clase1 = new Clase("Pilates", 4, LocalTime.parse("13:00:00"), 20, true);
    clase.agregarClase(clase1);
    
//Crear un entrenador
    EntrenadorData ed = new EntrenadorData();
    Entrenador entrenador1 = new Entrenador("Martin", "Norton", "123", "preparacion fisica", true);
    ed.agregarEntrenador(entrenador1);
>>>>>>> 5f9ff6cda4872caacc6231d98793e89c92138775

    }
    
    
}
