package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.CalculadorDeImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteTributaveis {

	public static void main(String[] args) {
		
		ContaCorrente cc= new ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		SeguroDeVida seguro= new SeguroDeVida();
		
		CalculadorDeImposto calculo = new CalculadorDeImposto();
		calculo.registra(cc);
		calculo.registra(seguro);
		
		System.out.println(calculo.getTotalImposto());
	}
	
		

}
