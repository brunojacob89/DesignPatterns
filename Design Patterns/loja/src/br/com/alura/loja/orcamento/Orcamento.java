package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.situacao.EmAnalise;
import br.com.alura.loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento {
	
	private BigDecimal valor;
	private int quantidadeDeItens;
	private SituacaoOrcamento situacao;
	
		
	public Orcamento(BigDecimal valor, int quantidadeDeItens) {
		this.valor = valor;
		this.quantidadeDeItens = quantidadeDeItens;
		this.situacao = new EmAnalise();
	}
	
	public void aplicarDescontoExtra() {
		BigDecimal ValorDoDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
		this.valor = this.valor.subtract(ValorDoDescontoExtra);
	}

	public void aprovar() {
		this.situacao.aprovar(this);
	}
	
	public void reprovar() {
		this.situacao.reprovar(this);
	}
	
	public void finalizar() {
		this.situacao.finalizar(this);
	}
	
	public BigDecimal getValor() {
		return valor;
	}
	
	public int getQuantidadeDeItens() {
		return quantidadeDeItens;
	}
	
	public SituacaoOrcamento getSituacao() {
		return situacao;
	}
	
	public void setSituacao(SituacaoOrcamento situacao) {
		this.situacao = situacao;
	}

}
