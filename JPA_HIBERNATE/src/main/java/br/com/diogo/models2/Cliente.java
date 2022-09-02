package br.com.diogo.models2;

import java.math.BigDecimal;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("C")
@Getter
@Setter
public class Cliente extends PessoaHerenca{
	private BigDecimal limiteCredito;
	private BigDecimal rendaMensal;
	private boolean bloqueado;
}
