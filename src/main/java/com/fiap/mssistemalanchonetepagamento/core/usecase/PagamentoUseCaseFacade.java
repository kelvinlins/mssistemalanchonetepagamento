package com.fiap.mssistemalanchonetepagamento.core.usecase;

import com.fiap.mssistemalanchonetepagamento.core.model.Pagamento;

public interface PagamentoUseCaseFacade {
    Pagamento realizarPagamento(String codigoPedido);
}
