package com.example.api.servicios;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.api.entidades.DetallePedido;
import com.example.api.repositorio.DetallePedidoRepositorio;

@Service

public class DetallePedidoServicio {
    private DetallePedidoRepositorio detallePedidoRepositorio;
    public ArrayList<DetallePedido> obtenerDetallePedido(){
        return (ArrayList<DetallePedido>) detallePedidoRepositorio.findAll();
    }
    public DetallePedido guardarDetallePedido(DetallePedido detallePedido) {
        return detallePedidoRepositorio.save(detallePedido);
    }
    public DetallePedido actualizarDetallePedido(Long id, DetallePedido detallePedidoActualizado) {
        java.util.Optional<DetallePedido> optionalDetallePedido = detallePedidoRepositorio.findById(id);
        if (optionalDetallePedido.isPresent()){
            DetallePedido DetallePedidoExistente = optionalDetallePedido.get();
            DetallePedidoExistente.setPedido(detallePedidoActualizado.getPedido());
            DetallePedidoExistente.setDireccionEnvio(detallePedidoActualizado.getDireccionEnvio());
            DetallePedidoExistente.setTransportadoraEnvio(detallePedidoActualizado.getTransportadoraEnvio());
            DetallePedidoExistente.setNumeroGuiaEnvio(detallePedidoActualizado.getNumeroGuiaEnvio());
            return detallePedidoRepositorio.save(DetallePedidoExistente);
        } else {
            throw new RuntimeException("DetallePedido no encontrado con ID: " + id);
        }
    }
    

    public void eliminarDetallePedido(Long id) {
        detallePedidoRepositorio.deleteById(id);
    }
}
