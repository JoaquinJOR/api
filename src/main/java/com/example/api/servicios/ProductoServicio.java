package com.example.api.servicios;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.entidades.Producto;
import com.example.api.repositorio.ProductoRepositorio;


@Service

public class ProductoServicio {
    @Autowired
    private ProductoRepositorio productoRepositorio;
    public ArrayList<Producto> obtenerProducto(){
        return (ArrayList<Producto>) productoRepositorio.findAll();
    }
    public Producto guardarProducto(Producto producto) {
        return productoRepositorio.save(producto);
    }
    public Producto actualizarProducto(Long id, Producto productoActualizado) {
        java.util.Optional<Producto> optionalProducto = productoRepositorio.findById(id);
        if (optionalProducto.isPresent()){
            Producto productoExistente = optionalProducto.get();
            productoExistente.setNombre(productoActualizado.getNombre());
            productoExistente.setPrecio(productoActualizado.getPrecio());
            productoExistente.setStock(productoActualizado.getStock());
            return productoRepositorio.save(productoExistente);
        } else {
            throw new RuntimeException("Producto no encontrado con ID: " + id);
        }
    }
    

    public void eliminarProducto(Long id) {
        productoRepositorio.deleteById(id);
    }   
}
