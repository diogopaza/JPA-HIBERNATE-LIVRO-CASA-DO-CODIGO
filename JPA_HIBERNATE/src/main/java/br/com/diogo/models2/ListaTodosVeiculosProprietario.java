package br.com.diogo.models2;

import javax.persistence.EntityManager;


import br.com.diogo.utils.JpaUtil;

public class ListaTodosVeiculosProprietario {
	public static void main(String[] args) {
		EntityManager manager = JpaUtil.getEntityManager();
		Proprietario2_2 proprietario = manager.find(Proprietario2_2.class, 1L);
		System.out.println("Proprietario: " + proprietario.getNome());
		for(Veiculo2 veiculo : proprietario.getVeiculos()) {
			System.out.println("Veiculo: " + veiculo.getModelo());
		}
		manager.close();
		JpaUtil.close();
	}	
}
