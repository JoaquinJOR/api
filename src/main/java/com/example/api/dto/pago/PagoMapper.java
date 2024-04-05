package com.example.api.dto.pago;

import org.mapstruct.Mapper;


import com.example.api.entidades.Pago;

@Mapper (componentModel = "string")

public interface PagoMapper {
    PagoDto pagoDtoDto(Pago pago);
    Pago pagoDTOToPago(PagoDto pagoDto);

    @org.mapstruct.Mapping(target = "id", ignore = true)
    PagoDto createPagoDTOWithoutId(Pago pago);
}
