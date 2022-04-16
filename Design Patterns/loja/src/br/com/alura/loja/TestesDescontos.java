package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.imposto.CalculadoraDeImposto;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.imposto.Imposto;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.itemOrcamento;

public class TestesDescontos {

	public static void main(String[] args) {

		Orcamento primeiro = new Orcamento();
		primeiro.adicionaItem(new itemOrcamento(new BigDecimal("200")));
		Orcamento segundo = new Orcamento();
		segundo.adicionaItem(new itemOrcamento(new BigDecimal("1000")));
		Orcamento terceiro = new Orcamento();
		terceiro.adicionaItem(new itemOrcamento(new BigDecimal("500")));
		
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		BigDecimal calcular = calculadora.calcular(primeiro);
		BigDecimal calcular2 = calculadora.calcular(segundo);
		BigDecimal calcular3 = calculadora.calcular(terceiro);
		
		System.out.println(calcular);
		System.out.println(calcular2);
		System.out.println(calcular3);

		
	}

}
