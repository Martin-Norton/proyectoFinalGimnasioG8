package entities;

import java.util.Date;


public class Membresia {
private int idMembresia;
private int idSocio;
private Date fechaInicio;
private Date fechaFin;
private int cantPases; //a medida que asiste a clases se agota la cap de su membresía (consultar si esto define el tipo de membresía)
private double costo;
private boolean estado;

    public Membresia() {
    }

    public Membresia(int idMembresia, int idSocio, Date fechaInicio, Date fechaFin, int cantPases, double costo, boolean estado) {
        this.idMembresia = idMembresia;
        this.idSocio = idSocio;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cantPases = cantPases;
        this.costo = costo;
        this.estado = estado;
    }

    public int getIdMembresia() {
        return idMembresia;
    }

    public void setIdMembresia(int idMembresia) {
        this.idMembresia = idMembresia;
    }

    public int getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(int idSocio) {
        this.idSocio = idSocio;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getCantPases() {
        return cantPases;
    }

    public void setCantPases(int cantPases) {
        this.cantPases = cantPases;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }



    


}
