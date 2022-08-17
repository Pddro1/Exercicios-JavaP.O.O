package com.generation.animal.model;

public class Cachorro extends Animal {

	private String nome;
	private int idade;
	private String som;
	private String acao;
	
	
	public Cachorro(String alimento, String sede, int patas, String raca, String nome, int idade, String som, String acao) {
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
		System.out.println("\nNome do Cachorro: " + this.getNome());
		System.out.println("\nIdade do Cachorro: " + this.getIdade() + " Anos");
		System.out.println("\nSom emitido pelo Cachorro: " + this.getSom());
		System.out.println("\nAção do Cachorro: " + this.getAcao());
		System.out.println("\n************************************************");
	}
	
}
