package com.generation.animal.model;

public class Cavalo extends Animal{

	private String nome;
	private int idade;
	private String som;
	private String acao;
	
	
	public Cavalo(String alimento, String sede, int patas, String raca, String nome, int idade, String som, String acao) {
		super(alimento, sede, patas, raca);
		this.nome = nome;
		this.idade = idade;
		this.som = som;
		this.acao = acao;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getSom() {
		return som;
	}
	
	public void setSom(String som) {
		this.som = som;
	}
	
	public String getAcao() {
		return acao;
	}


	public void setAcao(String acao) {
		this.acao = acao;
	}
	
	public void visualizar() {
		super.visualizar();
		
		System.out.println("\nNome do Cavalo: " + this.getNome());
		System.out.println("\nIdade do Cavalo: " + this.getIdade() + " Anos");
		System.out.println("\nSom do Cavalo: " + this.getSom());
		System.out.println("\nA��o do Cavalo: " + this.getAcao());
		System.out.println("\n************************************************");
	}
}
