package com.dio;

import com.dio.exception.InvalidParamsException;
import java.util.Scanner;

public class Counter {

  public static void main(String[] args) throws InvalidParamsException {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Insira o primeiro parâmetro: ");
    int parameterOne = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Insira o segundo parâmetro: ");
    int parameterTwo = scanner.nextInt();

    try {
      counter(parameterOne, parameterTwo);
    } catch (InvalidParamsException exception) {
      System.out.println(exception.getMessage());
    }
  }

  public static void counter(int parameterOne, int parameterTwo) throws InvalidParamsException {

    if (parameterOne > parameterTwo) {
      throw new InvalidParamsException("O segundo parâmetro deve ser maior que o primeiro");
    }

    int loops = parameterTwo - parameterOne;

    for (int index = 1; index <= loops; index++) {
      System.out.printf("Imprimindo o número %s", index);
      System.out.println();
    }
  }
}