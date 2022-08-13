package com.generation.conta;

import com.generation.conta.model.Dados;

public class Menu {

	public static void main(String[] args) {
		
		Dados c1 = new Dados("Pedro Henrique",123654,"098.765.432-10",777,8000.0f,"CC");
		System.out.println(c1.toString());
		
		Dados c2 = new Dados("Joao Vitor",123456,"123.456.789-01",789,12000.0f,"CC");
		System.out.println(c2.toString());
	}

}
