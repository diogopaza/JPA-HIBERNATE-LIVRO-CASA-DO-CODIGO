package br.com.diogo.controllers;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.diogo.models.Proprietario2;
import br.com.diogo.models.Veiculo;
import br.com.diogo.utils.JpaUtil;

public class ListandoVeiculos {
	public static void main(String[] args) {
		EntityManager manager = JpaUtil.getEntityManager();
		/*
		 * Query query = manager.createQuery("from Veiculo"); List<Veiculo> veiculos =
		 * query.getResultList(); for (Veiculo veiculo : veiculos) {
		 * System.out.println("Veiculo: " + veiculo.getModelo() + " - " +
		 * veiculo.getDataCadatro2()); }
		 */
		/*
		 * List<Veiculo> veiculos = manager.createQuery("from Veiculo",
		 * Veiculo.class).getResultList(); for(Veiculo veiculo : veiculos) {
		 * if(veiculo.getProprietario2() != null) {
		 * System.out.println(veiculo.getModelo() + " - " +
		 * veiculo.getProprietario2().getNome()); } }
		 */
		List<Proprietario2> proprietarios = manager.createQuery("from Proprietario2", Proprietario2.class)
				.getResultList();
		for (Proprietario2 proprietario : proprietarios) {
			System.out.println(proprietario.getVeiculo().getModelo() + " - " + proprietario.getNome());
		}

		manager.close();
		JpaUtil.close();
	}

}
