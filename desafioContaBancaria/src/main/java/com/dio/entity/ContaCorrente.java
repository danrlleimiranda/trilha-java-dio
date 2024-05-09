package com.dio.entity;

import com.dio.interfaces.IConta;

/**
 * The type Conta corrente.
 */
public class ContaCorrente extends Conta {

  /**
   * Instantiates a new Conta corrente.
   *
   * @param cliente the cliente
   */
  public ContaCorrente(Cliente cliente) {
    super(cliente);
  }

  @Override
  public void imprimirExtrato() {
    System.out.println("=== Extrato Conta Corrente ===");
    super.imprimirInfosComuns();
  }

}
