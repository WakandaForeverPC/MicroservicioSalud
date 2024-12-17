package com.proyecto.microserviciosalud;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientService {
    private final List<Patient> patients = new ArrayList<>();

    public PatientService() {
        // Adding some sample patients
        patients.add(new Patient("Juan Pérez", 30, "Mexicana"));
        patients.add(new Patient("María López", 25, "Española"));
        patients.add(new Patient("Carlos García", 40, "Argentina"));
        patients.add(new Patient("Ana Fernández", 35, "Chilena"));
        patients.add(new Patient("Luis Martínez", 50, "Peruana"));
        patients.add(new Patient("Elena Gómez", 28, "Colombiana"));
        patients.add(new Patient("Miguel Torres", 45, "Venezolana"));
        patients.add(new Patient("Lucía Sánchez", 32, "Uruguaya"));
        patients.add(new Patient("Pedro Ramírez", 38, "Paraguaya"));
        patients.add(new Patient("Sofía Díaz", 22, "Boliviana"));
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public Patient admitPatient(Patient patient) {
        patients.add(patient);
        return patient;
    }
}