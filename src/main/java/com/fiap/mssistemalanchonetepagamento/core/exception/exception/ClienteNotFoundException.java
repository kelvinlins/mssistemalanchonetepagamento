package com.fiap.mssistemalanchonetepagamento.core.exception.exception;

public class ClienteNotFoundException extends NotFoundException{
  public ClienteNotFoundException(String codigo) {
    super("Cliente " + codigo + " não encontrado!");
  }
}
