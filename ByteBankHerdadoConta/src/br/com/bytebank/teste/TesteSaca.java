package br.com.bytebank.teste;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.SaldoInsuficienteException;

public class TesteSaca {

    public static void main(String[] args) {
    	
        Conta conta = new ContaCorrente(123, 321);
        conta.deposita(200.0);

        try {
            conta.saca(210.0);
        } catch(SaldoInsuficienteException ex) {
            System.out.println("Exception: " + ex.getMessage());
            ex.printStackTrace();
        }
        System.out.println(conta.getSaldo());
    }
}