package com.proyecto.microserviciosalud;

public class Salud {
    private String tipoConsulta;
    private String datosMonitoreo;
    private String centroSalud;

    public Salud(String tipoConsulta, String datosMonitoreo, String centroSalud) {
        this.tipoConsulta = tipoConsulta;
        this.datosMonitoreo = datosMonitoreo;
        this.centroSalud = centroSalud;
    }

    public String getTipoConsulta() {
        return tipoConsulta;
    }

    public void setTipoConsulta(String tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }

    public String getDatosMonitoreo() {
        return datosMonitoreo;
    }

    public void setDatosMonitoreo(String datosMonitoreo) {
        this.datosMonitoreo = datosMonitoreo;
    }

    public String getCentroSalud() {
        return centroSalud;
    }

    public void setCentroSalud(String centroSalud) {
        this.centroSalud = centroSalud;
    }
}