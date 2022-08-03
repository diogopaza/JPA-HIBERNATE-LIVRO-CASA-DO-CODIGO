package br.com.diogo.controllers;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.diogo.models.Veiculo;
import br.com.diogo.utils.JpaUtil;

public class PersistindoVeiculo {
	public static void main(String[] args) {
		EntityManager manager = JpaUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		
		Veiculo veiculo = new Veiculo();
		veiculo.setFabricante("GM");
		veiculo.setModelo("Corsa sedan");
		veiculo.setAnoFabricacao(2005);
		veiculo.setAnoModelo(2005);
		veiculo.setValor(new BigDecimal(16500));
		/*
		Veiculo veiculo = new Veiculo();
		veiculo.setFabricante("VW");
		veiculo.setModelo("Gol");
		veiculo.setAnoFabricacao(2009);
		veiculo.setAnoModelo(2009);
		veiculo.setValor(new BigDecimal(21000));*/
		
		manager.persist(veiculo);		
		tx.commit();
		JpaUtil.close();	
		
	}
}
