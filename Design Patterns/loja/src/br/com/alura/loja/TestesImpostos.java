package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.imposto.CalculadoraDeImposto;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.imposto.Imposto;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesImpostos {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
		CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
		BigDecimal calcular = calculadora.calcular(orcamento, new ISS());
		System.out.println(calcular);
		
	}

}
