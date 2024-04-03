package com.example.api.repositorio;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.api.entidades.ItemPedido;
import com.example.api.entidades.Producto;

public interface ItemPedidoRepositorio extends JpaRepository<ItemPedido,Long>{
    List<ItemPedido> buscarPorIdPedido(Long idPedido);

    List<ItemPedido> buscarPorProductoEspecifico(Producto producto);

    @Query("SELECT SUM(oi.precioUnitario * oi.cantidad) FROM OrderItem oi WHERE oi.producto = :producto")
    BigDecimal sumaTotalVentasPorProducto(@Param("producto") Producto producto);
}
