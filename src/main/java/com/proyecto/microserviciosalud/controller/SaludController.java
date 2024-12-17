package com.proyecto.microserviciosalud.controller;

import com.proyecto.microserviciosalud.Patient;
import com.proyecto.microserviciosalud.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SaludController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/salud")
    public String showEmergencies() {
        return "board-salud";
    }

    @GetMapping("/salud/pacientes")
    @ResponseBody
    public List<Patient> getPatients() {
        return patientService.getPatients();
    }

    @PostMapping("/salud/admision")
    @ResponseBody
    public Patient admitPatient(@RequestBody Patient patient) {
        return patientService.admitPatient(patient);
    }
}