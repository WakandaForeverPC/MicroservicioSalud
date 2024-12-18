# Microservicio de Salud

Este proyecto es un microservicio de salud desarrollado con Spring Boot y Maven. 
Proporciona una API REST para gestionar pacientes y una interfaz web para visualizar y admitir nuevos pacientes.

## Tecnologías Utilizadas

- **Java 17**
- **Spring Boot 3.2.0**
- **Spring Cloud 2023.0.0**
- **Spring Modulith 1.3.0**
- **Maven**
- **Thymeleaf**
- **JavaScript (Chart.js)**

## Estructura del Proyecto

- `src/main/java/com/proyecto/microserviciosalud/`
  - **MicroservicioSaludApplication.java**: Clase principal que inicia la aplicación Spring Boot.
  - **controller/SaludController.java**: Controlador que maneja las solicitudes HTTP para la gestión de pacientes.
  - **Patient.java**: Clase que representa a un paciente.
  - **PatientService.java**: Servicio que maneja la lógica de negocio relacionada con los pacientes.

- `src/main/resources/`
  - **application.properties**: Archivo de configuración de la aplicación.
  - **templates/board-salud.html**: Plantilla Thymeleaf para la interfaz web.
  - **static/salud/**: Archivos estáticos (JavaScript y CSS).

## Endpoints

- **GET /salud**: Muestra la página principal del sistema de gestión de salud.
- **GET /salud/pacientes**: Devuelve una lista de todos los pacientes en formato JSON.
- **POST /salud/admision**: Admite un nuevo paciente. Recibe un objeto JSON con los datos del paciente.
