package com.example.api.servicios;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.entidades.Cliente;
import com.example.api.repositorio.ClienteRepositorio;

@Service

public class ClienteServicio {
    @Autowired
    private ClienteRepositorio clienteRepositorio;
    public ArrayList<Cliente> obtenerCliente(){
        return (ArrayList<Cliente>) clienteRepositorio.findAll();
    }
    public Cliente guardarCliente(Cliente cliente) {
        return clienteRepositorio.save(cliente);
    }
    public Cliente actualizarCliente(Long id, Cliente clienteActualizado) {
        java.util.Optional<Cliente> optionalCliente = clienteRepositorio.findById(id);
        if (optionalCliente.isPresent()){
            Cliente ClienteExistente = optionalCliente.get();
            ClienteExistente.setNombre(clienteActualizado.getNombre());
            ClienteExistente.setEmail(clienteActualizado.getEmail());
            ClienteExistente.setDireccion(clienteActualizado.getDireccion());
            return clienteRepositorio.save(ClienteExistente);
        } else {
            throw new RuntimeException("Cliente no encontrado con ID: " + id);
        }
    }
    

    public void eliminarCliente(Long id) {
        clienteRepositorio.deleteById(id);
    }
}
