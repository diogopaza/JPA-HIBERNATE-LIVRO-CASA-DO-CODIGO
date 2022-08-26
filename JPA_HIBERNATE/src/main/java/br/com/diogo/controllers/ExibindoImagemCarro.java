package br.com.diogo.controllers;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import br.com.diogo.models.Veiculo;
import br.com.diogo.models.VeiculoId;
import br.com.diogo.utils.JpaUtil;

public class ExibindoImagemCarro {
	public static void main(String[] args) throws IOException {
		EntityManager manager = JpaUtil.getEntityManager();
		VeiculoId id = new VeiculoId("ABC-132", "Cascavel");			
		Veiculo veiculo = manager.find(Veiculo.class, id);
		
		if(veiculo.getFoto() != null) {
			BufferedImage img = ImageIO.read(new ByteArrayInputStream(veiculo.getFoto()));
			JOptionPane.showMessageDialog(null, new JLabel(
					new ImageIcon(img)));
		}else {
			System.out.println("Veiculo não possui foto");
		}
		manager.close();
		JpaUtil.close();
	}
}
