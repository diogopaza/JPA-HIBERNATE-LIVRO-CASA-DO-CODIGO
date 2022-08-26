package br.com.diogo.utils;

import javax.persistence.EntityManager;

public class Executar {
	public static void main(String[] args) {
		EntityManager manager = JpaUtil.getEntityManager();
	}
}
