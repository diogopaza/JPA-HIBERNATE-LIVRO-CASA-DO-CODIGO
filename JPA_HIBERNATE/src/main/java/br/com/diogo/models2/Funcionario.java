package br.com.diogo.models2;

import java.math.BigDecimal;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("F")
@Getter
@Setter
public class Funcionario extends PessoaHerenca{
	
	private BigDecimal salario;
	private String cargo;
	
	
}
