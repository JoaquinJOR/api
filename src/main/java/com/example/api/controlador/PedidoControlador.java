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

import com.example.api.entidades.Pedido;
import com.example.api.servicios.PedidoServicio;

@RestController
@RequestMapping("/pedido")

public class PedidoControlador {
    @Autowired
    PedidoServicio pedidoServicio;

    @GetMapping
    public ArrayList<Pedido> obtenerPedido(){
        return pedidoServicio.obtenerPedido();
    }

    @PostMapping
    public Pedido guardarPedido(@RequestBody Pedido pedido){
        return this.pedidoServicio.guardarPedido(pedido);
    }

    @PutMapping("/{id}")
    public Pedido actualizarPedido(@PathVariable Long id, @RequestBody Pedido pedido) {
        return pedidoServicio.actualizarPedido(id, pedido);
    }

    @DeleteMapping("/{id}")
    public void eliminarPedido(@PathVariable Long id) {
        pedidoServicio.eliminarPedido(id);
    }
}
