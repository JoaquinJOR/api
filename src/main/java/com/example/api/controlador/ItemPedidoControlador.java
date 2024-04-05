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

import com.example.api.entidades.ItemPedido;
import com.example.api.servicios.ItemPedidoServicio;

@RestController
@RequestMapping("/itemPedido")

public class ItemPedidoControlador {
    
    @Autowired
    ItemPedidoServicio itemPedidoServicio;

    @GetMapping
    public ArrayList<ItemPedido> obtenerItemPedido(){
        return itemPedidoServicio.obtenerItemPedidos();
    }

    @PostMapping
    public ItemPedido guardarItemPedido(@RequestBody ItemPedido itemPedido){
        return this.itemPedidoServicio.guardarItemPedido(itemPedido);
    }

    @PutMapping("/{id}")
    public ItemPedido actualizarItemPedido(@PathVariable Long id, @RequestBody ItemPedido itemPedido) {
        return itemPedidoServicio.actualizarItemPedido(id, itemPedido);
    }

    @DeleteMapping("/{id}")
    public void eliminarItemPedido(@PathVariable Long id) {
        itemPedidoServicio.eliminarItemPedido(id);
    }
}
