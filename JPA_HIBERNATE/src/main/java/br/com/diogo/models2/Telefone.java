package br.com.diogo.models2;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class Telefone {
	private String prefixo;
	private String numero;
	private String ramal;
	
	public Telefone() {
		
	}
	
	public Telefone(String prefixo,String numero, String ramal) {
		this.prefixo = prefixo;
		this.numero = numero;
		this.ramal = ramal;
	}
	
}
