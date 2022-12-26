package br.com.bytebank.teste;

public class TesteString {
	
	public static void main(String[] args) {
		
		// --------- Classe String ----------------------------------
			//São a mesma coisa:
			//String outroNome = new String("Mel");
			String nome = "Neguinha"; //forma mais prática "object literal"		
			
			// Classe String são imutáveis. Isso significa que, uma vez criado, não pode ser alterado, por isso qualquer alteração cria um novo objeto String.
			
			
			//----- .replace(a,cc); ---------------
			
			//nome.replace("N", "nnnn"); Não muda pois a String "nasce e morre do mesmo jeito", ela não muda. 
			
			String outra = nome.replace("N", "nnnn"); //Usando a String original e fazendo outra para mudá-la 
			
			System.out.println("String original: " + nome);
			System.out.println("String redefinida: " + outra);
		
		
		//------------- .indexOf(diferentes parametros) ----------------
			
			int pos = nome.indexOf("gu");
			
			System.out.println("Posição do caractere 'gu': " + pos);
		
		//------------- .charAt(); -----------------------
		
				char n = nome.charAt(2);
				
				// Posições começam com 0
				//Ex: 0,1,2,3,4,5,6,7
				//    N,E,G,U,I,N,H,A
				
				System.out.println("Caractere na posição 2: " + n);
				
				// Um "char" é um único caractere e apenas com aspas simples 'b'
				
				char b = 'B';
				
				System.out.println("Char: " + b);
				
		//---------- .substring( vários parametros) ---------------
				
				String sub = nome.substring(5);
				
				System.out.println("Substring posição 5: " + sub);
				
		//------------- .length() -------------------------------
				
				//Como saber o tamanho do objeto
				
			System.out.println("Tamanho de 'Neguinha': " + nome.length());
			
			// Imprimindo a cada caractere separado:
			
			for(int i = 0; //posição inicial
					i < nome.length(); // separando
					i++) { //adicionando cada caractere
				
				System.out.println(nome.charAt(i));
			}
			
		//--------------- .isEmpty() ------------------
			
			// Devolve como boleano (true / false) se a String está vazia
			
		String emBranco = "  alura  "; 
		
		System.out.println("Vazio?: " + emBranco.isEmpty());
		
		//-------------- .trim() ------------------------
		
		// tira os espaços 
		
		String vazio = emBranco.trim();
		
		System.out.println("Vazio?: " + vazio);
		
		//-------- StringBuilder -----------------------
		
		//O StringBuilder é uma classe comum.
		//Repare que usamos o new para a criação do objeto.
		//Além disso, como o objeto é mutável, utilizamos a mesma referência, sem novas atribuições.
		
		StringBuilder builder = new StringBuilder("Socorram");
		
		builder.append("-");
		builder.append("me");
		builder.append(", ");
		builder.append("subi ");
		builder.append("no ");
		builder.append("ônibus ");
		builder.append("em ");
		builder.append("Marrocos");
		
		String texto = builder.toString();
		System.out.println(texto);
		
		// Desmenbrando o System.out.println() -------------------------
		
//		 ~ System
//		- Classe java.lan, acesso publico (public);
//		
//		 ~ out
//		 - Atributo, publico, referencia, static;
//		 
//		 ~ println
//		 - Metodo, publico, não é static, sobrecarga(vários parametros),
//		 não joga exceções do tipo checked.
//		
		
		
	}

}
