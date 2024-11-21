package com.fiap.mssistemalanchonetepagamento.core.exception.exception;

public class ProdutoNotFoundException extends NotFoundException{
  public ProdutoNotFoundException(String codigo) {
    super("Produto " + codigo + " não encontrado!");
  }
}
