package br.com.diogo.models;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class VeiculoId implements Serializable{
	private static final long serialVersionUID = 1L;
	private String placa;
	private String cidade;
	
	public VeiculoId() {}
	
	public VeiculoId(String placa, String cidade) {
		super();
		this.placa = placa;
		this.cidade = cidade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cidade, placa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VeiculoId other = (VeiculoId) obj;
		return Objects.equals(cidade, other.cidade) && Objects.equals(placa, other.placa);
	}
	
	
}
