package br.com.bytebank.modelo;

public class ContaCorrente extends Conta implements Tributavel {

		//Pegando contrutor da classe mãe
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
	    double valorASacar = valor + 0.2;
	    super.saca(valorASacar);
	}

	@Override //Tributavel
	public double getValorImporto() {
		return super.saldo * 0.01;
	}
	
	@Override
	public String toString() {		
		return "Conta Corrente = " + super.toString();
	
	}
	
}
