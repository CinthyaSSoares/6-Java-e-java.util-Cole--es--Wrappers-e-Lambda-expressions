package br.com.bytebank.teste;

import br.com.bytebank.modelo.ContaCorrente;

public class TesteArrayReferencias {
	
	public static void main(String[] args) {
		
		//int[] idades = new int[5];
		ContaCorrente [] contas = new ContaCorrente [5];
		
		ContaCorrente cc1 = new ContaCorrente(11,22);		
		contas [0] = cc1;
		
		ContaCorrente cc2 = new ContaCorrente(33,11);
		contas [2] = cc2;
		
		System.out.println(cc1);
		System.out.println(cc2);
		
	}

}
