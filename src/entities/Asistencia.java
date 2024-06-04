package entities;

import java.time.LocalDate;

public class Asistencia {
private int idAsistencia;
private int idSocio;
private int idAclase;
private LocalDate fechaAsistencia; 

    public Asistencia() {
    }

    public Asistencia(int idSocio, int idAclase, LocalDate fechaAsistencia) {
        this.idSocio = idSocio;
        this.idAclase = idAclase;
        this.fechaAsistencia = fechaAsistencia;
    }


    public int getIdAsistencia() {
        return idAsistencia;
    }

    public void setIdAsistencia(int idAsistencia) {
        this.idAsistencia = idAsistencia;
    }

    public int getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(int idSocio) {
        this.idSocio = idSocio;
    }

    public int getIdAclase() {
        return idAclase;
    }

    public void setIdAclase(int idAclase) {
        this.idAclase = idAclase;
    }

    public LocalDate getFechaAsistencia() {
        return fechaAsistencia;
    }

    public void setFechaAsistencia(LocalDate fechaAsistencia) {
        this.fechaAsistencia = fechaAsistencia;
    }



}
