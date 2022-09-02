package br.com.diogo.models2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Acessorio {
	@Id
	@GeneratedValue
	private Long codigo;
	private String descricao;	
	@ManyToMany(mappedBy="acessorios")
	private List<Veiculo2> veiculos = new ArrayList<Veiculo2>();
	
}
