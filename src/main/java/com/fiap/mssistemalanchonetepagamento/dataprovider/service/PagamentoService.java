package com.fiap.mssistemalanchonetepagamento.dataprovider.service;

import com.fiap.mssistemalanchonetepagamento.core.model.Pagamento;
import com.fiap.mssistemalanchonetepagamento.core.port.PagamentoPort;
import org.springframework.stereotype.Service;

@Service
public class PagamentoService implements PagamentoPort {
    @Override
    public Pagamento realizarPagamento(String codigoPedido) {
        return Pagamento.builder() //retorno mockado sem integração
                .aprovado(Boolean.TRUE)
                .build();
    }
}
