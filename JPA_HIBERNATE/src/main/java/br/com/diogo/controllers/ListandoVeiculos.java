package br.com.diogo.controllers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.diogo.models.Veiculo;
import br.com.diogo.utils.JpaUtil;

public class ListandoVeiculos {
	public static void main(String[] args) {
		EntityManager manager = JpaUtil.getEntityManager();

		Query query = manager.createQuery("from Veiculo");
		List<Veiculo> veiculos = query.getResultList();

		for (Veiculo veiculo : veiculos) {
			System.out.println("Veiculo: " + veiculo.getModelo());
		}
		manager.close();
		JpaUtil.close();
	}

}
