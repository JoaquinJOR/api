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

import com.example.api.entidades.DetallePedido;
import com.example.api.servicios.DetallePedidoServicio;

@RestController
@RequestMapping("/detallePedido")

public class DetallePedidoControlador {
    
    @Autowired
    DetallePedidoServicio detallePedidoServicio;

    @GetMapping
    public ArrayList<DetallePedido> obtenerDetallePedido(){
        return detallePedidoServicio.obtenerDetallePedido();
    }

    @PostMapping
    public DetallePedido guardarDetallePedido(@RequestBody DetallePedido detallePedido){
        return this.detallePedidoServicio.guardarDetallePedido(detallePedido);
    }

    @PutMapping("/{id}")
    public DetallePedido actualizarDetallePedido(@PathVariable Long id, @RequestBody DetallePedido detallePedido) {
        return detallePedidoServicio.actualizarDetallePedido(id, detallePedido);
    }

    @DeleteMapping("/{id}")
    public void eliminarDetallePedido(@PathVariable Long id) {
        detallePedidoServicio.eliminarDetallePedido(id);
    }
}
