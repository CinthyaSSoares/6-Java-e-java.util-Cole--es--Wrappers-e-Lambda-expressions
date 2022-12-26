package br.com.bytebank.modelo;

public abstract class Conta {
	
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;
    
    /**
     * Essa classe representa as ações da conta base de um cliente
     * 
	 * @author Cinthya Soares
	 * 
	 * @param agencia
	 * @param numero
	 */
        
    public Conta(int agencia, int numero) {
    	Conta.total++;
    	System.out.println("O total de contas é " + Conta.total);
    	this.agencia = agencia;
    	this.numero = numero;
    	System.out.println("Criando uma nova conta " + this.numero);
    }
    
    public void deposita(double valor) {
    	this.saldo += valor;
    }
    
    /**
    * Valor precisa ser menor ou igual ao saldo
    * @param valor 
    * @throws SaldoInsuficienteException
    */
    
    public void saca(double valor) throws SaldoInsuficienteException{

        if(this.saldo < valor) {
            throw new SaldoInsuficienteException("Erro!! Saldo: R$" + this.saldo + ", Valora ser sacado R$" + valor);
        } 

        this.saldo -= valor;       
}
    
    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
        this.saca(valor);
        destino.deposita(valor);
    }
       
    // Fazendo os Getters e Setters:
    
    public double getSaldo() {
    	return this.saldo;
    }
    
    public int getNumero() {
    	return this.numero;
    }
    
    public void setNumero(int numero) {
    	if(numero <= 0) {
    		System.out.println("Não é permitido valor 0 ou menor");
    		return;
    	}
    	this.numero = numero;
    }
    
    public int getAgencia() {
		return this.agencia;
	}
    
    public void setAgencia(int agencia) {
    	if(agencia <= 0) {
    		System.out.println("Não é permitido valor 0 ou menor");
    		return;
    	}
		this.agencia = agencia;
	}
    
    public void setTitular(Cliente titular) {
		this.titular = titular;
	}
    
    public Cliente getTitular() {
		return titular;
	}
    
    public static int getTotal() {
    	return Conta.total;    	
    }
    
    @Override
	public String toString() {		
		return "Número: " + this.numero + ", Agencia: " + this.agencia;
	
	}
}