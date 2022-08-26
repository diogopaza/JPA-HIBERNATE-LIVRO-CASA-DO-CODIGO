package br.com.diogo.models2;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.diogo.models.Veiculo;
import br.com.diogo.utils.JpaUtil;

public class PersistirVeiculo2 {
	public static void main(String[] args) {
		EntityManager manager = JpaUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		
		Proprietario2_2 proprietario = new Proprietario2_2();
		proprietario.setNome("Diogo Paza");
		proprietario.setEmail("diogopaza@live.com");
		proprietario.setTelefone("8889999");
		
		Proprietario2_2 proprietario2 = new Proprietario2_2();
		proprietario2.setNome("Renan");
		proprietario2.setEmail("reana@live.com");
		proprietario2.setTelefone("999558822");
		
		Acessorio alarme = new Acessorio();
		alarme.setDescricao("Alarme");
		Acessorio arCondicionado = new Acessorio();
		arCondicionado.setDescricao("Ar condicionado");
		Acessorio bancosDeCouro = new Acessorio();
		bancosDeCouro.setDescricao("Bancos de couro");
		
		manager.persist(alarme);
		manager.persist(arCondicionado);
		manager.persist(bancosDeCouro);
		
		manager.persist(proprietario);
		manager.persist(proprietario2);
		
		VeiculoId2 id = new VeiculoId2("Porto Alegre","XXBA");
		Veiculo2 veiculo = new Veiculo2();
		veiculo.setId(id);
		veiculo.setModelo("GOL");
		veiculo.setAnoFabricacao(2010);
		veiculo.setTipoCombustivel2(TipoCombustivel2.ALCOOL);
		veiculo.setProprietario2_2(proprietario);
		veiculo.setFabricante("VW");
		veiculo.getAcessorios().add(bancosDeCouro);
		veiculo.getAcessorios().add(arCondicionado);
		
		
		
		
		VeiculoId2 id2 = new VeiculoId2("Santos","MMNN");
		Veiculo2 veiculo3 = new Veiculo2();
		veiculo3.setId(id2);
		veiculo3.setFabricante("VW");
		veiculo3.setModelo("Gol");
		veiculo3.setAnoFabricacao(2010);
		veiculo3.setAnoModelo(2010);
		veiculo3.setValor(new BigDecimal(17_200));
		veiculo3.setTipoCombustivel2(TipoCombustivel2.BICOMBUSTIVEl);
		veiculo3.setDataCadastro(new Date());
		veiculo3.getAcessorios().add(bancosDeCouro);
		veiculo3.setProprietario2_2(proprietario);
		
		
		VeiculoId2 id3 = new VeiculoId2("Sao Paulo","ppoooo");
		Veiculo2 veiculo4 = new Veiculo2();
		veiculo4.setId(id3);
		veiculo4.setFabricante("VW");
		veiculo4.setModelo("kombi");
		veiculo4.setAnoFabricacao(2010);
		veiculo4.setAnoModelo(2010);
		veiculo4.setValor(new BigDecimal(17_200));
		veiculo4.setTipoCombustivel2(TipoCombustivel2.BICOMBUSTIVEl);
		veiculo4.setDataCadastro(new Date());
		veiculo4.setProprietario2_2(proprietario2);
		
		manager.persist(veiculo);
		manager.persist(veiculo3);
		manager.persist(veiculo4);
		tx.commit();
		JpaUtil.close();	
		
	}
	
}
