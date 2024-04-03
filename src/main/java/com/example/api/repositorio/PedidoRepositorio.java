package com.example.api.repositorio;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.api.entidades.Cliente;
import com.example.api.entidades.EstadoPedido;
import com.example.api.entidades.Pedido;

public interface PedidoRepositorio extends JpaRepository<Pedido,Long>{
    List<Pedido> buscarPedidoEntreDosFechas(LocalDateTime startDate, LocalDateTime endDate);

    List<Pedido> buscarPorClienteYEstado(Cliente cliente, EstadoPedido estado);

    @Query("SELECT DISTINCT o FROM Order o JOIN FETCH o.orderItems WHERE o.cliente = :cliente")
    List<Pedido> recuperarPedido(@Param("cliente") Cliente cliente);
}
