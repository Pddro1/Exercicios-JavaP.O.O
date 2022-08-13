package com.generation.funcionario;

import com.generation.funcionario.model.Informacoes;

public class Pessoa {
	
	public static void main(String[] args) {
		
		Informacoes f1 = new Informacoes("Cleiton Amigo","444.409.123-54",25,"1287-1876","cleiton.amigo@generation.com","Repositor");
		System.out.println(f1.toString());
	}

}
