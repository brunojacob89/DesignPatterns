package br.com.alura.loja.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.itemOrcamento;
import br.com.alura.loja.pedido.acao.AcaoAposGerarPedido;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvaPedidoNoBancoDeDados;

public class GeraPedidoHandler {
	
	private List<AcaoAposGerarPedido> acoes;
		
	// injecao de dependencias pra servicos infra
	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
		this.acoes = acoes;
	}


	public void execute(GeraPedido dados) {
		
		Orcamento orcamento = new Orcamento();
		orcamento.adicionaItem(new itemOrcamento(new BigDecimal("200")));		
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		
		acoes.forEach(a -> a.excutarAcao(pedido));
		
	}

}
