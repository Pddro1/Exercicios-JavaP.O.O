package com.generation.cliente;

import com.generation.cliente.model.Cliente;

public class Venda {

	public static void main(String[] args) {

		Cliente c1 = new Cliente("Pedro","123.456.789-01",4302,"Relogio",320.0f);
		System.out.println(c1.toString());

	}

}
