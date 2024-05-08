package com.dio.entity;

import com.dio.interfaces.IConta;

public class ContaPoupanca implements IConta {

  private Double saldo;
  private String conta;

  @Override
  public void sacar(Double valor) {

  }

  @Override
  public void mostralExtrato() {

  }

  @Override
  public void transferir(Double valor, IConta conta) {

  }
}
