package com.example.api.dto.cliente;

import org.mapstruct.Mapper;


import com.example.api.entidades.Cliente;

@Mapper (componentModel = "string")
public interface ClienteMapper {
    ClienteDto clienteDto(Cliente cliente);
    Cliente clienteDTOToCliente(ClienteDto clienteDto);

    @org.mapstruct.Mapping(target = "id", ignore = true)
    ClienteDto createClienteDTOWithoutId(Cliente cliente);

}
