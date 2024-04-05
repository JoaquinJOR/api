package com.example.api.dto.detallePedido;

import com.example.api.entidades.Pedido;

import lombok.Data;

@Data

public class DetallePedidoDto {
    private Long id;
    private Pedido pedido;
    private String direccionEnvio;
    private String transportadoraEnvio;
    private String numeroGuiaEnvio;
}
