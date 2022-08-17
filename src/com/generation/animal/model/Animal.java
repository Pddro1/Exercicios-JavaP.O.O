package com.generation.animal.model;

public class Animal {

	private String alimento;
	private String sede;
	private int patas;
	private String raca;
	
	
	public Animal(String alimento, String sede, int patas, String raca) {
		this.alimento = alimento;
		this.sede = sede;
		this.patas = patas;
		this.raca = raca;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	public String getRaca() {
		return raca;
	}
	
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public void visualizar() {
		
		System.out.println("************************************************");
		System.out.println("\nRaça do Animal: " + this.getRaca());
		System.out.println("\nTipo de Alimentação: " + this.getAlimento());
		System.out.println("\nLiquido Favorito: " + this.getSede());
		System.out.println("\nNúmero de Patas: " + this.getPatas());
	}
}
