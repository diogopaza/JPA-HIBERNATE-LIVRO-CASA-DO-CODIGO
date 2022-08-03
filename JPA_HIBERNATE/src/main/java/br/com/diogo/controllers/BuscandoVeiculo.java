package br.com.diogo.controllers;

import javax.persistence.EntityManager;

import br.com.diogo.models.Veiculo;
import br.com.diogo.utils.JpaUtil;

public class BuscandoVeiculo {
	public static void main(String[] args) {
		EntityManager manager = JpaUtil.getEntityManager();
		
		Veiculo veiculo = manager.find(Veiculo.class, 1L);
		
		System.out.println("Veiculo de c�digo " + veiculo.getCodigo() + " � um " + veiculo.getModelo());
		manager.close();
		JpaUtil.close();	
	}
}


