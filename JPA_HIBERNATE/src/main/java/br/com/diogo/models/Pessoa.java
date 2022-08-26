package br.com.diogo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Pessoa {

	@Id
	@GeneratedValue(generator = "inc")
	@GenericGenerator(name="inc", strategy = "increment")
	private long codigo;
	
	private String nome;
}
