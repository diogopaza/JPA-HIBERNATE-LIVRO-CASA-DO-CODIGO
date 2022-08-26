package br.com.diogo.controllers;

import javax.persistence.EntityManager;

import br.com.diogo.models.Veiculo;
import br.com.diogo.models.VeiculoId;
import br.com.diogo.utils.JpaUtil;

public class BuscandoVeiculo {
	public static void main(String[] args) {
		EntityManager manager = JpaUtil.getEntityManager();

		/*
		 * Veiculo veiculo = manager.find(Veiculo.class, 1L);
		 * System.out.println("Veiculo de código " + veiculo.getCodigo() + " é um " +
		 * veiculo.getModelo());
		 */
		VeiculoId id = new VeiculoId("ABC-132", "Cascavel");		
		Veiculo veiculo = manager.find(Veiculo.class, id);
		//System.out.println(veiculo.getDescricao());
		
		System.out.println("Veículo: " + veiculo.getModelo());
		System.out.println("-------");
		System.out.println(veiculo.getEspecificacoes());
		
		manager.close();
		JpaUtil.close();
	}
}
