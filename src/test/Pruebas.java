package test;

import entities.Asistencia;
import entities.Clase;


import entities.Entrenador;
import entities.Socio;
import java.time.LocalDate;
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
//    ClaseData clase = new ClaseData();
//    Clase clase1 = new Clase("Boxeo", 4, LocalTime.parse("13:00:00"), 20, true);
//    clase.agregarClase(clase1);
    
//// Crear una asistencia    
//    Socio socio1 = new Socio("135465", "Felipe", "Juarez", 30, "hab@yopmail.com", "3471688", true);
//    Clase clase1 = new Clase("Boxeo", 4, LocalTime.parse("13:00:00"), 20, true);           
//    AsistenciaData asistencia = new AsistenciaData();
//    Asistencia asist1 = new Asistencia(socio1, clase1, LocalDate.of(2024, 5, 15));
//    asistencia.agregarAsistencia(asist1);


//Crear un entrenador
    EntrenadorData ed = new EntrenadorData();
    Entrenador entrenador1 = new Entrenador("Martin", "Norton", "123", "preparacion fisica", true);
    ed.agregarEntrenador(entrenador1);

    }
    
    
}
