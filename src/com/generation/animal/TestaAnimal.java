package com.generation.animal;

import com.generation.animal.model.Cachorro;
import com.generation.animal.model.Cavalo;
import com.generation.animal.model.Preguica;

public class TestaAnimal {

	public static void main(String[] args) {

		Cachorro c1 = new Cachorro("Ra��o", "�gua", 4, "Salsicha", "Jorge", 5, "Latido", "Correr");
		c1.visualizar();
		
		Cavalo v1 = new Cavalo("Feno", "�gua", 4, "Mustang", "Rodrigo", 8, "Relincho", "Correr");
		v1.visualizar();
		
		Preguica p1 = new Preguica("Folhas e Frutos", "�gua", 4, "Pregui�a-De-Hoffmann", "Pir�o", 2, "Gemido", "Subir em �rvores");
		p1.visualizar();

	}

}
