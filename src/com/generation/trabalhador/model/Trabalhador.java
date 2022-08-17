package com.generation.trabalhador.model;

public abstract class Trabalhador {
	
	private Long id;
	private String nome;
	protected float salario;
	
	
	public Trabalhador(Long id, String nome, float salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public float getSalario() {
		return salario;
	}


	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public abstract void aumentarSalario(float percentual);
	
	public void visualizar() {
		System.out.println("\nId do Trabalhador: " + this.getId());
		System.out.println("\nNome do Trabalhador: " + this.getNome());
		System.out.println("\nSalário do Trabalhador: " + this.getSalario());
	}

	
	

}
