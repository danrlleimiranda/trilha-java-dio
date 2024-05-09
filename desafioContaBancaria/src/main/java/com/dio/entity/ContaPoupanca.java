package com.dio.entity;

import com.dio.interfaces.IConta;

public class ContaPoupanca extends Conta {


  public ContaPoupanca(Cliente cliente) {
    super(cliente);
  }

  @Override
  public void imprimirExtrato() {
    System.out.println("=== Extrato Conta Poupança ===");
    super.imprimirInfosComuns();
  }
}
