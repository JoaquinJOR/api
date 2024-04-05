package com.example.api.entidades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ClienteTest {

    @Test
    public void testGettersAndSetters() {
        // Configuración de los datos de prueba
        Long id = 1L;
        String nombre = "John Doe";
        String email = "john@example.com";
        String direccion = "123 Main St";

        // Crear una instancia de Cliente utilizando el constructor
        Cliente cliente = new Cliente(id, nombre, email, direccion);

        // Verificar que los getters devuelvan los valores correctos
        assertEquals(id, cliente.getId());
        assertEquals(nombre, cliente.getNombre());
        assertEquals(email, cliente.getEmail());
        assertEquals(direccion, cliente.getDireccion());

        // Crear una instancia de Cliente utilizando setters
        Cliente cliente2 = new Cliente();
        cliente2.setId(id);
        cliente2.setNombre(nombre);
        cliente2.setEmail(email);
        cliente2.setDireccion(direccion);

        // Verificar que los getters devuelvan los valores correctos después de usar los setters
        assertEquals(id, cliente2.getId());
        assertEquals(nombre, cliente2.getNombre());
        assertEquals(email, cliente2.getEmail());
        assertEquals(direccion, cliente2.getDireccion());
    }
}
