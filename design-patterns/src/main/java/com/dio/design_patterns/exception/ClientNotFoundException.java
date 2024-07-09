package com.dio.design_patterns.exception;

public class ClientNotFoundException extends NotFoundException{

  public ClientNotFoundException() {
    super("Cliente não encontrado");
  }
}
