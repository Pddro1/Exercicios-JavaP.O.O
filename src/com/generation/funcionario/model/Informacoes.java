package com.generation.funcionario.model;

public class Informacoes {
	
	private String nome;
	private String cpf;
	private int idade;
	private String contatoTel;
	private String contatoEmail;
	private String trabalho;
	
	public Informacoes(String nome, String cpf, int idade, String contatoTel, String contatoEmail, String trabalho) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.contatoTel = contatoTel;
		this.contatoEmail = contatoEmail;
		this.trabalho = trabalho;
	}

	public String toString() {
		return "\n\t[Funcionario]" + 
				"\nNome: " + nome + 
				"\nN.CPF: " + cpf + 
				"\nIdade: " + idade + 
				"\nTelefone: " + contatoTel + 
				"\nEmail: " + contatoEmail + 
				"\nFuncao: " + trabalho;
	}
	
	
	

}
