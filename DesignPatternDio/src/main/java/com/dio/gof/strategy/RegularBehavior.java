package com.dio.gof.strategy;

public class RegularBehavior implements Behavior {

  @Override
  public void move() {
    System.out.println("Movendo-se normalmente");
  }
}
