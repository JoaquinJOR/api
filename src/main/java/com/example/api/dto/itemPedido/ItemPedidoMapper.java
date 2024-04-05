package com.example.api.dto.itemPedido;

import org.mapstruct.Mapper;

import com.example.api.entidades.ItemPedido;

@Mapper (componentModel = "string")

public interface ItemPedidoMapper {
    ItemPedidoDto itemPedidoDto(ItemPedido itemPedido);
    ItemPedido itemPedidoDTOToItemPedido(ItemPedidoDto itemPedidoDto);

    @org.mapstruct.Mapping(target = "id", ignore = true)
    ItemPedidoDto createItemPedidoDTOWithoutId(ItemPedido itemPedido);
}
