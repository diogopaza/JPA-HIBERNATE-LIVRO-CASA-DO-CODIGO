package br.com.diogo.models2;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.diogo.utils.JpaUtil;

public class PersisteClienteFuncionarioHeranca {
	public static void main(String[] args) {
		EntityManager manager = JpaUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		
		Cliente c = new Cliente();
		c.setNome("Joao");
		c.setLimiteCredito(new BigDecimal(2000));
		
		Funcionario f = new Funcionario();
		f.setNome("beto");
		f.setCargo("gerente");
		
		manager.persist(c);
		manager.persist(f);
		tx.commit();
		manager.close();
		
	}

}
