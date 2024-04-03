package com.example.api.repositorio;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api.entidades.Producto;

public interface ProductoRepositorio extends JpaRepository<Producto, Long>{
    List<Producto> buscarPorLoQueIngreseElUsuario(String terminoBusqueda);

    List<Producto> buscarEnElStock(int stock);

    List<Producto> buscarPorPrecioMenorYStockMenor(BigDecimal maxPrice, int maxStock);
}
