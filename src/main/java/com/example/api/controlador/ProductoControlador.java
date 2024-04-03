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

import com.example.api.entidades.Producto;
import com.example.api.servicios.ProductoServicio;

@RestController
@RequestMapping("/producto")

public class ProductoControlador {
    @Autowired
    ProductoServicio productoServicio;

    @GetMapping
    public ArrayList<Producto> obtenerProducto(){
        return productoServicio.obtenerProducto();
    }

    @PostMapping
    public Producto guardarProducto(@RequestBody Producto producto){
        return this.productoServicio.guardarProducto(producto);
    }
    @PutMapping("/{id}")
    public Producto actualizarProducto(@PathVariable Long id, @RequestBody Producto producto) {
        return productoServicio.actualizarProducto(id, producto);
    }

    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable Long id) {
        productoServicio.eliminarProducto(id);
    }
}
