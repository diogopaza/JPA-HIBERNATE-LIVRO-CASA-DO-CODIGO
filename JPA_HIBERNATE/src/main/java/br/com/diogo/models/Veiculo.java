package br.com.diogo.models;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="tab_veiculo")
public class Veiculo {
	
	@Id //identificador no banco de dados
	@GeneratedValue //identificador deve ter um valor gerado no momento da inserção (auto-incremento)
	private Long codigo;
	@Column(length =60, nullable = false)
	private String fabricante;
	@Column(length =60, nullable = false)
	private String modelo;
	@Column(name="ano_fabricacao", nullable=false)
	private Integer anoFabricacao;
	@Column(name="ano_modelo", nullable=false)
	private Integer anoModelo;
	@Column(precision=10, scale=2, nullable=true)
	private BigDecimal valor;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	
	
	
	

}
