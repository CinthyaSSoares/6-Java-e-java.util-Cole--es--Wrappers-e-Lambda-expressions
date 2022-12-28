package br.com.bytebank.teste;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.GuardarReferencias;

public class TesteGuardarRef {
	
	public static void main(String[] args) {
		GuardarReferencias guardando = new GuardarReferencias();
		
		Conta cc = new ContaCorrente(55,66);
		guardando.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(77,88);
		guardando.adiciona(cc2);
		
		int tamanho = guardando.getQuantidadeDeElementos();
		System.out.println("Posições livres: " + tamanho);
		
		Conta ref = (Conta) guardando.getReferencia(0);
		System.out.println(ref.getNumero());
	}

}
