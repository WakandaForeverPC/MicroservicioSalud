package com.proyecto.microserviciosalud.controller;

import com.proyecto.microserviciosalud.Salud;
import com.proyecto.microserviciosalud.SaludService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salud")
public class SaludController {

    @Autowired
    private SaludService saludService;

    @GetMapping("/telemedicina")
    public String consultaTelemedicina() {
        return saludService.consultaTelemedicina();
    }

    @PostMapping("/monitoreo")
    public String monitoreoSalud(@RequestBody Salud salud) {
        return saludService.monitoreoSalud(salud);
    }

    @GetMapping("/centros-salud")
    public String obtenerCentrosSalud() {
        return saludService.obtenerCentrosSalud();
    }

    @GetMapping
    public String obtenerSalud() {
        return "Información general de salud.";
    }

    @PostMapping
    public String crearSalud(@RequestBody Salud salud) {
        return saludService.crearSalud(salud);
    }

    @GetMapping("/registros")
    public List<Salud> obtenerRegistrosSalud() {
        return saludService.obtenerRegistrosSalud();
    }

    @GetMapping("/registro/{tipoConsulta}")
    public Salud obtenerRegistroPorTipoConsulta(@PathVariable String tipoConsulta) {
        return saludService.obtenerRegistroPorTipoConsulta(tipoConsulta);
    }
}