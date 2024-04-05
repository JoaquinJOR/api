package com.example.api.servicios;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.entidades.Pago;
import com.example.api.repositorio.PagoRepository;

@Service

public class PagoServicio {
    @Autowired
    private PagoRepository pagoRepository;
    public ArrayList<Pago> obtenerPago(){
        return (ArrayList<Pago>) pagoRepository.findAll();
    }
    public Pago guardarPago(Pago pago){
        return pagoRepository.save(pago);
    }
        public Pago actualizarPago(Long id, Pago pagoActualizado) {
        java.util.Optional<Pago> optionalPago = pagoRepository.findById(id);
        if (optionalPago.isPresent()){
            Pago PagoExistente = optionalPago.get();
            PagoExistente.setPedido(pagoActualizado.getPedido());
            PagoExistente.setTotalPago(pagoActualizado.getTotalPago());
            PagoExistente.setFechaPago(pagoActualizado.getFechaPago());
            PagoExistente.setMetodoPago(pagoActualizado.getMetodoPago());
            return pagoRepository.save(PagoExistente);
        } else {
            throw new RuntimeException("Pago no encontrado con ID: " + id);
        }
    }
    

    public void eliminarPago(Long id) {
        pagoRepository.deleteById(id);
    }
}
