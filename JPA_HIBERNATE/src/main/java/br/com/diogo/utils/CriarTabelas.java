package br.com.diogo.utils;

import javax.persistence.Persistence;

public class CriarTabelas {
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("DiogoPU");
		//System.out.println("testando");
	} 

}






