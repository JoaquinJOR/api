package com.example.api.servicios;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.api.entidades.Pedido;
import com.example.api.repositorio.PedidoRepositorio;

@Service

public class PedidoServicio {
    private PedidoRepositorio pedidoRepositorio;
    public ArrayList<Pedido> obtenerPedido(){
        return (ArrayList<Pedido>) pedidoRepositorio.findAll();
    }
    public Pedido guardarPedido(Pedido pedido){
        return pedidoRepositorio.save(pedido);
    }
        public Pedido actualizarPedido(Long id, Pedido pedidoActualizado) {
        java.util.Optional<Pedido> optionalPedido = pedidoRepositorio.findById(id);
        if (optionalPedido.isPresent()){
            Pedido PedidoExistente = optionalPedido.get();
            PedidoExistente.setCliente(pedidoActualizado.getCliente());
            PedidoExistente.setFechaPedido(pedidoActualizado.getFechaPedido());
            PedidoExistente.setEstado(pedidoActualizado.getEstado());
            PedidoExistente.setItemsPedido(pedidoActualizado.getItemsPedido());
            PedidoExistente.setPago(pedidoActualizado.getPago());
            PedidoExistente.setDetallePedido(pedidoActualizado.getDetallePedido());
            return pedidoRepositorio.save(PedidoExistente);
        } else {
            throw new RuntimeException("Pedido no encontrado con ID: " + id);
        }
    }
    

    public void eliminarPedido(Long id) {
        pedidoRepositorio.deleteById(id);
    }
}
