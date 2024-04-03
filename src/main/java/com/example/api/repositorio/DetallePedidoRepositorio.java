package com.example.api.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api.entidades.DetallePedido;

public interface DetallePedidoRepositorio extends JpaRepository<DetallePedido,Long>{
    List<DetallePedido> buscarPorIdPedido(Long idPedido);

    List<DetallePedido> buscarPorTransportadora(String transportadora);

    List<DetallePedido> buscarPorEstado(String estado);
}
