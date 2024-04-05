package com.example.api.servicios;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.api.entidades.ItemPedido;
import com.example.api.repositorio.ItemPedidoRepositorio;

@Service

public class ItemPedidoServicio {
    private ItemPedidoRepositorio itemPedidoRepositorio;
    public ArrayList<ItemPedido> obtenerItemPedidos(){
        return (ArrayList<ItemPedido>) itemPedidoRepositorio.findAll();
    }
    public ItemPedido guardarItemPedido(ItemPedido itemPedido){
        return itemPedidoRepositorio.save(itemPedido);
    }
        public ItemPedido actualizarItemPedido(Long id, ItemPedido itemPedidoActualizado) {
        java.util.Optional<ItemPedido> optionalItemPedido = itemPedidoRepositorio.findById(id);
        if (optionalItemPedido.isPresent()){
            ItemPedido ItemPedidoExistente = optionalItemPedido.get();
            ItemPedidoExistente.setPedido(itemPedidoActualizado.getPedido());
            ItemPedidoExistente.setProducto(itemPedidoActualizado.getProducto());
            ItemPedidoExistente.setCantidad(itemPedidoActualizado.getCantidad());
            ItemPedidoExistente.setPrecioUnitario(itemPedidoActualizado.getPrecioUnitario());
            return itemPedidoRepositorio.save(ItemPedidoExistente);
        } else {
            throw new RuntimeException("ItemPedido no encontrado con ID: " + id);
        }
    }
    

    public void eliminarItemPedido(Long id) {
        itemPedidoRepositorio.deleteById(id);
    }
}
