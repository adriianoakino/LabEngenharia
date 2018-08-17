package com.labeng.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.labeng.entities.Pedidos;
import com.labeng.repository.PedidoRepository;
import com.labeng.services.PedidosService;

@Service
public class PedidosServiceImpl implements PedidosService {

	@Autowired
	private PedidoRepository _pedidoRepository;

	@Override
	public void addPedido(Pedidos pedido) {
		this._pedidoRepository.save(pedido);
	}

	@Override
	public List<Pedidos> findByAll() {
		return this._pedidoRepository.findAll();
	}
}
