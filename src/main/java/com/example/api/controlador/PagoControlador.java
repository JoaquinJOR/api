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

import com.example.api.entidades.Pago;
import com.example.api.servicios.PagoServicio;

@RestController
@RequestMapping("/pago")

public class PagoControlador {
    @Autowired
    PagoServicio pagoServicio;

    @GetMapping
    public ArrayList<Pago> obtenerPago(){
        return pagoServicio.obtenerPago();
    }

    @PostMapping
    public Pago guardarPago(@RequestBody Pago pago){
        return this.pagoServicio.guardarPago(pago);
    }

    @PutMapping("/{id}")
    public Pago actualizarPago(@PathVariable Long id, @RequestBody Pago pago) {
        return pagoServicio.actualizarPago(id, pago);
    }

    @DeleteMapping("/{id}")
    public void eliminarPago(@PathVariable Long id) {
        pagoServicio.eliminarPago(id);
    }
}
