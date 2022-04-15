package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

public class SalvaPedidoNoBancoDeDados implements AcaoAposGerarPedido {

	public void excutarAcao(Pedido pedido) {
		
		System.out.println("Salva Pedido no Banco de Dados");
	}
}
