package br.com.diogo.models2;

import java.beans.Transient;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.diogo.models.Veiculo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Veiculo2 {
	@EmbeddedId
	private VeiculoId2 id;
	@Column(length = 60, nullable = false)
	private String fabricante;
	@Column(length = 60, nullable = false)
	private String modelo;
	@Column(name = "ano_fabricacao", nullable = false)
	private Integer anoFabricacao;
	@Column(name = "ano_modelo", nullable = true)
	private Integer anoModelo;
	@Column(precision = 10, scale = 2, nullable = true)
	private BigDecimal valor;
	@Column(name = "tipo_combustivel", nullable = true)
	@Enumerated(EnumType.STRING)
	private TipoCombustivel2 tipoCombustivel2;
	@Temporal(TemporalType.DATE)
	@Column(name = "data_cadastro", nullable = true)
	private Date dataCadastro;
	@Column(name = "data_2", nullable = true)
	private LocalDate dataCadatro2;
	@Column(name = "data_cadastro3", nullable = true)
	private Date dataCadastro3;
	@Lob
	private String especificacoes;
	@Lob
	private byte[] foto;
	@ManyToOne
	private Proprietario2_2 proprietario2_2;
	@ManyToMany
	private List<Acessorio> acessorios = new ArrayList<Acessorio>();

	// @OneToOne(optional = true)
	// private Proprietario2 proprietario2;
	/*
	 * @ManyToMany
	 * 
	 * @JoinTable(name = "veiculos_acessorios", joinColumns = @JoinColumn(name =
	 * "cod_veiculo"), inverseJoinColumns = @JoinColumn(name = "cod_acessorio"))
	 */

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
		Veiculo2 other = (Veiculo2) obj;
		return Objects.equals(id, other.id);
	}

}
