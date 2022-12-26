package br.com.bytebank.modelo;

public class ContaPoupanca extends Conta {
	
	//Pegando contrutor da classe mãe
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public String toString() {		
		return "Conta Poupança = " + super.toString();
	
	}
	
}
