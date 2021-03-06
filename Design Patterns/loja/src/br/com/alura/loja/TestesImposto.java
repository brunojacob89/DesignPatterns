package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.imposto.CalculadoraDeImposto;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.itemOrcamento;

public class TestesImposto {

	public static void main(String[] args) {
		
		Orcamento orcamento = new Orcamento();
		orcamento.adicionaItem(new itemOrcamento(new BigDecimal("100")));
		CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
		
		System.out.println(calculadora.calcular(orcamento, new ICMS(null)));
		System.out.println(calculadora.calcular(orcamento, new ICMS(new ISS(null))));
	}
}
