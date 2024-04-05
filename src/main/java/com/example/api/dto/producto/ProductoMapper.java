package com.example.api.dto.producto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.api.entidades.Producto;

@Mapper (componentModel = "string")

public interface ProductoMapper {
    ProductoDto productoDto(Producto producto);
    Producto productoDTOToProducto(ProductoDto ProductoDto);

    @Mapping(target = "id, ignore = true")
    ProductoDto createProductoDTOWithoutId(Producto producto);
}
