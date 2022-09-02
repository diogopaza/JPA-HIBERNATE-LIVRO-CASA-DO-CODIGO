package br.com.diogo.models2;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.diogo.utils.JpaUtil;

public class PesquisaClienteFuncionario {
	public static void main(String[] args) {
		EntityManager manager = JpaUtil.getEntityManager();		
		List<Cliente> clientes = manager.createQuery("from Cliente", Cliente.class).getResultList();
		for(Cliente c: clientes)
		{
			System.out.println("Cliente:" + c.getNome());
		}
	}
	
}
