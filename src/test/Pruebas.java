package test;
import entities.Clase;
import java.time.LocalTime;
import persistence.ClaseData;
import persistence.Conexion;


public class Pruebas {
    
    private ClaseData alumnoData;
    private Conexion conexion;


    public static void main(String[] args) {
        Conexion.getConexion(); 
        
       
//Crear una clase
    ClaseData clase = new ClaseData();
    Clase clase1 = new Clase("Pilates", 4, LocalTime.parse("13:00:00"), 20, true);
    clase.agregarClase(clase1);

    }
    
    
}
