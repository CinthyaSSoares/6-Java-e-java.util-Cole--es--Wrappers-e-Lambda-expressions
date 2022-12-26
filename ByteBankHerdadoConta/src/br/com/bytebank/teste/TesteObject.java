package br.com.bytebank.teste;

import br.com.bytebank.modelo.Cliente;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupanca;

public class TesteObject {

		public static void main(String[] args) {
			
			Object cc = new ContaCorrente(11,22);
			Object cp = new ContaPoupanca(33,44);
			
			//Object cliente = new Cliente();
			
			System.out.println(cc.toString());
			System.out.println(cp.toString());
			
		}
}
