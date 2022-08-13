package com.generation.paciente;

import com.generation.paciente.model.Diagnostico;

public class Paciente {

	public static void main(String[] args) {

		Diagnostico p1 = new Diagnostico("Pedro Henrique","Virose","O-","64672-2","Dr. Carlos");
		System.out.println(p1.toString());

	}

}
