package com.dio.entity;

import com.dio.interfaces.IConta;

public class ContaCorrente implements IConta {

  private Double saldo;
  private String conta;

  public ContaCorrente(Double saldo, String conta) {
    this.saldo = saldo;
    this.conta = conta;
  }

  public String getConta() {
    return conta;
  }

  public void setConta(String conta) {
    this.conta = conta;
  }

  public Double getSaldo() {
    return saldo;
  }

  public void setSaldo(Double saldo) {
    this.saldo = saldo;
  }

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
