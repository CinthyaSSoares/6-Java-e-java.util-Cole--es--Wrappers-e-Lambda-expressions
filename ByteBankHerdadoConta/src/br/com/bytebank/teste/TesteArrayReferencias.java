package br.com.bytebank.teste;

import br.com.bytebank.modelo.Cliente;
import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupanca;

public class TesteArrayReferencias {
	
	public static void main(String[] args) {
		
		//int[] idades = new int[5];
		Object [] referencias = new Object [5];//nasce e morre do mesmo tamanho
		
		ContaCorrente cc1 = new ContaCorrente(11,22);		
		referencias [0] = cc1;
		
		ContaPoupanca cp1 = new ContaPoupanca(33,44);
		referencias [1] = cp1;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
//		ContaPoupanca ref = (ContaPoupanca) referencias[2]; //type cast 
//		System.out.println(ref.getNumero());
		
		System.out.println(cc1);
		System.out.println(cp1);
		System.out.println(cliente);
		
	}

}
