package br.com.bytebank.teste.util;

import java.util.ArrayList;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		// "generics" limitando o tipo de objeto, apenas <Conta>
		Conta cc = new ContaCorrente(11, 22);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(33, 44);
		lista.add(cc2);

		Conta cc3 = new ContaCorrente(33, 44);

		// Vendo se o objeto existe
		boolean existe = lista.contains(cc3);
		System.out.println("Já existe? " + existe);
//		
//		for(Conta conta : lista) {
//			if(conta.ehIgual(cc3)) {
//				System.out.println(" Já tenho essa conta!");
//			}
//		}

		// Maneira mais prática de ver todos os objetos
		for (Object oRef : lista) {
			System.out.println(oRef);
		}

	}
}
