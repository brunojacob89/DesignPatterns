package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.imposto.CalculadoraDeImposto;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.imposto.Imposto;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesDescontos {

	public static void main(String[] args) {

		Orcamento primeiro = new Orcamento(new BigDecimal("200"), 6);
		Orcamento segundo = new Orcamento(new BigDecimal("1000"), 1);
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		BigDecimal calcular = calculadora.calcular(primeiro);
		BigDecimal calcular2 = calculadora.calcular(segundo);
		System.out.println(calcular);
		System.out.println(calcular2);

		
	}

}
