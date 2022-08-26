package br.com.diogo.controllers;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.diogo.models.Proprietario;
import br.com.diogo.models.Proprietario2;
import br.com.diogo.models.TipoCombustivel;
import br.com.diogo.models.Veiculo;
import br.com.diogo.models.VeiculoId;
import br.com.diogo.utils.JpaUtil;

public class PersistindoVeiculo {
	public static void main(String[] args) throws IOException {
		EntityManager manager = JpaUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		
		StringBuilder especificacoes = new StringBuilder();
		especificacoes.append("Carro em excelente estado.\n");
		especificacoes.append("Completo, menos ar.\n");
		especificacoes.append("Primeiro dono, com manual de instrução ");
		especificacoes.append("e todas as revisões feitas.\n");
		especificacoes.append("IPVA pago, aceita financiamento.");
		
		Path path = FileSystems.getDefault().getPath("c:/corsa.jpg");
		byte[] foto = Files.readAllBytes(path);
		
		Proprietario proprietario = new Proprietario();
		proprietario.setEmail("diogo@diogo");
		proprietario.setNome("Diogo Paza");
		proprietario.setTelefone("998513318");
		
		Proprietario2 proprietario2 = new Proprietario2();
		proprietario2.setEmail("augusto@terra.com.br");
		proprietario2.setNome("Augusto Leal");
		proprietario2.setTelefone("8835-9918");	
		
		Proprietario2 proprietario3 = new Proprietario2();
		proprietario3.setEmail("zenilda@uol.com.br");
		proprietario3.setNome("Zenilda Lopes");
		proprietario3.setTelefone("99918-2525");	
		
		manager.persist(proprietario2);
		manager.persist(proprietario3);
		
		Veiculo veiculo = new Veiculo();
		veiculo.setId(new VeiculoId("ABC-132", "Cascavel"));
		veiculo.setFabricante("GM");
		veiculo.setModelo("Corsa sedan");
		veiculo.setAnoFabricacao(2005);
		veiculo.setAnoModelo(2005);
		veiculo.setValor(new BigDecimal(16500));
		veiculo.setTipoCombustivel(TipoCombustivel.ALCOOL);
		veiculo.setDataCadastro(new Date());
		veiculo.setDataCadatro2(LocalDate.now());
		veiculo.setEspecificacoes(especificacoes.toString());
		//veiculo.setFoto(foto);
		veiculo.setProprietario(proprietario);
		veiculo.setProprietario2(proprietario2);
		
		
		
		Veiculo veiculo1 = new Veiculo();
		veiculo1.setId(new VeiculoId("ACC-444", "Toledo"));
		veiculo1.setFabricante("VW");
		veiculo1.setModelo("Gol");
		veiculo1.setAnoFabricacao(2009);
		veiculo1.setAnoModelo(2009);
		veiculo1.setValor(new BigDecimal(21000));
		veiculo1.setTipoCombustivel(TipoCombustivel.GASOLINA);
		veiculo1.setDataCadastro(new Date());
		veiculo1.setDataCadatro2(LocalDate.now());
		veiculo1.setDataCadastro3(new Date());
		
		Veiculo veiculo2 = new Veiculo();
		veiculo2.setId(new VeiculoId("UOL", "Campinas"));
		veiculo2.setFabricante("GM");
		veiculo2.setModelo("Cruze");
		veiculo2.setAnoFabricacao(2020);
		veiculo2.setAnoModelo(2020);
		veiculo2.setValor(new BigDecimal(90000));
		veiculo2.setDataCadastro(new Date());
		veiculo2.setDataCadatro2(LocalDate.now());
	
		
		Veiculo veiculo3 = new Veiculo();
		veiculo3.setId(new VeiculoId("AAA", "Curitiba"));
		veiculo3.setFabricante("FORD");
		veiculo3.setModelo("eCOSPORT");
		veiculo3.setAnoFabricacao(2009);
		veiculo3.setAnoModelo(2009);
		veiculo3.setValor(new BigDecimal(26500));
		veiculo3.setDataCadastro(new Date());
		veiculo3.setDataCadatro2(LocalDate.now());
		veiculo3.setProprietario2(proprietario3);
		
		manager.persist(veiculo);	
		manager.persist(veiculo1);
		manager.persist(veiculo2);
		manager.persist(veiculo3);
		tx.commit();
		JpaUtil.close();	
		
	}
}
