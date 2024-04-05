package com.example.api.repositorio;

import com.example.api.entidades.Cliente;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

@DataJpaTest
class ClienteRepositorioTest {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Test
    public void testSaveCliente() {
        // Arrange
        Cliente cliente = new Cliente();
        cliente.setNombre("Juan");
        cliente.setEmail("juan@example.com");
        cliente.setDireccion("Calle 123");

        // Act
        Cliente savedCliente = clienteRepositorio.save(cliente);

        // Assert
        assertNotNull(savedCliente.getId());
    }

    // Otros métodos de prueba

    @Test
    void findByEmail() {
        // Arrange
        Cliente cliente = new Cliente();
        cliente.setNombre("Juan");
        cliente.setEmail("juan@example.com");
        cliente.setDireccion("Calle 123");
        clienteRepositorio.save(cliente);

        // Act
        Cliente foundCliente = clienteRepositorio.buscarClientesPorCorreo("juan@example.com").get(0);

        // Assert
        assertNotNull(foundCliente);
        assertEquals("juan@example.com", foundCliente.getEmail());
    }

    @Test
    void findByDireccion() {
        // Arrange
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Juan");
        cliente1.setEmail("juan@example.com");
        cliente1.setDireccion("Calle 123");
        clienteRepositorio.save(cliente1);

        Cliente cliente2 = new Cliente();
        cliente2.setNombre("Pedro");
        cliente2.setEmail("pedro@example.com");
        cliente2.setDireccion("Calle 123");
        clienteRepositorio.save(cliente2);

        // Act
        List<Cliente> clientes = clienteRepositorio.buscarClientesPorDireccion("Calle 123");

        // Assert
        assertNotNull(clientes);
        assertEquals(2, clientes.size());
    }

    @Test
    void findByNombre() {
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Juan");
        cliente1.setEmail("juan@example.com");
        cliente1.setDireccion("Calle 123");
        clienteRepositorio.save(cliente1);

        Cliente cliente2 = new Cliente();
        cliente2.setNombre("Pedro");
        cliente2.setEmail("pedro@example.com");
        cliente2.setDireccion("Calle 456");
        clienteRepositorio.save(cliente2);

        // Act
        List<Cliente> clientes = clienteRepositorio.buscarClientesPorNombre("Juan");

        // Assert
        assertNotNull(clientes);
        assertEquals(1, clientes.size());
    }
}
