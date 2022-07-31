package br.com.diogo.utils;

import jakarta.persistence.Persistence;

public class CriarTabelas {
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("DiogoPU");
	}

}
