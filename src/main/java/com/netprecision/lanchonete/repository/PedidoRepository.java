package com.netprecision.lanchonete.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.netprecision.lanchonete.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
	

}