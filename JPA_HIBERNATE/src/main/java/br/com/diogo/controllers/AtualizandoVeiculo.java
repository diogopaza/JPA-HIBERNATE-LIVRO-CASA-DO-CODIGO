package br.com.diogo.controllers;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.diogo.models.Veiculo;
import br.com.diogo.utils.JpaUtil;

public class AtualizandoVeiculo {
	public static void main(String[] args) {
		EntityManager manager = JpaUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		
		Veiculo veiculo = manager.find(Veiculo.class, 1L);
		
		System.out.println("Veiculo Atual " + veiculo.getModelo() + "Valor: " + veiculo.getValor());
		veiculo.setValor(veiculo.getValor().add(new BigDecimal(500)));
		System.out.println("Novo valor: " + veiculo.getValor());
		
		tx.commit();
		manager.close();
		JpaUtil.close();
		
	}
	
}
