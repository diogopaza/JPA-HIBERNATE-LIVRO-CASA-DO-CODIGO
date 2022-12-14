package br.com.diogo.models;

import java.beans.Transient;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="tab_veiculo")
public class Veiculo {	
	@EmbeddedId
	private VeiculoId id;
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
	@Column(name="tipo_combustivel", nullable= true)
	@Enumerated(EnumType.STRING)
	private TipoCombustivel tipoCombustivel;
	@Temporal(TemporalType.DATE)
	@Column(name="data_cadastro",nullable=true)
	private Date dataCadastro;
	@Column(name="data_2", nullable=true)
	private LocalDate dataCadatro2;
	@Column(name="data_cadastro3",nullable=true)
	private Date dataCadastro3;
	@Lob
	private String especificacoes;
	@Lob
	private byte[] foto;
	@Embedded
	private Proprietario proprietario;
	@OneToOne(optional = true)
	private Proprietario2 proprietario2;
	
		
	
	@Transient
	public String getDescricao() {
		return this.getFabricante() + " " + this.getModelo();
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
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
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
	
	

}
