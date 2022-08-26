package br.com.diogo.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.*;

@Getter
@Setter
@Embeddable
public class Proprietario {	
	@Column(name="nome_proprietario", nullable=true)
	private String nome;
	@Column(name="telefone_proprietario", nullable=true)
	private String telefone;
	@Column(name="email_proprietario")
	private String email;

}
