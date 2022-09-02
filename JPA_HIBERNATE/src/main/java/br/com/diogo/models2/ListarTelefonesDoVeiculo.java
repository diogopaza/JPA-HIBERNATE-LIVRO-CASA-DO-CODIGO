package br.com.diogo.models2;

import javax.persistence.EntityManager;

import br.com.diogo.utils.JpaUtil;

public class ListarTelefonesDoVeiculo {
	public static void main(String[] args) {
		EntityManager manager = JpaUtil.getEntityManager();
		
		Veiculo2 v = manager.find(Veiculo2.class,new VeiculoId2("Sao Paulo","ppoooo") );
		System.out.println("Veiculo: " + v.getId().getPlaca());
		for(Telefone t : v.getProprietario2_2().getTelefone()) {
			System.out.println("Telefone: " + t.getNumero());
		}
		
		//System.out.println("Proprietario: " + proprietario.getNome());
		
		/*or(Telefone telefone : proprietario.getTelefone()) {
			System.out.println("Telefone:" + telefone.getNumero());
		}*/
	}

}
