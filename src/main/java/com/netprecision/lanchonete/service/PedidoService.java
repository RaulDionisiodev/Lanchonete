package com.netprecision.lanchonete.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netprecision.lanchonete.repository.PedidoRepository;
import com.netprecision.lanchonete.repository.ProdutoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Autowired 
	private ProdutoRepository produtoRepository;

}
