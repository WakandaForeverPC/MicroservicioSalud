package com.proyecto.microserviciosalud;

import java.util.List;

public class CentroSalud {

    private String nombre;
    private String ubicacion;
    private List<String> servicios;
    private String disponibilidad;

    public CentroSalud(String nombre, String ubicacion, List<String> servicios, String disponibilidad) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.servicios = servicios;
        this.disponibilidad = disponibilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public List<String> getServicios() {
        return servicios;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }
}