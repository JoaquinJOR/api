package com.example.api.dto.pago;

import java.sql.Date;

import com.example.api.entidades.MetodoPago;
import com.example.api.entidades.Pedido;

import lombok.Data;

@Data

public class PagoDto {
    private Long id;
    private Pedido pedido;
    private Double totalPago;
    private Date fechaPago;
    private MetodoPago metodoPago;
}
