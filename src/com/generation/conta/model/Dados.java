package com.generation.conta.model;

public class Dados {

		private String titular;
		private int numero;
		private String cpf;
		private int agencia;
		private float saldo;
		private String tipo;
		
		
		public Dados(String titular, int numero, String cpf, int agencia, float saldo, String tipo) {
			this.titular = titular;
			this.numero = numero;
			this.cpf = cpf;
			this.agencia = agencia;
			this.saldo = saldo;
			this.tipo = tipo;
		}


		public String toString() {
			return "\n********************************" +
				   "\n\tDados da conta" + 
			       "\nTitular: " + titular + 
			       "\nNumero da Conta: " + numero + 
			       "\nCPF do Titular: " + cpf + 
			       "\nAgencia: " + agencia + 
			       "\nSaldo da Conta: " + saldo + 
			       "\nTipo da Conta:" + tipo +
			       "\n********************************";
		}
		
		
}
