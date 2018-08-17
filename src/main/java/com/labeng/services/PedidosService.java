package com.labeng.services;

import java.util.List;

import com.labeng.entities.Pedidos;

public interface PedidosService {

	void addPedido(Pedidos pedido);
	List<Pedidos> findByAll();
	
	
	
}
