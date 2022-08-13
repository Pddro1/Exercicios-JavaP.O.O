package com.generation.patinete.model;

public class Montagem {
	
	private String marca;
	private String cor;
	private String rodas;
	private String tipo;
	
	
	public Montagem(String marca, String cor, String rodas, String tipo) {
		this.marca = marca;
		this.cor = cor;
		this.rodas = rodas;
		this.tipo = tipo;
	}


	public String toString() {
		return "\n\t[Montagem do Patinete]" + 
				"\nMarca: " + marca + 
				"\nCor do Patinete: " + cor + 
				"\nEstilo da Roda: " + rodas + 
				"\nTipo: " + tipo ;
	}


	

}
