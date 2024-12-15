package com.proyecto.microserviciosalud;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class SaludService {

    private List<Salud> registrosSalud = new ArrayList<>();

    public String consultaTelemedicina() {
        return "Consulta médica a distancia realizada con éxito. Conéctese con su médico.";
    }

    public String monitoreoSalud(Salud salud) {
        if (salud.getDatosMonitoreo() != null && salud.getDatosMonitoreo().contains("anomalía")) {
            return "Alerta: Anomalía detectada en los datos de monitoreo. Contacte con un profesional.";
        }
        return "Datos de monitoreo recibidos correctamente: " + salud.getDatosMonitoreo();
    }

    public String obtenerCentrosSalud() {
        List<CentroSalud> centrosSalud = obtenerCentrosDeSaludConectados();
        StringBuilder respuesta = new StringBuilder("Centros de salud conectados:\n");
        for (CentroSalud centro : centrosSalud) {
            respuesta.append("Nombre: ").append(centro.getNombre())
                    .append(", Ubicación: ").append(centro.getUbicacion())
                    .append(", Servicios: ").append(String.join(", ", centro.getServicios()))
                    .append(", Disponibilidad: ").append(centro.getDisponibilidad())
                    .append("\n");
        }
        return respuesta.toString();
    }

    private List<CentroSalud> obtenerCentrosDeSaludConectados() {
        return List.of(
                new CentroSalud("Hospital Central", "Avenida 1, Ciudad A", List.of("Urgencias", "Consultas Externas", "Cirugía"), "24 horas"),
                new CentroSalud("Clínica Salud Viva", "Calle 2, Ciudad B", List.of("Consulta General", "Análisis de Laboratorio"), "De 8 AM a 8 PM"),
                new CentroSalud("Centro de Salud A", "Calle 3, Ciudad C", List.of("Emergencias", "Rehabilitación"), "De 7 AM a 3 PM"),
                new CentroSalud("Centro Médico La Esperanza", "Calle del Sol, Ciudad D", List.of("Urgencias", "Ginecología", "Pediatría", "Cardiología"), "24 horas"),
                new CentroSalud("Clínica Salud Plus", "Av. Principal 45, Ciudad E", List.of("Consulta General", "Oftalmología", "Fisioterapia", "Rayos X"), "De 9 AM a 6 PM"),
                new CentroSalud("Hospital General San Juan", "Av. Reforma, Ciudad F", List.of("Emergencias", "Cirugía General", "Unidad de Cuidados Intensivos", "Laboratorio"), "24 horas"),
                new CentroSalud("Centro de Salud Los Pinos", "Calle 7, Ciudad G", List.of("Medicina Familiar", "Odontología", "Psicología", "Vacunación"), "De 8 AM a 5 PM"),
                new CentroSalud("Policlínica Las Américas", "Av. Las Américas, Ciudad H", List.of("Urgencias", "Consulta Externa", "Análisis Clínicos", "Rehabilitación"), "De 7 AM a 9 PM"),
                new CentroSalud("Clínica Santa Teresa", "Calle del Norte, Ciudad I", List.of("Neurología", "Cardiología", "Medicina Interna", "Endocrinología"), "De 6 AM a 2 PM"),
                new CentroSalud("Hospital Ángeles", "Av. Monterrey 112, Ciudad J", List.of("Urgencias", "Terapia Intensiva", "Traumatología", "Urología"), "24 horas")
        );
    }

    public String crearSalud(Salud salud) {
        if (salud == null || salud.getTipoConsulta() == null || salud.getDatosMonitoreo() == null || salud.getCentroSalud() == null) {
            return "Error: Datos incompletos. Por favor, proporcione toda la información necesaria.";
        }
        registrosSalud.add(salud);
        return "Nueva información de salud creada: " + salud.getTipoConsulta() + " - " + salud.getDatosMonitoreo() + " en " + salud.getCentroSalud();
    }

    public List<Salud> obtenerRegistrosSalud() {
        return registrosSalud;
    }

    public Salud obtenerRegistroPorTipoConsulta(String tipoConsulta) {
        for (Salud salud : registrosSalud) {
            if (salud.getTipoConsulta().equalsIgnoreCase(tipoConsulta)) {
                return salud;
            }
        }
        return null;
    }
}