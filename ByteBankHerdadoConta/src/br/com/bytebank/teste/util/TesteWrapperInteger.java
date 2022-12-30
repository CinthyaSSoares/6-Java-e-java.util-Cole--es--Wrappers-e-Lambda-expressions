package br.com.bytebank.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {

		int[] idades = new int[5]; // array

		int idade = 29; // primitivo não é um objeto então não deveria funcionar em array
		// Java faz Interger idadeRef= new Integer(29); para criar um objeto guardando o
		// primitivo

		Integer idadeRef = Integer.valueOf(idade); // Autoboxing - Adicionando primitivos para integer
		int valor = idadeRef.intValue(); // Unboxing

//		String s = args[0];// colocar no args 20 no run configuration
//		Integer numero = Integer.valueOf(s);
//		System.out.println(s);

		// System.out.println(Integer.); //Classe com implementações

		List<Integer> numeros = new ArrayList<Integer>(); // ArrayList
		numeros.add(idade);
		System.out.println(numeros);

		Integer ref = Integer.valueOf("3");
		ref++;
		System.out.println(ref);

	}
}
