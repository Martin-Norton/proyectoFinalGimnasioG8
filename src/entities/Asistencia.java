package entities;

import java.util.Date;

public class Asistencia {
private int idAsistencia;
private int idSocio;
private int idAclase;
private Date fechaAsistencia; //es de tipo

    public Asistencia() {
    }

    public Asistencia(int idAsistencia, int idSocio, int idAclase, Date fechaAsistencia) {
        this.idAsistencia = idAsistencia;
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

    public Date getFechaAsistencia() {
        return fechaAsistencia;
    }

    public void setFechaAsistencia(Date fechaAsistencia) {
        this.fechaAsistencia = fechaAsistencia;
    } 

}
