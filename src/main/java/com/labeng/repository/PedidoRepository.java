package com.labeng.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.labeng.entities.Pedidos;

@Repository
public interface PedidoRepository extends JpaRepository<Pedidos, Long> {


}
