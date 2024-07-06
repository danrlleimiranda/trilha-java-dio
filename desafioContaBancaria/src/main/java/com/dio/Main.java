package com.dio;

import com.dio.entity.Cliente;
import com.dio.entity.Conta;
import com.dio.entity.ContaCorrente;
import com.dio.entity.ContaPoupanca;

public class Main {

  public static void main(String[] args) {
    Cliente cliente1 = new Cliente();
    Cliente cliente2 = new Cliente();
    cliente1.setNome("Dan Miranda");
    cliente1.setCpf("000.000.000.01");
    cliente2.setNome("Dan Santos");
    cliente2.setCpf("000.000.000.01");
    Conta conta = new ContaCorrente(cliente1);
    Conta conta2 = new ContaPoupanca(cliente2);

    conta.depositar(1000.00d);
    System.out.println(conta.getSaldo());
    conta.transferir(500.00d, conta2);
    System.out.println(conta.getSaldo());
    System.out.println(conta2.getSaldo());
    conta.imprimirExtrato();
    conta2.imprimirExtrato();
  }
}