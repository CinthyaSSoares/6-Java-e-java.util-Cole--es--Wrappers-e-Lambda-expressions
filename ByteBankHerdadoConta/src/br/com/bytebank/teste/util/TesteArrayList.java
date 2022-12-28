package br.com.bytebank.teste.util;

import java.util.ArrayList;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;

public class TesteArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		// "generics" limitando o tipo de objeto, apenas <Conta>
		Conta cc = new ContaCorrente(55,66);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(77,88);
		lista.add(cc2);
		
		System.out.println(cc);
		System.out.println(cc2);
		
		// .size() mostra o tamanho da array
		// .get(posicao) pega o objeto na posicao
		// .remove(posicao) remove o objeto na posicao
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta ref = (Conta) lista.get(0);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		System.out.println("Tamanho: " + lista.size());
		
		Conta cc3 = new ContaCorrente(90,99);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(91,90);
		lista.add(cc4);
	
			for(int i= 0; i < lista.size(); i++) { //imprimindo todas as contas
				System.out.println(lista.get(i));
			}
			
			System.out.println("------------- OU ------------------");
			
			for(Object oRef : lista) { //Maneira mais prática
				System.out.println(oRef);
			}
	}
}
