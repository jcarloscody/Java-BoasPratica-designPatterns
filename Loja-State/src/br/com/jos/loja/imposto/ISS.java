package br.com.jos.loja.imposto;

import java.math.BigDecimal;

import br.com.jos.loja.orcamento.Orcamento;

public class ISS {
	
	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.06"));
	}

}
