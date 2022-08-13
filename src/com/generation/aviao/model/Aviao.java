package com.generation.aviao.model;

public class Aviao {
	
	private int portao;
	private String serie;
	private String piloto;
	private String embarque;
	private String destino;
	private float km;
	
	public Aviao(int portao, String serie, String piloto, String embarque, String destino, float km) {
		this.portao = portao;
		this.serie = serie;
		this.piloto = piloto;
		this.embarque = embarque;
		this.destino = destino;
		this.km = km;
	}

	
	public String toString() {
		return "\n\t[Detalhes da Viagem]" + 
				"\nN. do Portao: " + portao + 
				"\nN. de Serie do Aviao: " + serie + 
				"\nNome do Piloto: " + piloto + 
				"\nLocal de Embarque: " + embarque + 
				"\nLocal de Destino: " + destino + 
				"\nDistancia da Viagem: " + km;
	}
	
	
	
	
}
