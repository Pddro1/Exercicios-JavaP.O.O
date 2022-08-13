package com.generation.paciente.model;

public class Diagnostico {
	
	private String nome;
	private String doenca;
	private String sangue;
	private String id;
	private String medico;
	
	
	public Diagnostico(String nome, String doenca, String sangue, String id, String medico) {
		this.nome = nome;
		this.doenca = doenca;
		this.sangue = sangue;
		this.id = id;
		this.medico = medico;
	}



	public String toString() {
		return "\n\t[Diagnostico]" + 
			   "\nNome do Paciente: " + nome + 
			   "\nTipo da Doenca: " + doenca + 
			   "\nTipo Sanguineo: " + sangue + 
			   "\nNumero de Atendimento: " + id + 
			   "\nMedico Responsavel: "+ medico;
	}
	
	
	
	

}
