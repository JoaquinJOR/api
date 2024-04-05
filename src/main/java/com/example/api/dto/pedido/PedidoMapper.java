package com.example.api.dto.pedido;

import org.mapstruct.Mapper;

import com.example.api.entidades.Pedido;

@Mapper (componentModel = "string")

public interface PedidoMapper {
    PedidoDto pedidoDto(Pedido pedido);
    Pedido pedidoDTOTPedido(PedidoDto pedidoDto);

    @org.mapstruct.Mapping(target = "id", ignore = true)
    PedidoDto createPedidoDTOWithoutId(Pedido pedido);

}
