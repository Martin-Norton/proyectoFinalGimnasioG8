package entities;

public class Entrenador {
private String nombreEntrenador; 
private String apellidoEntrenador; 
private int idEntrenador;
private String dniEntrenador;
private String especialidad; // armar combo con especialidades posibles desde la vista
private boolean estado;

    public Entrenador() {
    }

    public Entrenador(String nombreEntrenador, String apellidoEntrenador, int idEntrenador, String dniEntrenador, String especialidad, String disponibilidad) {
        this.nombreEntrenador = nombreEntrenador;
        this.apellidoEntrenador = apellidoEntrenador;
        this.idEntrenador = idEntrenador;
        this.dniEntrenador = dniEntrenador;
        this.especialidad = especialidad;

    }

    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    public void setNombreEntrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
    }

    public String getApellidoEntrenador() {
        return apellidoEntrenador;
    }

    public void setApellidoEntrenador(String apellidoEntrenador) {
        this.apellidoEntrenador = apellidoEntrenador;
    }

    public int getIdEntrenador() {
        return idEntrenador;
    }

    public void setIdEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

    public String getDniEntrenador() {
        return dniEntrenador;
    }

    public void setDniEntrenador(String dniEntrenador) {
        this.dniEntrenador = dniEntrenador;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }





}
