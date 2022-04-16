package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class itemOrcamento implements Orcavel {
	
	private BigDecimal valor;

	public itemOrcamento(BigDecimal valor) {
		this.valor = valor;
	}
	
	public BigDecimal getValor() {
		return valor;
	}
	

}
