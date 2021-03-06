package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.imposto.CalculadoraDeImposto;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.imposto.Imposto;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.itemOrcamento;

public class TestesImpostos {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento();
		orcamento.adicionaItem(new itemOrcamento(new BigDecimal("100")));
		CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
		BigDecimal calcular = calculadora.calcular(orcamento, new ISS(null));
		System.out.println(calcular);
		
	}

}
