package com.fiap.mssistemalanchonetepagamento.core.usecase.pagamento;

import com.fiap.mssistemalanchonetepagamento.core.exception.exception.PedidoNotFoundException;
import com.fiap.mssistemalanchonetepagamento.core.exception.exception.PedidoPagoException;
import com.fiap.mssistemalanchonetepagamento.core.exception.exception.PedidoSemProdutosException;
import com.fiap.mssistemalanchonetepagamento.core.model.Pagamento;
import com.fiap.mssistemalanchonetepagamento.core.port.PagamentoPort;
import com.fiap.mssistemalanchonetepagamento.core.usecase.PagamentoUseCaseFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

@Service
public class PagamentoUseCase implements PagamentoUseCaseFacade {

    private final PagamentoPort pagamentoPort;

    @Autowired
    public PagamentoUseCase(PagamentoPort pagamentoPort) {
        this.pagamentoPort = pagamentoPort;
    }

    @Override
    public Pagamento realizarPagamento(String codigoPedido) {

        if (ObjectUtils.isEmpty(codigoPedido))
            throw new PedidoNotFoundException();


        return pagamentoPort.realizarPagamento(codigoPedido);
    }
}
