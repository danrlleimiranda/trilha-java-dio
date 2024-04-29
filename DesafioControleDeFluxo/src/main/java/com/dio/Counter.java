package com.dio;

import java.util.Scanner;

public class Counter {

  public static void main(String[] args) {

// TODO: Inicialize um bloco try-catch para capturar exceções:

    try (Scanner scanner = new Scanner(System.in)) {
      String conta = scanner.nextLine();
      verificarNumeroConta(conta);
    } catch (IllegalArgumentException e) {
      System.out.println("Erro: " + e.getMessage());
    }
  }

  // Declaração do método verificarNumeroConta, que verifica se o número de conta tem exatamente 8 dígitos:
  private static void verificarNumeroConta(String numeroConta) throws IllegalArgumentException {

    // TODO: Verifique se o número da conta tem exatamente 8 dígitos:
    if (numeroConta.length() != 8) {
      throw new IllegalArgumentException("Erro: Numero de conta invalido. Digite exatamente 8 digitos.");
    }

    System.out.println("Numero de conta valido.");
    // TODO: Implemente uma exceção do tipo IllegalArgumentException, caso o número de conta não tenha 8 dígitos:

  }
}


public class IllegalArgumentException extends Exception {
  public IllegalArgumentException(String message) {
    super(message);
  }
}