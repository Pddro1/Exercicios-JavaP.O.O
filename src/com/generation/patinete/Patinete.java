package com.generation.patinete;

import com.generation.patinete.model.Montagem;

public class Patinete {

	public static void main(String[] args) {

		Montagem p1 = new Montagem("Caloi","Preto","Borracha","Eletrico");
		System.out.println(p1.toString());
		
		Montagem p2 = new Montagem("Etenitap","Azul","Gel","Convencional");
		System.out.println(p2.toString());

	}

}
