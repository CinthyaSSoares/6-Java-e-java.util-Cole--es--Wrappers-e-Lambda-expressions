package br.com.bytebank.modelo;

public class CalculadorDeImposto {
	
	private double totalImposto;
	
	public void registra(Tributavel t) {
		double valor = t.getValorImporto();
		this.totalImposto += valor;
	}
	public double getTotalImposto() {
		return totalImposto;
	}
}
