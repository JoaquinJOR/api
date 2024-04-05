package com.example.api.entidades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ProductoTest {

    @Test
    public void testGettersAndSetters() {
        // Configuración de los datos de prueba
        Long id = 1L;
        String nombre = "Producto1";
        Double precio = 10.5;
        Integer stock = 100;

        // Crear una instancia de Producto utilizando el constructor
        Producto producto = new Producto(id, nombre, precio, stock);

        // Verificar que los getters devuelvan los valores correctos
        assertEquals(id, producto.getId());
        assertEquals(nombre, producto.getNombre());
        assertEquals(precio, producto.getPrecio());
        assertEquals(stock, producto.getStock());

        // Crear una instancia de Producto utilizando setters
        Producto producto2 = new Producto();
        producto2.setId(id);
        producto2.setNombre(nombre);
        producto2.setPrecio(precio);
        producto2.setStock(stock);

        // Verificar que los getters devuelvan los valores correctos después de usar los setters
        assertEquals(id, producto2.getId());
        assertEquals(nombre, producto2.getNombre());
        assertEquals(precio, producto2.getPrecio());
        assertEquals(stock, producto2.getStock());
    }
}

