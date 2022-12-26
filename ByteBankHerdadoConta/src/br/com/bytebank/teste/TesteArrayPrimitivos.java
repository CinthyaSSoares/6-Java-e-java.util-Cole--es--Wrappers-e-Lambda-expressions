package br.com.bytebank.teste;

public class TesteArrayPrimitivos {
	
	// Arraya []
	public static void main(String[] args) {
		
		int[] idades = new int[5]; // Inicializa array com 0
	// Posição começa com 0
		
//		idades[0] = 5;
//		idades[1] = 15;
//		idades[2] = 25;
//		idades[3] = 35;
//		idades[4] = 45;
//		
//		int idade1 = idades [5];
//		
		//System.out.println(idades.length);
		
		for ( int i = 0; i < idades.length; i ++) {
			idades[i] = i * i;
		}
		
		for ( int i = 0; i < idades.length; i ++) {
			System.out.println(idades[i]);;
		}
		
		
	}

}
