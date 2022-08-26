package br.com.diogo.models2;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

import br.com.diogo.models.Veiculo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class VeiculoId2 implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String cidade;
	private String placa;
	
	
	public VeiculoId2() {}
	
	public VeiculoId2(String cidade, String placa) {
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
		VeiculoId2 other = (VeiculoId2) obj;
		return Objects.equals(cidade, other.cidade) && Objects.equals(placa, other.placa);
	}
	
	

}
