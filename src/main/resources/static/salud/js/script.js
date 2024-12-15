const telemedicinaButton = document.getElementById('telemedicinaButton');
const monitoreoButton = document.getElementById('monitoreoButton');
const centrosButton = document.getElementById('centrosButton');
const crearSaludButton = document.getElementById('crearSaludButton');
const registrosButton = document.getElementById('registrosButton');
const registroButton = document.getElementById('registroButton');

const telemedicinaResponse = document.getElementById('telemedicinaResponse');
const monitoreoResponse = document.getElementById('monitoreoResponse');
const centrosResponse = document.getElementById('centrosResponse');
const crearSaludResponse = document.getElementById('crearSaludResponse');
const registrosResponse = document.getElementById('registrosResponse');
const registroResponse = document.getElementById('registroResponse');

const hacerPeticion = async (url, metodo, datos = null) => {
    try {
        const respuesta = await fetch(url, {
            method: metodo,
            headers: {
                'Content-Type': 'application/json'
            },
            body: datos ? JSON.stringify(datos) : null
        });
        const data = await respuesta.json();
        return data;
    } catch (error) {
        console.error('Error al hacer la petición:', error);
    }
};

telemedicinaButton.addEventListener('click', async () => {
    const resultado = await hacerPeticion('/salud/telemedicina', 'GET');
    telemedicinaResponse.textContent = resultado;
});

monitoreoButton.addEventListener('click', async () => {
    const datosMonitoreo = document.getElementById('monitoreoData').value;
    const resultado = await hacerPeticion('/salud/monitoreo', 'POST', { datosMonitoreo });
    monitoreoResponse.textContent = resultado;
});

centrosButton.addEventListener('click', async () => {
    const resultado = await hacerPeticion('/salud/centros-salud', 'GET');
    centrosResponse.textContent = resultado;
});

crearSaludButton.addEventListener('click', async () => {
    const tipoConsulta = document.getElementById('tipoConsulta').value;
    const datosMonitoreo = document.getElementById('datosMonitoreo').value;
    const centroSalud = document.getElementById('centroSalud').value;

    if (!tipoConsulta || !datosMonitoreo || !centroSalud) {
        crearSaludResponse.textContent = "Por favor, complete todos los campos.";
        return;
    }

    const resultado = await hacerPeticion('/salud', 'POST', { tipoConsulta, datosMonitoreo, centroSalud });
    crearSaludResponse.textContent = resultado;
});

registrosButton.addEventListener('click', async () => {
    const resultado = await hacerPeticion('/salud/registros', 'GET');
    registrosResponse.textContent = JSON.stringify(resultado);
});

registroButton.addEventListener('click', async () => {
    const tipoConsulta = document.getElementById('tipoConsultaRegistro').value;
    const resultado = await hacerPeticion(`/salud/registro/${tipoConsulta}`, 'GET');
    registroResponse.textContent = JSON.stringify(resultado);
});