package com.example.api.dto.cliente;

import java.util.List;

import com.example.api.dto.pedido.PedidoDto;

import lombok.Data;
@Data

public class ClienteDto{
    private Long id;
    private String nombre;
    private String email;
    private String direccion;
    private List<PedidoDto> pedidos;
    
}


