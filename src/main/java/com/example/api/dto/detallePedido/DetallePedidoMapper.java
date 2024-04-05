package com.example.api.dto.detallePedido;

import org.mapstruct.Mapper;


import com.example.api.entidades.DetallePedido;

@Mapper (componentModel = "string")

public interface DetallePedidoMapper {
    
    DetallePedidoDto detallePedidoDto(DetallePedido detallePedido);
    DetallePedido detallePedidoDTOToDetallePedido(DetallePedidoDto detallePedidoDto);

    @org.mapstruct.Mapping(target = "id", ignore = true)
    DetallePedidoDto createDetallePedidoDTOWithoutId(DetallePedido detallePedido);
}
