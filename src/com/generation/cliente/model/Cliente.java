package com.generation.cliente.model;

public class Cliente {
	
	private String nome;
	private String cpf;
	private int id;
	private String compra;
	private float preco;
	
	public Cliente(String nome, String cpf, int id, String compra, float preco) {
		this.nome = nome;
		this.cpf = cpf;
		this.id = id;
		this.compra = compra;
		this.preco = preco;
	}


	public String toString() {
		return "\n\t[Dados do Cliente]" + 
				"\nNome: " + nome + 
				"\nCPF: " + cpf + 
				"\nUsuario: " + id + 
				"\nProduto Comprado: " + compra + 
				"\nValor da Compra: " + preco;
	}
	
	

}
