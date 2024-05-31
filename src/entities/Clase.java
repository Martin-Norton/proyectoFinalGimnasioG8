package entities;

import java.sql.Time;
import java.time.LocalTime;

public class Clase {
private int idClase;
private String nombreClase;
private int idEntrenador;
private LocalTime horarioClase; // es de tipo time
private int capacidad;// setear en 20
private boolean estado;

    public Clase() {
    }

    public Clase(String nombreClase, int idEntrenador, LocalTime horarioClase, int capacidad, boolean estado) {
        this.nombreClase = nombreClase;
        this.idEntrenador = idEntrenador;
        this.horarioClase = horarioClase;
        this.capacidad = capacidad;
        this.estado = estado;
    }

 
    public int getIdClase() {
        return idClase;
    }

    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    public int getIdEntrenador() {
        return idEntrenador;
    }

    public void setIdEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

    public LocalTime getHorarioClase() {
        return horarioClase;
    }

    public void setHorarioClase(LocalTime horarioClase) {
        this.horarioClase = horarioClase;
    }


    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    




}
