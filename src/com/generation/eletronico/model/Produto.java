package com.generation.eletronico.model;

public class Produto {
	
	private String nome;
	private String placa;
	private String processador;
	private int numSerie;
	private String marca;
	
	
	public Produto(String nome, String placa, String processador, int numSerie, String marca) {
		this.nome = nome;
		this.placa = placa;
		this.processador = processador;
		this.numSerie = numSerie;
		this.marca = marca;
	}


	public String toString() {
		return "\n\t[Especificacoes do Produto]" + 
				"\nTipo: " + nome + 
				"\nPlaca: " + placa + 
				"\nProcessador: " + processador + 
				"\nN.Serie: " + numSerie + 
				"\nMarca: " + marca;
	}
	
	
	

}
