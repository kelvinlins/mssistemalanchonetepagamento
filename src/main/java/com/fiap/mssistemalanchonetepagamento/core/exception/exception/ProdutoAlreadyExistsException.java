package com.fiap.mssistemalanchonetepagamento.core.exception.exception;

public class ProdutoAlreadyExistsException extends AlreadyExistsException{
    public ProdutoAlreadyExistsException(String codigo) {
        super("Produto " + codigo + " ja possui cadastro!");
    }
}
