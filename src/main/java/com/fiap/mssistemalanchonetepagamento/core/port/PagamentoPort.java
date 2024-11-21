package com.fiap.mssistemalanchonetepagamento.core.port;

import com.fiap.mssistemalanchonetepagamento.core.model.Pagamento;

public interface PagamentoPort {
    Pagamento realizarPagamento(String codigoPedido);
}
