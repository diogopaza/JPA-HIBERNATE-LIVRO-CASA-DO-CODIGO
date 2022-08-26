package br.com.diogo.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.*;

@Getter
@Setter
@Entity
public class Proprietario2 {
	@Id
	@GeneratedValue
	private Long codigo;
	@Column(name="nome_proprietario", nullable=true)
	private String nome;
	@Column(name="telefone_proprietario", nullable=true)
	private String telefone;
	@Column(name="email_proprietario", nullable=true)
	private String email;
	@OneToOne(mappedBy="proprietario2")
	private Veiculo veiculo;

}
