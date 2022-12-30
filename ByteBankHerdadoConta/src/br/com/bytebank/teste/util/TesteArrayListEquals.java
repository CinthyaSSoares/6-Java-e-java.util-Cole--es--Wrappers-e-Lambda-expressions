package br.com.bytebank.teste.util;

import java.util.ArrayList; //ruim quando excluir pois reordena os itens 
//import java.util.Collection; //"mãe" do list e do set
//import java.util.LinkedList; // bom quando for remover mas ruim para navegar pois sempre começa no primeiro objeto
import java.util.List; // "mãe" dos tipos de lista
//import java.util.Vector; //Thread safe


//<---o java.util.Vector, que é uma ArrayList thread safe
//a interface java.util.Collection que é a interface de todas as coleções
//as listas são sequencias que aceitam elementos duplicados
//os conjuntos (java.util.Set) também são coleções, mas não aceitam duplicados nem são listas --->

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
		List<Conta> lista = new ArrayList<Conta>();
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
