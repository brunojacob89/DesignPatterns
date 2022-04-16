package br.com.alura.loja;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.Pedido;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.LogDePedido;
import br.com.alura.loja.pedido.acao.SalvaPedidoNoBancoDeDados;

public class TestesPedidos {

	public static void main(String[] args) {

		String cliente = "Bruno";
		BigDecimal valorOrcamento = new BigDecimal("600");
		int quantidadeItens = Integer.parseInt("4");
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler(
				Arrays.asList(new EnviarEmailPedido(),
							new SalvaPedidoNoBancoDeDados(),
							new LogDePedido()
							));
		handler.execute(gerador);
	}

}
