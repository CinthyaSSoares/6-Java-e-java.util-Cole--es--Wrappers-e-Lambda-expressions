package br.com.bytebank.modelo;

public class GuardarReferencias {
	
	private Conta[] referencias;
	private int posicaoLivre;
	
	public GuardarReferencias() {
		this.referencias = new Conta[10];
		this.posicaoLivre = 0;		
	}
	
	public void adiciona(Conta ref) {
		this.referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}

	public int getQuantidadeDeElementos() {
		return this.posicaoLivre;
	}

	public Conta getReferencia(int pos) {
		return this.referencias[pos];
	}
	
}
