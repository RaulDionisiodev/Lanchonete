package com.netprecision.lanchonete;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.netprecision.lanchonete.model.Produto;
import com.netprecision.lanchonete.repository.ProdutoRepository;

@SpringBootApplication
public class LanchoneteApplication implements CommandLineRunner {

	@Autowired
	private ProdutoRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(LanchoneteApplication.class, args);
	}
	
	@Override
	public void run(String... args) {
		Produto p1 = new Produto(1147L, "Cachorro quente", 3.00);
		Produto p2 = new Produto(1154L, "Bauru", 2.50);
		Produto p3 = new Produto(1164L, "Misto quente", 2.00);
		Produto p4 = new Produto(1155L, "X-Burguer", 6.00);
		
		repo.saveAll(Arrays.asList(p1,p2,p3,p4));

	}

}
