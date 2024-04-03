package com.example.api.repositorio;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api.entidades.MetodoPago;
import com.example.api.entidades.Pago;
import com.example.api.entidades.Pedido;

public interface PagoRepository extends JpaRepository<Pago,Long>{
    List<Pago> recuperarPagoEntreDosFechas(LocalDateTime fechaInicio, LocalDateTime fechaFin);

    List<Pago> recuperarPagoPorIdentificadorDeOrdenYMetodoDePago(Pedido pedido, MetodoPago metodoDePago);
}
