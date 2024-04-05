package com.example.api.dto.pedido;

import java.sql.Date;
import java.util.List;

import com.example.api.entidades.Cliente;
import com.example.api.entidades.DetallePedido;
import com.example.api.entidades.EstadoPedido;
import com.example.api.entidades.ItemPedido;
import com.example.api.entidades.Pago;

import lombok.Data;

@Data

public class PedidoDto {
    private Long id;
    private Cliente cliente;
    private Date fechaPedido; 
    private EstadoPedido estadoPedido;
    private List<ItemPedido> itemsPedido;
    private Pago pago;
    private DetallePedido detallePedido;
}
