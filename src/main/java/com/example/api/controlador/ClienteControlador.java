package com.example.api.controlador;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.entidades.Cliente;
import com.example.api.servicios.ClienteServicio;

@RestController
@RequestMapping("/cliente")

public class ClienteControlador {
    @Autowired
    ClienteServicio clienteServicio;

    @GetMapping
    public ArrayList<Cliente> obtenerCliente(){
        return clienteServicio.obtenerCliente();
    }

    @PostMapping
    public Cliente guardarCliente(@RequestBody Cliente cliente){
        return this.clienteServicio.guardarCliente(cliente);
    }

    @PutMapping("/{id}")
    public Cliente actualizarCliente(@PathVariable Long id, @RequestBody Cliente cliente) {
        return clienteServicio.actualizarCliente(id, cliente);
    }

    @DeleteMapping("/{id}")
    public void eliminarCliente(@PathVariable Long id) {
        clienteServicio.eliminarCliente(id);
    }

}
