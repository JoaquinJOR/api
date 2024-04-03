package com.example.api.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api.entidades.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente,Long> {
    List<Cliente> buscarClientesPorCorreo(String email);

    List<Cliente> buscarClientesPorDireccion(String direccion);

    List<Cliente> buscarClientesPorNombre(String nombre);
}
