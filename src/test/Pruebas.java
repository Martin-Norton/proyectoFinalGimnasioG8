package test;
import entities.Clase;
import entities.Entrenador;
import java.time.LocalTime;
import persistence.ClaseData;
import persistence.Conexion;
import persistence.EntrenadorData;


public class Pruebas {
    
    private ClaseData alumnoData;
    private Conexion conexion;


    public static void main(String[] args) {
        Conexion.getConexion(); 
        
       
//Crear una clase
    ClaseData clase = new ClaseData();
    Clase clase1 = new Clase("Pilates", 4, LocalTime.parse("13:00:00"), 20, true);
    clase.agregarClase(clase1);
    
//Crear un entrenador
    EntrenadorData ed = new EntrenadorData();
    Entrenador entrenador1 = new Entrenador("Martin", "Norton", "123", "preparacion fisica", true);
    ed.agregarEntrenador(entrenador1);

    }
    
    
}
