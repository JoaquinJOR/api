package com.example.api.dto.itemPedido;

import com.example.api.entidades.Pedido;
import com.example.api.entidades.Producto;

import lombok.Data;

@Data

public class ItemPedidoDto {
    private Long id;
    private Pedido pedido;
    private Producto producto;
    private Integer cantidad;
    private Double precioUnitario;
}
