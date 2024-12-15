package com.proyecto.microserviciosalud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/salud")
public class SaludController {

    @GetMapping
    public String obtenerSalud() {
        // Lógica para obtener información de salud
        return "Información de salud";
    }

    @PostMapping
    public String crearSalud(@RequestBody String nuevaSalud) {
        // Lógica para crear nueva información de salud
        return "Nueva salud creada";
    }
}