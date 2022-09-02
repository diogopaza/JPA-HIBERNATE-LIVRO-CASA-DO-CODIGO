package br.com.diogo.models2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import br.com.diogo.models.Veiculo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Proprietario2_2 {
	@Id
	@GeneratedValue
	private Long codigo;
	@Column(name = "nome_proprietario", nullable = true)
	private String nome;	
	//@ElementCollection	
	//@Column(name = "numero_telefone", length = 20, nullable = false)
	//private List<Telefone> telefone = new ArrayList<>();
	@ElementCollection
	private List<Telefone> telefone = new ArrayList<>();
	@Column(name = "email_proprietario", nullable = true)
	private String email;
	@OneToMany(mappedBy = "proprietario2_2")
	private List<Veiculo2> veiculos;
}