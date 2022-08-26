package br.com.diogo.models2;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.diogo.controllers.AtualizandoVeiculo;
import br.com.diogo.utils.JpaUtil;

public class ConsultaAcessorios {
	public static void main(String[] args) {
		EntityManager manager = JpaUtil.getEntityManager();
		/*
		 * VeiculoId2 veiculoID = new VeiculoId2("Porto Alegre","XXBA"); Veiculo2
		 * veiculo= manager.find(Veiculo2.class, veiculoID);
		 * System.out.println(veiculo.getModelo()); for(Acessorio acessorio :
		 * veiculo.getAcessorios()) { System.out.println("Acessorio: " +
		 * acessorio.getDescricao()); }
		 */
		Acessorio a = manager.find(Acessorio.class, 3L);
		System.out.println("Acessorio: " + a.getDescricao());
		List<Veiculo2> veiculos = a.getVeiculos();
		for (Veiculo2 v : veiculos) {
			VeiculoId2 vID = v.getId();
			System.out.println("PLACA: " + vID.getPlaca());
		}

	}
}
