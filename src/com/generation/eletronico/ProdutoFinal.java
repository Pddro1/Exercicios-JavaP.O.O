package com.generation.eletronico;

import com.generation.eletronico.model.Produto;

public class ProdutoFinal {

	public static void main(String[] args) {

		Produto p1 = new Produto("Notbook","Asus B-459","Intel",892545,"Asus");
		System.out.println(p1.toString());
	}

}
